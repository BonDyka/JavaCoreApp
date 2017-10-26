package loc.abondarev.app.events.types;

import loc.abondarev.app.events.Event;

/**
 * @author abondarev.
 * @since 24.10.2017.
 */
public class MouseButtonEvent extends Event {

    private int keyCode;

    private  int x, y;

    protected MouseButtonEvent(Type type, int keyCode, int x, int y) {
        super(type);
        this.keyCode = keyCode;
        this.x = x;
        this.y = y;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
