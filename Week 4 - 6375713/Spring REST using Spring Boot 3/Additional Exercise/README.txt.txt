# Spring REST using Spring Boot 3 Exercises – `3.spring-rest-hands-on`

# 3.Spring REST Hands-on Exercises

This project demonstrates the use of RESTful Web Services in Spring to serve employee and department data previously hardcoded in an Angular application. It transitions from static data to dynamic backend integration using Spring REST APIs and XML configuration.

The application is split into multiple hands-on exercises, each focusing on a different aspect of the backend setup. All exercises are also combined into a fully working Spring Boot project.

-------------------------------------------------------
📁 Folder Structure (Inside `3.spring-rest-hands-on`):
-------------------------------------------------------

1. employee-managements  
   - The full working Maven-based Spring Boot project.
   - Combines all three hands-on exercises in one application.
   - Contains static XML-configured data for employees and departments.
   - Implements and exposes REST endpoints `/employees` and `/departments`.
   - Fully functional and tested with Postman.

2. Create static employee list data using spring xml configuration  
   - Contains minimal code required to define and load employee list via Spring XML configuration.
   - No REST logic is implemented here.
   - Includes model, DAO, configuration files, and output screenshots.

3. Create REST service to gets all employees  
   - Adds a REST controller and service layer to expose the list of employees via a GET endpoint.
   - Builds on top of the previous exercise.
   - Includes controller, service, and output folder with Postman test results.

4. Create REST service for department  
   - Implements a REST API to return department data via Spring-defined beans.
   - Uses a similar 3-layer architecture (controller → service → DAO).
   - Output folder includes log screenshots and JSON response from Postman.

Each exercise folder contains:
- A `code` folder: Only includes the files necessary to demonstrate that exercise.
- An `output` folder: Screenshots of console logs and Postman response for the APIs.

📁 3.spring-rest-handson
            ├── 📁 employee-managements  # ✅ Full working Maven Spring Boot project (all hands-ons together)
            │   ├── 📄 pom.xml
            │   ├── 📁 src
            │   └── ... (main, model, controller, service, dao, resources, etc.)

            ├── 📁 Create static employee list data using spring xml configuration
            │   ├── 📁 code
            │   │   ├── Employee.java 
            │   │   ├── EmployeeDao.java 
            │   │   ├── employee.xml 
            │   │   ├── 📄 AppConfig.java (if used)
            │   │   └── 📄 EmployeeManagementsApplication.java
            │   └── 📁 output
            │       ├── 🖼️ build_success.png
            │       └── 🖼️ console-logs-startup.png

            ├── 📁 Create REST service to gets all employees
            │   ├── 📁 code
            │   │   ├── EmployeeDao.java
            │   │   ├── EmployeeService.java             
            │   │   ├── EmployeeController.java           
            │   │   ├── employee.xml             
            │   │   ├── 📄 AppConfig.java (if used)          
            │   │   └── 📄 EmployeeManagementsApplication.java
            │   └── 📁 output
            │       ├── 🖼️ console_logs.png
            │       └── 🖼️ testing-postman_employees.png

            ├── 📁 Create REST service for department
            │   ├── 📁 code
            │   │   ├── Department.java             
            │   │   ├── DepartmentDao.java            
            │   │   ├── DepartmentService.java            
            │   │   ├── DepartmentController.java           
            │   │   ├── employee.xml
            │   │   ├── 📄 AppConfig.java (if used) 
            │   │   └── 📄 EmployeeManagementsApplication.java
            │   └── 📁 output
            │       ├── 🖼️ console_logs.png
            │       └── 🖼️ testing-postman_departments.png
-------------------------------------------------------
🧩 Hands-On Exercises Summary:
-------------------------------------------------------

Exercise 1: Create Static Employee List Using Spring XML Configuration
----------------------------------------------------------------------

Objective:
Define static employee and department data using Spring's XML-based configuration and load it into memory using a DAO.

Key Files:
- model/Employee.java
- dao/EmployeeDao.java
- resources/employee.xml
- EmployeeManagementsApplication.java

Output:
- Console output showing successful loading of data from Spring XML.

---

Exercise 2: Create REST Service to Get All Employees
----------------------------------------------------

Objective:
Expose a REST API (`GET /employees`) to fetch the employee list defined in the XML configuration.

Key Files:
- controller/EmployeeController.java
- service/EmployeeService.java
- dao/EmployeeDao.java
- resources/employee.xml

Output:
- Postman response showing employee data in JSON format.

---

Exercise 3: Create REST Service for Department
----------------------------------------------

Objective:
Expose department data via REST API (`GET /departments`) using XML-configured beans and Spring MVC layers.

Key Files:
- controller/DepartmentController.java
- service/DepartmentService.java
- dao/DepartmentDao.java
- model/Department.java
- resources/employee.xml

Output:
- Postman response showing department list in JSON format.

---

-------------------------------------------------------
🚀 Execution & Testing:
-------------------------------------------------------

- The **employee-managements** folder contains the complete Spring Boot project.
- It has been built and run successfully using Maven.
- The application correctly reads XML-configured data on startup.
- All REST endpoints have been tested using Postman.

✅ 6. Test in Postman:
---------------------
To verify the REST services, use the following endpoints in Postman:

GET http://localhost:8080/employees  
GET http://localhost:8080/departments

Both endpoints return data in JSON format retrieved from the Spring-managed XML configuration.

---

This README summarizes the complete backend setup, code structure, and testing outcomes for the Spring REST Hands-On series. Each exercise folder can function independently, and the consolidated project is fully functional and tested.

