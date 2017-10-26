package loc.abondarev.app.events.types;

import loc.abondarev.app.events.Event;

/**
 * @author abondarev.
 * @since 24.10.2017.
 */
public class MousePressedEvent extends MouseButtonEvent {
    public MousePressedEvent(int keyCode, int x, int y) {
        super(Event.Type.MOUSE_PRESSED, keyCode, x, y);
    }
}
