# Spring REST using Spring Boot 3 Exercises – `JWT-Hands-on`

# JWT-Hands-on Exercise

📁 Folder: Create authentication service that returns JWT

This hands-on exercise demonstrates how to build an authentication service in Spring Boot that returns a JWT (JSON Web Token) when valid user credentials are passed using HTTP Basic authentication.

When a request like the one below is made, the service generates a JWT and returns it in JSON format:

👉 Example Request:
-------------------
curl -s -u user:pwd http://localhost:8090/authenticate

👉 Example Response:
--------------------
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}

--------------------------------------------------------
📂 Folder Structure Inside This Hands-On:
--------------------------------------------------------

1. Code/
   - Contains all the essential Java source files and configuration required for this exercise.
   - Files included:
     • AuthenticationController.java – REST controller that handles `/authenticate`
     • JwtService.java – Generates JWT using HMAC secret
     • SecurityConfig.java – Configures Basic Authentication, disables CSRF
     • application.properties – Runs app on port 8090
     • SpringLearn2Application.java – Entry point for Spring Boot
     • pom.xml – Maven dependencies and plugins

2. Output/
   - Contains screenshots of actual execution and testing:
     • Console Output - 01.png  
       - Screenshot of the Spring Boot application console after running the `main()` method from `SpringLearn2Application.java`
     • Console Output - 02.png  
       - Screenshot of the console when the API is tested using Postman (local requests to `/authenticate`)
     • Postman Output.png  
       - JSON response showing token in Postman from GET request
     • Terminal Output.png  
       - Result of `curl -s -u user:pwd http://localhost:8090/authenticate`

3. spring-learn2/
   - This is the **full working Maven project** combining everything from the above.
   - It includes the actual folder structure under `src/main/java/...`, proper package names, and `pom.xml` for execution.
   - You can directly import and run this in any IDE like Eclipse or IntelliJ.

📁 Folder structure- JWT-hands-on
        └── 📁 Create authentication service that returns JWT
            ├── 📁 code
            │   ├── AuthenticationController.java
            │   ├── JwtService.java
            │   ├── SecurityConfig.java
            │   ├── application.properties
            │   ├── SpringLearn2Application.java
            │   └── pom.xml
            ├── 📁 output
            │   ├── 🖼️ Console Output - 01.png
            │   ├── 🖼️ Console Output - 02.png
            │   ├── 🖼️ Postman Output.png
            │   └── 🖼️ Terminal Output.png
            └── 📁 spring-learn2  # Full working Maven project (can be imported into Eclipse/IntelliJ)
             
--------------------------------------------------------
✅ Summary of What This Exercise Covers:
--------------------------------------------------------

• Accepting user credentials via Basic Auth  
• Validating the user and generating JWT using JJWT  
• Returning token in JSON format  
• Proper Spring Security configuration with stateless setup  
• Testing with curl and Postman

--------------------------------------------------------
🧪 How to Run and Test:
--------------------------------------------------------

1. Open and run `SpringLearn2Application.java`.
2. Use any of the following:
   - Terminal → curl:  
     `curl -s -u user:pwd http://localhost:8090/authenticate`
   - Postman →  
     Method: GET  
     URL: http://localhost:8090/authenticate  
     Auth Type: Basic (user / pwd)
3. Observe output as a JSON token.
4. Refer to screenshots in `Output/` folder for proof of execution.

--------------------------------------------------------
✅ This exercise has been implemented, executed, and tested successfully.
--------------------------------------------------------
