# Spring REST using Spring Boot 3 Exercises – `2.spring-rest-hands-on`

# 2.Spring REST Hands-on Exercises

This repository contains hands-on exercises for learning Spring Boot RESTful Web Services. The structure is organized to separate individual exercises and also provide a full working consolidated project.

## 📁 Folder Structure

All content is inside the `2.spring-rest-hands-on` folder. Inside it, you will find:

📁 2.spring-rest-hands-on
        ├── 📁 Hello World RESTful Web Service
        │   ├── 📁 code
        │   └── 📁 output
        │       ├── 🖼️ console-output.png (contains both run + test)
        │       └── 🖼️ testing-output-hello-world.png
        ├── 📁 REST - Country Web Service
        │   ├── 📁 code
        │   ├── 📁 output
        │       ├── 🖼️ console-output.png (contains both run + test)
        │       └── 🖼️ testing-output-country.png
        │   └── 🧾 REST - Country Web Service (SME Explanation).docx
        ├── 📁 REST - Get country based on country code
        │   ├── 📁 code
        │   └── 📁 output
        │       ├── 🖼️ console-output.png (contains both run + test)
        │       └── 🖼️ testing-output-country-code.png
        ├── 📁 spring-learn2  (Full working project combining all exercises)
        └── 📄 README.md

## ✅ Project Summary

| Exercise | Description | Endpoint |
|----------|-------------|----------|
| Hello World REST | Create a basic REST service that returns `"Hello World!!"` with logs | `GET /hello` |
| Country REST by Bean | Return a `Country` object (India) loaded from Spring XML config | `GET /country` |
| Country by Code | Return a `Country` based on code with case-insensitive match from XML list | `GET /countries/{code}` |

Each `code/` folder includes only the source code and configuration specific to that exercise.

Each `output/` folder includes:
- ✅ Console logs showing Spring Boot startup and method logs  
- ✅ Testing outputs (Postman screenshots or browser response)

The `spring-learn2` project contains the full integrated version with all three features combined.

## 💡 Notes
- Project uses `Spring Boot`, `Spring Web`, and XML-based bean configuration.
- Component scanning and dependency injection are enabled automatically in the main class.
- Logging is implemented using `SLF4J`.

## 🚀 Running the Full Project

1. Open the `spring-learn2` folder in Eclipse or your preferred IDE.
2. Run `SpringLearn1Application.java` as a Spring Boot App.
3. Use browser or Postman to test:
   - `http://localhost:8083/hello`
   - `http://localhost:8083/country`
   - `http://localhost:8083/countries/in`

---

This structure separates focused learning in each exercise while providing a consolidated project (`spring-learn2`) for complete integration and testing.