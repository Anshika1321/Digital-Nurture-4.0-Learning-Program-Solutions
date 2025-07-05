# Exercise 5: Configuring the Spring IoC Container

## 📋 Objective
Configure the Spring IoC container using XML-based configuration for a basic Library Management system.

This exercise helps in understanding how to:
- Define beans in XML.
- Use Spring's `ApplicationContext` to manage dependencies.
- Perform setter-based injection.

---

## 🧾 Scenario (As per exercise)
The library management application requires a central configuration for beans and dependencies.

### 🪜 Steps Followed:

1. **Created Spring Configuration File**  
   - `applicationContext.xml` placed in `src/main/resources` (or `code/` for reference).
   - Defined beans for `BookService` and `BookRepository`.

2. **Updated `BookService` Class**  
   - Added setter method for `BookRepository`.

3. **Created Main Class**  
   - `LibraryManagementApplication.java` loads the Spring context and tests the configuration.

---

## 🛠️ Technologies Used
- Java
- Spring Core (IoC)
- Maven
- XML-based bean configuration

---

## 📁 Folder Structure

LibraryManagement/
├── code/
│ ├── com/library/service/BookService.java
│ ├── com/library/repository/BookRepository.java
│ ├── com/library/main/LibraryManagementApplication.java
│ ├── applicationContext.xml
│ └── pom.xml
├── output/
│ └── Output.png

yaml
Copy
Edit

- `LibraryManagement/` — Full working Maven project.
- `code/` — Core logic and configuration files required for the exercise.
- `output/` — Console output screenshot showing successful bean loading and DI.

---

## ▶️ How to Run

1. Open the project in your IDE.
2. Ensure that `applicationContext.xml` is properly configured with Spring beans.
3. Run `com.library.main.LibraryManagementApplication`.

---

## ✅ Result

- Spring application context was successfully loaded using XML configuration.
- Beans (`BookService`, `BookRepository`) were injected via **setter injection**.
- Console output confirms proper execution and dependency wiring.

---

## 📌 Notes

- This exercise is focused on **manual Spring Core configuration** via XML (no annotations or Spring Boot).
- Can be extended to use constructor injection or annotation-based config in future exercises.
