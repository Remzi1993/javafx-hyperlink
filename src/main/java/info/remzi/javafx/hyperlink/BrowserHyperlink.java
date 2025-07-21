package info.remzi.javafx.hyperlink;

import javafx.scene.Node;
import java.awt.Desktop;
import java.net.URI;

/**
 * JavaFX Hyperlink that opens the target URL in the system browser.
 */
public class BrowserHyperlink extends javafx.scene.control.Hyperlink {
    public BrowserHyperlink() {
    }

    public BrowserHyperlink(String text, String url) {
        super(text);
        setUrl(url);
    }

    public BrowserHyperlink(String text, Node graphic, String url) {
        super(text, graphic);
        setUrl(url);
    }

    public void setUrl(String url) {
        setOnAction(e -> {
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().browse(new URI(url));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}