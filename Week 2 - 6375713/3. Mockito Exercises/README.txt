# Mockito Hands-On Exercises

This folder contains unit tests written using Mockito to mock dependencies and verify interactions.  
✅ Both exercises are implemented within a single Mockito project.

## ✅ Exercise 1 Mocking and Stubbing
- File `MyServiceTest.java`
- Mocks an `ExternalApi` dependency.
- Uses `when(...).thenReturn(...)` to stub method return values.
- Asserts expected result using `assertEquals`.

## ✅ Exercise 2 Verifying Interactions
- File `MyServiceVerifyTest.java`
- Uses `verify(mock).method()` to ensure that the mocked method was called after execution.

---

### 🧩 Project Structure
- `Code` Contains the complete Maven project (`pom.xml`, `srcmain`, `srctest`, etc.).
- `MyService.java` Main service class that depends on `ExternalApi`.
- `ExternalApi.java` Interface to be mocked.
- `MyServiceTest.java` Test class for mocking and stubbing.
- `MyServiceVerifyTest.java` Test class for interaction verification.
- `Output` Contains screenshots of test results for both exercises.

---

### Requirements
- Mockito (`org.mockitomockito-core`)
- JUnit 5 (`org.junit.jupiterjunit-jupiter`)
- Maven Surefire Plugin (for running tests)

---

### Notes
- The entire Maven project is located inside the `Code` folder.
- Screenshots of the test results for both exercises are provided inside the `Output` folder.
- The project is designed to be run via Eclipse or from the command line using Maven.
- Exercises are separated into two test classes for clarity and learning purposes.
