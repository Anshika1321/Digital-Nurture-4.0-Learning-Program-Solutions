# Mockito Hands-On Exercises

This folder contains unit tests written using **Mockito** to mock dependencies and verify interactions.

## ✅ Exercise 1: Mocking and Stubbing
- File: `MyServiceTest.java`
- Mocks an `ExternalApi` dependency.
- Uses `when(...).thenReturn(...)` to stub method return values.
- Asserts expected result using `assertEquals`.

## ✅ Exercise 2: Verifying Interactions
- File: `MyServiceTest.java`
- Uses `verify(mock).method()` to ensure that the mocked method was called.

---

### Requirements
- Mockito library (`org.mockito`)
- JUnit 5 or JUnit Jupiter
