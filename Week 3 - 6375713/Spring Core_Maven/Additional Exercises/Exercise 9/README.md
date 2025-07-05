# Exercise 9: Creating a Spring Boot Application

## 📋 Objective
Create a full Spring Boot application for a library system with RESTful services and in-memory database.

---

## 🛠️ Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

---

## 🚀 Setup & Run

1. Open the project in your IDE.
2. Ensure the following files are present in the `code/` folder:
   - `LibraryManagement9Application.java` (main class)
   - `Book.java` (Entity)
   - `BookRepository.java` (Repository)
   - `BookController.java` (REST Controller)
   - `application.properties` (Configuration)

3. Run the main class:
com.cognizant.LibraryManagement9.LibraryManagement9Application

4. After successful startup, you should see this line in the console (visible in output image):
Tomcat started on port 8080 (http)

5. Test the API using browser or terminal:

✅ Step 1: View Books (Initially Empty)

Open in browser: http://localhost:8080/books

Expected Response: []  (Refer: `Output on Testing/Test Step-1.png`)


✅ Step 2: Add Book Using curl (Refer: `Output on Testing/Test Step-2.png`)

Command Prompt: 

curl -X POST http://localhost:8080/books -H "Content-Type: application/json" -d "{\"title\":\"Atomic Habits\",\"author\":\"James Clear\",\"isbn\":\"978-0735211292\"}"

Expected Response:

{"id":1,"title":"Atomic Habits","author":"James Clear","isbn":"978-0735211292"} 

✅ Step 3: Reload Browser

http://localhost:8080/books

Now the book entry will be shown:

[{"id":1,"title":"Atomic Habits","author":"James Clear","isbn":"978-0735211292"}] (Refer: `Output on Testing/Test Step-3.png`)

📁 Folder Structure

<pre>LibraryManagement9/
├── code/
│   ├── com/cognizant/LibraryManagement9/
│   │   ├── Book.java
│   │   ├── BookRepository.java
│   │   ├── BookController.java
│   │   └── LibraryManagement9Application.java
│   └── application.properties
├── output/
│   ├── Output1.png  (Tomcat started line)
│   ├── Output2.png  (Initial browser response [])
│   ├── Output3.png  (curl POST and result)
│   └── Output4.png  (Browser shows added book)</pre>
