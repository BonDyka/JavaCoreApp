package loc.abondarev.app.events.types;

import loc.abondarev.app.events.Event;

/**
 * @author abondarev.
 * @since 24.10.2017.
 */
public class MouseReleasedEvent extends MouseButtonEvent {
    public MouseReleasedEvent(int keyCode, int x, int y) {
        super(Type.MOUSE_RELEASED, keyCode, x, y);
    }
}
