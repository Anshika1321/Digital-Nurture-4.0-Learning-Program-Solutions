# Logging using SLF4J

This folder contains an example demonstrating how to log messages using **SLF4J** with Logback.

## ✅ Exercise: Logging Error and Warning Messages
- File: `LoggingExample.java`
- Logs:
  - Error message
  - Warning message

## ✅ Output
- Screenshot file `LoggingExample_output.png` shows the runtime log output.

---

### Dependencies (in `pom.xml`)
```xml
<dependency>
  <groupId>org.slf4j</groupId>
  <artifactId>slf4j-api</artifactId>
  <version>1.7.30</version>
</dependency>
<dependency>
  <groupId>ch.qos.logback</groupId>
  <artifactId>logback-classic</artifactId>
  <version>1.2.3</version>
</dependency>
