package info.remzi.javafx.hyperlink;

import javafx.scene.Node;
import java.awt.Desktop;
import java.net.URI;

/**
 * Drop-in replacement for JavaFX {@code Hyperlink}
 * that always opens {@code url} in the system browser.
 *
 * @author Remzi Cavdar - ict@remzi.info
 */
public class BrowserHyperlink extends javafx.scene.control.Hyperlink {

    /**
     * Default constructor for BrowserHyperlink.
     * Initializes a new instance of the BrowserHyperlink class.
     */
    public BrowserHyperlink() {
        super();
    }

    /**
     * Constructor for BrowserHyperlink with text and URL.
     *
     * @param text The text to display in the hyperlink.
     * @param url  The URL to open when the hyperlink is clicked.
     */
    public BrowserHyperlink(String text, String url) {
        super(text);
        setUrl(url);
    }

    /**
     * Constructor for BrowserHyperlink with text, graphic, and URL.
     *
     * @param text    The text to display in the hyperlink.
     * @param graphic The graphic to display alongside the text.
     * @param url     The URL to open when the hyperlink is clicked.
     */
    public BrowserHyperlink(String text, Node graphic, String url) {
        super(text, graphic);
        setUrl(url);
    }

    /**
     * Sets the URL for the hyperlink and defines the action to open it in the system browser.
     *
     * @param url The URL to open when the hyperlink is clicked.
     */
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