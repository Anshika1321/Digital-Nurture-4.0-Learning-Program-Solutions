# 🏦 Creating Microservices for Account and Loan

This hands-on exercise demonstrates how to create two independent Spring Boot microservices — Account Service and Loan Service — using Spring Boot 3 and Maven, without any backend or database connectivity.

Each microservice is built as a separate Maven project with its own pom.xml, application configuration, and REST controller.

## 📚 Exercise Overview

You will:

▸ Build two separate Spring Boot projects using start.spring.io

▸ Implement one endpoint in each microservice that returns static (hardcoded) JSON data

▸ Run both microservices on different ports (8080 and 8081)

▸ Verify output using Postman or browser

▸ Collect screenshots for build and run evidence

🏗️ Project Folder Structure

<pre>📁 Creating Microservices for account and loan
├── 📁 account-microservice
│   ├── 📁 code                  # Required source files
│   ├── 📁 output                # Console and Postman screenshots
│   └── 📁 accounts              # Full Maven project (importable in IDE)
│
├── 📁 loan-microservice
│   ├── 📁 code                  # Required source files
│   ├── 📁 output                # Console and Postman screenshots
│   └── 📁 loans                 # Full Maven project (importable in IDE)
│
├── 📁 output                   # Contains screenshots of console outputs for both services
└── 📄 README.md                # This documentation</pre>

## ✅ What You Will Build

| Microservice        | Endpoint                     | Port  | Description                          |
|---------------------|------------------------------|-------|--------------------------------------|
| **Account Service** | `GET /accounts/{number}`     | 8080  | Returns account info (dummy data)    |
| **Loan Service**    | `GET /loans/{number}`        | 8081  | Returns loan info (dummy data)       |

---
## ⚙️ Technologies Used

▸ Java 17+

▸ Spring Boot 3.x

▸ Spring Web

▸ Spring Boot DevTools

▸ Maven

▸ Postman (for testing)

## 🚀 Steps to Run

1️⃣ Account Microservice

▸ Open start.spring.io

    - Group: com.cognizant

    - Artifact: account

    - Dependencies: Spring Web, Spring Boot DevTools

▸ Generate and unzip the project.

▸ Place it inside: Creating Microservices for account and loan/account-microservice/accounts

▸ Import into Eclipse/IntelliJ

▸ Add the following endpoint:

@GetMapping("/accounts/{number}")
public Account getAccount(@PathVariable String number) {
    return new Account(number, "savings", 234343);
}

▸ Run AccountApplication.java

▸ Test in Postman:

GET http://localhost:8080/accounts/00987987973432

## 2️⃣ Loan Microservice

▸ Repeat the same process.

    - Artifact: loan

▸ Set custom port in application.properties:

server.port=8081

▸ Add the following endpoint:

@GetMapping("/loans/{number}")
public Loan getLoan(@PathVariable String number) {
    return new Loan(number, "car", 400000, 3258, 18);
}

▸ Run LoanApplication.java

▸ Test in Postman:

GET http://localhost:8081/loans/H00987987972342

## 🔍 Sample JSON Responses

📦 Account Microservice

{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}

🚗 Loan Microservice

{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}

## 📷 Output Proof (Screenshots)

▸ Each microservice’s output/ folder contains:

    - build-success.png – Successful Maven build

    - console-output-01.png – Logs after startup

    - console-output-02.png – Logs when endpoint is hit

    - testing-output.png – Postman result screenshot

## 📌 Notes

▸ Both services must run on different ports (default 8080 for Account, 8081 for Loan)

▸ Use Eclipse’s Console Monitor to switch between running applications

▸ These are dummy services — there is no database or backend

✅ Both microservices were successfully implemented, run, and tested.
