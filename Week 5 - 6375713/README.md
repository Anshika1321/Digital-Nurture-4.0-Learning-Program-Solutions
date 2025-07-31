## 📦 Project Repository Overview – Week 5
This Week 5 repository is focused on Microservices architecture with Eureka Discovery Server and Spring Cloud API Gateway, using Spring Boot 3. It covers registering services with Eureka, service-to-service communication, gateway routing, and exposing endpoints for account and loan management.

Each section is organized into self-contained exercises including full Maven projects, code snippets, screenshots of outputs, and documentation.

<pre>📁 Week 5 - 6375713
│
├── 📄 README.md
│
└── 📁 2. Microservices with API gateway
    │
    ├── 📄 README.md
    │
    ├── 📁 Additional Exercise
    │   │
    │   ├── 📁 Create Eureka Discovery Server and Register Microservices
    │   │   │
    │   │   ├── 📁 accounts                  # Full Maven project – Accounts service (Eureka client)
    │   │   ├── 📁 loans                     # Full Maven project – Loans service (Eureka client)
    │   │   ├── 📁 greets-service           # Full Maven project – Greets service (Eureka client)
    │   │   ├── 📁 api-gateway              # Full Maven project – Spring Cloud API Gateway
    │   │   ├── 📁 eureka-discovery-server  # Full Maven project – Eureka Discovery Server
    │   │   │
    │   │   ├── 📁 Codes                    # Source codes (separated by service)
    │   │   │   ├── 📁 Accounts_Code
    │   │   │   ├── 📁 Loans_Code
    │   │   │   ├── 📁 GreetsService_Code
    │   │   │   ├── 📁 EurekaDiscovery_Code
    │   │   │   └── 📁 APIGateway_Code
    │   │   │
    │   │   ├── 📁 Outputs                  # Screenshots of builds, consoles, Eureka
    │   │   │   ├── 📁 Accounts
    │   │   │   │   ├── 🖼️ build-success.png
    │   │   │   │   ├── 🖼️ console-output-01.png
    │   │   │   │   ├── 🖼️ console-output-02.png
    │   │   │   │   ├── 🖼️ eureka-account.png
    │   │   │   │   ├── 🖼️ testing-output.png
    │   │   │   │   └── 🖼️ hello-world-output.png
    │   │   │   │
    │   │   │   ├── 📁 Loans
    │   │   │   │   ├── 🖼️ build-success.png
    │   │   │   │   ├── 🖼️ console-output-01.png
    │   │   │   │   ├── 🖼️ console-output-02.png
    │   │   │   │   ├── 🖼️ eureka-loan.png
    │   │   │   │   ├── 🖼️ testing-output.png
    │   │   │   │   └── 🖼️ hello-world-output.png
    │   │   │   │
    │   │   │   ├── 📁 Greets-Service
    │   │   │   │   ├── 🖼️ build-success.png
    │   │   │   │   ├── 🖼️ console-output-01.png
    │   │   │   │   ├── 🖼️ console-output-02.png
    │   │   │   │   └── 🖼️ eureka-greet.png
    │   │   │   │
    │   │   │   ├── 📁 EurekaDiscoveryServer
    │   │   │   │   ├── 🖼️ build-success.png
    │   │   │   │   ├── 🖼️ console-output-01.png
    │   │   │   │   ├── 🖼️ console-output-02.png
    │   │   │   │   └── 🖼️ eureka-discovery.png
    │   │   │   │
    │   │   │   └── 📁 APIGateway
    │   │   │       ├── 🖼️ build-success.png
    │   │   │       ├── 🖼️ console-output-01.png
    │   │   │       ├── 🖼️ console-output-02.png
    │   │   │       └── 🖼️ eureka-api.png
    │   │   │
    │   │   └── 📄 README.md
    │
    └── 📁 Creating Microservices for account and loan
        │
        ├── 📄 README.md
        │
        ├── 📁 account-microservice
        │   ├── 📁 code           # Java source files (controller, config, etc.)
        │   ├── 📁 output         # Postman/console screenshots
        │   └── 📁 accounts       # Full Maven project – Account service
        │
        ├── 📁 loan-microservice
        │   ├── 📁 code           # Java source files (controller, config, etc.)
        │   ├── 📁 output         # Postman/console screenshots
        │   └── 📁 loans          # Full Maven project – Loan service
        │
        └── 📁 output             # Combined outputs for account and loan microservices</pre>
