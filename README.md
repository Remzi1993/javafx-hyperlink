# BrowserHyperlink

[![Maven Central](https://img.shields.io/maven-central/v/info.remzi/javafx-hyperlink.svg)](https://central.sonatype.com/artifact/info.remzi/javafx-hyperlink) [![MIT License](https://img.shields.io/github/license/Remzi1993/javafx-hyperlink.svg)](https://github.com/Remzi1993/javafx-hyperlink/blob/main/LICENSE)

> A drop‑in **Java / JavaFX** replacement for  
> `javafx.scene.control.Hyperlink` that always opens its target URI—`http`, `https`, `mailto`, custom schemes—in the
> user’s default browser.

---

## ✨ Features

* **Plug & play** – use exactly like the standard `Hyperlink`
* Handles `mailto:` (incl. `?subject=`) and any other URI scheme
* Zero runtime dependencies beyond **JavaFX**

---

## 🔧 Requirements

| Tool        | Minimum version |
|-------------|-----------------|
| **SDK/JDK** | 22              |
| **JavaFX**  | 24.0.2          |

---

## 📦 Usage

```xml
<dependency>
    <groupId>info.remzi</groupId>
    <artifactId>javafx-hyperlink</artifactId>
    <version>1.0.1</version>
</dependency>
```

## 🚀 Quick start examples

```java
import info.remzi.javafx.hyperlink.BrowserHyperlink;

/* Regular link */
BrowserHyperlink repo = new BrowserHyperlink("Source code", "https://github.com/Remzi1993/HvA-OOP2-practicumopdracht");

/* Clickable e‑mail address */
BrowserHyperlink email = new BrowserHyperlink("remzi.cavdar@hva.nl", "mailto:remzi.cavdar@hva.nl");

/* mailto: with pre‑filled subject */
BrowserHyperlink support = new BrowserHyperlink("Mail support", "mailto:support@example.com?subject=Hello%20BrowserHyperlink");
```

## 🛠️ Developing / releasing the library

1. Insert your GPG key fingerprint in pom.xml ```<keyname>YOUR_40_HEX_FINGERPRINT</keyname>```
2. Build & publish to Maven Central:
   ```bash
   ./mvnw clean deploy
   ```
## 🤝 Contributing
1. Fork → feature branch → PR.
2. Follow conventional commits (feat:, fix:, etc.).
3. Ensure ```mvn verify``` stays green and add Javadoc for new APIs.

## 📄 License
This project is licensed under the [MIT License](https://github.com/Remzi1993/javafx-hyperlink/blob/main/LICENSE)