# Mockito Hands-On Exercises

This folder contains unit tests written using **Mockito** to mock dependencies and verify interactions.  
✅ Both exercises are implemented within a **single Mockito project** (`MyServiceTest.java`).

## ✅ Exercise 1: Mocking and Stubbing
- File: `MyServiceTest.java`
- Mocks an `ExternalApi` dependency.
- Uses `when(...).thenReturn(...)` to stub method return values.
- Asserts expected result using `assertEquals`.

## ✅ Exercise 2: Verifying Interactions
- File: `MyServiceTest.java`
- Uses `verify(mock).method()` to ensure that the mocked method was called after execution.

---

### 🧩 Project Structure
- `MyService.java`: Main service class that depends on `ExternalApi`.
- `ExternalApi.java`: Interface to be mocked.
- `MyServiceTest.java`: Test class containing both exercises.

---

### Requirements
- Mockito (`org.mockito:mockito-core`)
- JUnit 5 (`org.junit.jupiter:junit-jupiter`)
- Maven Surefire Plugin (for running tests)

---

### Note
Both exercises are implemented in a single class `MyServiceTest` for simplicity and clarity.
