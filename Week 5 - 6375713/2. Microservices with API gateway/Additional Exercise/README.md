# Create Eureka Discovery Server and Register Microservices

This repository contains a complete hands-on implementation of a Spring Cloud-based microservices system using Eureka Discovery Server. The solution consists of multiple independent Spring Boot microservices and a central discovery server. It also includes an API Gateway for routing and a shared greeting service.

Each project is structured in separate folders with supporting code samples and output screenshots for clarity and reproducibility.

---

## 📁 Folder Structure

### 1. **Projects**

These are fully working, independent Spring Boot projects:

* `Accounts` – RESTful microservice for account-related operations.
* `Loans` – RESTful microservice for loan-related operations.
* `GreetsService` – A shared service providing greeting responses.
* `EurekaDiscoveryServer` – The Eureka service registry to register and discover services.
* `APIGateway` – Spring Cloud API Gateway to route requests to microservices and apply filters.

Each project is pre-configured with:

* Spring Boot setup.
* Correct port allocation.
* Eureka client configuration (except EurekaDiscoveryServer which is the registry server).
* REST controllers for API exposure.

---

### 2. **Codes**

Contains modular code snippets required to implement each service. Organized by service name:

* `Accounts_Code`
* `Loans_Code`
* `GreetsService_Code`
* `EurekaDiscovery_Code`
* `APIGateway_Code`

> These can be used as reference or to quickly scaffold new projects with minimal configuration.

---

### 3. **Outputs**

This folder captures actual output results when each service is executed.

Each subfolder (`Accounts`, `Loans`, etc.) includes:

* `Build Success` – Screenshot showing successful Maven build.
* `Console Output 1` – Console output after running the service.
* `Console Output 2` – Output after API interaction or Postman test.
* `Registered Eureka` – Screenshot showing the microservice successfully registered with the Eureka server.

---

<pre>📁 Folder Structure
└── 📁 Create Eureka Discovery Server and Register Microservices
    ├── 📁 accounts                     # Full working Maven project for Accounts microservice (Eureka client)
    │
    ├── 📁 loans                        # Full working Maven project for Loans microservice (Eureka client)
    │
    ├── 📁 greets-service              # Full working Maven project (Eureka client)
    │
    ├── 📁 api-gateway                 # Full working Spring Cloud API Gateway project (Eureka client)
    │
    ├── 📁 eureka-discovery-server     # Full working Eureka Discovery Server (Eureka server)
    │
    ├── 📁 Codes
    │   ├── 📁 Accounts_Code
    │   ├── 📁 Loans_Code
    │   ├── 📁 GreetsService_Code
    │   ├── 📁 EurekaDiscovery_Code
    │   └── 📁 APIGateway_Code
    │       # Contains all the essential Java source files and configuration required for exercises.

    │
    ├── 📁 Outputs
    │   ├── 📁 Accounts
    │   │   ├── 🖼️ build-success.png
    │   │   ├── 🖼️ console-output-01.png
    │   │   ├── 🖼️ console-output-02.png
    │   │   ├── 🖼️ eureka-account.png
    │   │   ├── 🖼️ testing-output.png
    │   │   └── 🖼️ hello-world-output.png
    │
    │   ├── 📁 Loans
    │   │   ├── 🖼️ build-success.png
    │   │   ├── 🖼️ console-output-01.png
    │   │   ├── 🖼️ console-output-02.png
    │   │   ├── 🖼️ eureka-loan.png
    │   │   ├── 🖼️ testing-output.png
    │   │   └── 🖼️ hello-world-output.png
    │
    │   ├── 📁 Greets-Service
    │   │   ├── 🖼️ build-success.png
    │   │   ├── 🖼️ console-output-01.png
    │   │   ├── 🖼️ console-output-02.png
    │   │   └── 🖼️ eureka-greet.png
    │
    │   ├── 📁 EurekaDiscoveryServer
    │   │   ├── 🖼️ build-success.png
    │   │   ├── 🖼️ console-output-01.png
    │   │   ├── 🖼️ console-output-02.png
    │   │   ├── 🖼️ eureka-account-loan.png
    │   │   ├── 🖼️ eureka-greet-api.png
    │   │   └── 🖼️ eureka-discovery-server.png
    │
    │   └── 📁 APIGateway
    │       ├── 🖼️ build-success.png
    │       ├── 🖼️ console-output-01.png
    │       ├── 🖼️ console-output-02.png
    │       └── 🖼️ eureka-api.png
    │
    │       # Each folder has 4 screenshots:
    │       # - build-success.png
    │       # - console-output-01.png
    │       # - console-output-02.png
    │       # - eureka-registered.png (actual file names: eureka-account.png, eureka-loan.png, etc.)
    │
    └── 📄 README.md                   # This file (project documentation)</pre>

---

## ✅ How to Use

1. **Open each project** in an IDE like Eclipse or IntelliJ.
2. **Ensure ports do not conflict.** Default ports:

   * Eureka Discovery Server – `8761`
   * Accounts – `8080`
   * Loans – `8081`
   * GreetsService – `8082`
   * API Gateway – `9090`
3. **Start Eureka server first.**
4. **Run the microservices** one by one. Check Eureka UI (`http://localhost:8761`) to verify registration.
5. **Test endpoints** via Postman or browser using API Gateway routes.

---

## 🧪 Testing & Output Reference

Refer to the `Outputs` folder for sample screenshots that show:

* Successful application build.
* Console logs on startup.
* Endpoint responses.
* Service registration confirmation on Eureka UI.

---

Feel free to use this structure to understand, learn, or present a microservices-based solution using Spring Cloud and Eureka.
