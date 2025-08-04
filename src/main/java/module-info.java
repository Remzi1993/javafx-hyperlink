/**
 * This module descriptor defines the module for the JavaFX Hyperlink component.
 * It requires the javafx.controls module for UI controls and java.desktop for desktop-related functionalities.
 * The package info.remzi.javafx.hyperlink is exported for use by other modules.
 */
module info.remzi.javafx.hyperlink {
    requires javafx.controls;
    requires java.desktop;
    requires java.logging;
    exports info.remzi.javafx.hyperlink;
}