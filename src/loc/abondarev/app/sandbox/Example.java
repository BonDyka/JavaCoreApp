package loc.abondarev.app.sandbox;

import loc.abondarev.app.events.Dispatcher;
import loc.abondarev.app.events.Event;
import loc.abondarev.app.events.types.MouseMotionEvent;
import loc.abondarev.app.events.types.MousePressedEvent;
import loc.abondarev.app.events.types.MouseReleasedEvent;
import loc.abondarev.app.layers.Layer;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Point;

import java.util.Random;

/**
 * @author abondarev.
 * @since 24.10.2017.
 */
public class Example extends Layer {

        private String name;
        private Color color;
        private Rectangle rect;
        private boolean dragging = false;
        private int px, py;

        private static final Random random = new Random();

	public Example(String name, Color color) {
        this.name = name;
        this.color = color;

        rect = new Rectangle(random.nextInt(100) + 150, random.nextInt(100) + 250, 120, 240);

    }

    public void onEvent(Event event) {
        Dispatcher dispathcer = new Dispatcher(event);
        dispathcer.dispatch(Event.Type.MOUSE_PRESSED, (Event e) -> onPressed((MousePressedEvent) e));
        dispathcer.dispatch(Event.Type.MOUSE_RELEASED, (Event e) -> onReleased((MouseReleasedEvent) e));
        dispathcer.dispatch(Event.Type.MOUSE_MOVED, (Event e) -> onMoved((MouseMotionEvent) e));

    }

    public void onRender(Graphics g) {
        g.setColor(color);
        g.fillRect(rect.x, rect.y, rect.width, rect.height);

        g.setColor(Color.WHITE);
        g.drawString(name, rect.x + 15, rect.y + 35);
    }

    private boolean onPressed(MousePressedEvent event) {
        if (rect.contains(new Point(event.getX(), event.getY())))
            dragging = true;
        return false;
    }

    private boolean onReleased(MouseReleasedEvent event) {
        dragging = false;
        return dragging;
    }

    private boolean onMoved(MouseMotionEvent event) {

        if (dragging) {
            rect.x += event.getX() - px;
            rect.y += event.getY() - py;
        }
        px = event.getX();
        py = event.getY();

        return false;
    }
}
