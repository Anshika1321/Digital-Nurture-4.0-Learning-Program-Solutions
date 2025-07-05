# Exercise 7: Implementing Constructor and Setter Injection

## Objective
Demonstrate both constructor and setter-based dependency injection using Spring Core and XML configuration.

## Technologies
- Java
- Spring Core
- XML-based Bean Configuration

## Setup & Run

1. Navigate to the `LibraryManagement` project folder.
2. Open the project in your IDE (e.g., IntelliJ, Eclipse).
3. All Java classes, the main class, `applicationContext.xml`, and `pom.xml` related to **this exercise** are located inside the `code` folder
4. Verify that `applicationContext.xml` is properly configured with:
- `<constructor-arg>` and
- `<property>` for the `BookService` bean.
5. Run the main class:
com.library.main.LibraryManagementApplication
6. Expected output should show console logs like:
BookService: Performing operation...
BookRepository: Book saved!

## Folder Structure

- `code/` – Contains all the Java classes, Spring configuration file (`applicationContext.xml`), and the `pom.xml` specific to this exercise.
- `output/` – Contains the screenshot(s) or result images of the console/output for verification.
- `LibraryManagement/` – The root project folder that holds everything for this exercise as a working Spring application.

## Notes
- This exercise demonstrates **both constructor and setter injection** using Spring’s XML configuration.
- You can modify and test injection types by editing `applicationContext.xml`.
