package loc.abondarev.app;

import loc.abondarev.app.sandbox.Example;
import loc.abondarev.app.core.Window;

import java.awt.Color;

/**
 * @author abondarev.
 * @since 24.10.2017.
 */
public class Main {
    public static void main(String[] args) {

        Window window = new Window("Window", 960, 640);
        window.addLayer(new Example("Layer-1", Color.BLUE));
        window.addLayer(new Example("Layer-2", Color.RED));
    }
}
