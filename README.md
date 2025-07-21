# BrowserHyperlink

[![Maven Central](https://img.shields.io/maven-central/v/info.remzi/javafx-hyperlink.svg)](https://central.sonatype.com/artifact/info.remzi/javafx-hyperlink)
![License](https://img.shields.io/github/license/Remzi1993/javafx-hyperlink.svg)

A tiny **Java/JavaFX** utility that subclasses `javafx.scene.control.Hyperlink` and automatically opens the given URL in the user’s default browser.

---

## Features

* **Drop‑in replacement** for the standard `Hyperlink`
* No extra dependencies—just JavaFX itself
* Works on all desktop platforms supported by JavaFX

---

## Requirements

| Tool       | Version         |
|------------|-----------------|
| **JDK**    | 22 or newer     |
| **JavaFX** | 24.0.2 or newer |

---

## Installation

### Maven

```xml
<dependencies>
    <!-- JavaFX BrowserHyperlink -->
    <dependency>
        <groupId>info.remzi</groupId>
        <artifactId>javafx-hyperlink</artifactId>
        <version>1.0.0</version>
    </dependency>

    <!-- JavaFX -->
    <dependency>
        <groupId>org.openjfx</groupId>
        <artifactId>javafx-controls</artifactId>
        <version>24.0.2</version>
    </dependency>
</dependencies>