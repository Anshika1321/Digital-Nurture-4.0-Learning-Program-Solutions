# Spring REST using Spring Boot 3 Exercises – `1.spring-rest-hands-on`

# 1.Spring REST Hands-on Exercises

## ✅ Overview

This repository contains the completed solutions for two Spring Boot hands-on exercises.  
All work has been implemented in a single Maven-based Spring Boot project named **`spring-learn`**, which is fully functional and successfully built and run.

The repository is organized into clearly separated folders for easy access and verification of code and output for each hands-on.

---

## 📁 Project Structure

📁 1.spring-rest-handson
        ├── 📁 handson1
        │   ├── 📁 code
        │   └── 📁 output
        │       ├── 🖼️ build-success-terminal-output.png
        │       └── 🖼️ console-output.png
        ├── 📁 handson2
        │   ├── 📁 code
        │   └── 📁 output
        │       ├── 🖼️ console-output.png     
        ├── 📁 spring-learn  # Full working project for handson1 & handson2
        └── 📄 README.md
---

## 🧪 Hands-On Exercises

### 🔹 Hands-On 1: Create a Spring Web Project Using Maven

#### ✅ What was done:

- Created a Spring Boot project using Spring Initializr.

- Group: `com.cognizant`

- Artifact: `spring-learn`

- Dependencies: `Spring Web`, `Spring Boot DevTools`

- Edited the main class `SpringLearnApplication.java` to add:
  - Logging inside the `main()` method

- Verified the build using Maven:
  mvn clean package -Dhttp.proxyHost=proxy.cognizant.com -Dhttp.proxyPort=6050 -Dhttps.proxyHost=proxy.cognizant.com -Dhttps.proxyPort=6050 -Dhttp.proxyUser=123456

✅ Output and success confirmation are provided in the Hands On 1/output/ folder.

📂 Folder Details:
-Hands On 1/code/: Contains edited SpringLearnApplication.java

-Hands On 1/output/: Contains screenshots of:

  -Build success

  -Console output showing "Inside main"

### 🔹 Hands-On 2: Spring Core – Load SimpleDateFormat from Spring Configuration XML 


✅ What was done:
-Added a date-format.xml file under src/main/resources

-Defined a bean of type SimpleDateFormat with pattern dd/MM/yyyy

-Added displayDate() method in SpringLearnApplication.java:

-Loaded the XML config using ClassPathXmlApplicationContext

-Retrieved the date format bean

-Parsed a string to date and logged the result

✅ Output confirming the parsed date is included

📂 Folder Details:

-Hands On 2/code/: Contains:

  -Updated SpringLearnApplication.java

  -date-format.xml

-Hands On 2/output/: Contains parsed date log screenshot

🛠 Build & Run Instructions

▶️ Build with proxy:

mvn clean package -Dhttp.proxyHost=proxy.cognizant.com -Dhttp.proxyPort=6050 -Dhttps.proxyHost=proxy.cognizant.com -Dhttps.proxyPort=6050 -Dhttp.proxyUser=123456

▶️ Run from Eclipse:

Right-click on SpringLearnApplication.java
→ Run As → Java Application

✅ Conclusion
Both Hands-on 1 and Hands-on 2 were completed successfully in the spring-learn project.
Separate folders (Hands On 1/ and Hands On 2/) include the specific code and output evidence for each hands-on task.
This structure ensures clear traceability between the project work and the assigned hands-on objectives.

