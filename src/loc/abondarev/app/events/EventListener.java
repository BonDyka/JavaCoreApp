package loc.abondarev.app.events;

import loc.abondarev.app.events.Event;

/**
 * @author abondarev.
 * @since 24.10.2017.
 */
public interface EventListener {

    void onEvent(Event e);
}
