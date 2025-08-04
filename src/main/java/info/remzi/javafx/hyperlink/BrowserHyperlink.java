package info.remzi.javafx.hyperlink;

import javafx.scene.Node;
import javafx.scene.control.Hyperlink;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Drop-in replacement for JavaFX {@code Hyperlink}
 * that always opens {@code url} in the system browser.
 *
 * @author Remzi Cavdar - ict@remzi.info
 */
public class BrowserHyperlink extends Hyperlink {
    private static final Logger LOG = Logger.getLogger(BrowserHyperlink.class.getName());

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
     * @throws NullPointerException if url is null
     */
    public void setUrl(String url) {
        Objects.requireNonNull(url, "url");
        setOnAction(e -> {
            try {
                URI uri = new URI(url);

                if (Desktop.isDesktopSupported()
                        && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    Desktop.getDesktop().browse(uri);
                } else {
                    LOG.warning("Desktop browse action is not supported on this platform; cannot open: " + uri);
                }

            } catch (URISyntaxException ex) {
                LOG.log(Level.WARNING, "Invalid URL: " + url, ex);
            } catch (IOException ex) {
                LOG.log(Level.WARNING, "Failed to open browser for URL: " + url, ex);
            } catch (SecurityException ex) {
                LOG.log(Level.WARNING, "Permission denied to open URL: " + url, ex);
            }
        });
    }
}