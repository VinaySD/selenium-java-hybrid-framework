# 🚀 Selenium Java Hybrid Automation Framework


---

## 📌 About

This project is a **Selenium Java Hybrid Automation Framework** built for testing the **OpenCart** application.

The framework combines Page Object Model, TestNG, data-driven testing, reusable utilities, reporting, logging, cross-browser execution, and Selenium Grid/Docker support.

The goal of this project is to practice how a maintainable UI automation framework can be structured and used for real-world style testing.

---

## 🛠️ Tech Stack

| Technology         | Purpose                               |
| ------------------ | ------------------------------------- |
| Java               | Programming language                  |
| Selenium WebDriver | UI automation                         |
| TestNG             | Test execution and test management    |
| Maven              | Build and dependency management       |
| Page Object Model  | Page-level design and maintainability |
| Apache POI         | Excel test data handling              |
| Extent Reports     | HTML test reporting                   |
| Log4j2             | Execution logging                     |
| Docker             | Container-based execution             |
| Selenium Grid      | Remote / cross-browser execution      |

---

## ✨ Framework Features

* ✅ Page Object Model
* ✅ Reusable Base Class
* ✅ Data-Driven Testing
* ✅ Excel-based Test Data
* ✅ TestNG DataProvider
* ✅ TestNG Groups
* ✅ TestNG XML Suites
* ✅ Test Dependencies
* ✅ Assertions
* ✅ Cross-Browser Testing
* ✅ Extent Reports
* ✅ Log4j2 Logging
* ✅ Failure Screenshots
* ✅ Selenium Grid
* ✅ Docker Support
* ✅ Maven Execution
* ✅ External Configuration

---

## 🏗️ Framework Architecture

```text
                    ┌───────────────────────┐
                    │      TestNG Tests     │
                    └───────────┬───────────┘
                                │
                                ▼
                    ┌───────────────────────┐
                    │    Page Objects       │
                    └───────────┬───────────┘
                                │
                                ▼
                    ┌───────────────────────┐
                    │   Selenium WebDriver  │
                    └───────────┬───────────┘
                                │
                                ▼
                    ┌───────────────────────┐
                    │       OpenCart        │
                    └───────────────────────┘

        ┌──────────────────────────────────────────────┐
        │ Supporting Components                        │
        │                                              │
        │ DataProvider → ExcelUtility → Test Data      │
        │ Extent Reports → Test Results                │
        │ Log4j2 → Execution Logs                      │
        │ Config → Environment Settings                │
        │ Selenium Grid / Docker → Remote Execution    │
        └──────────────────────────────────────────────┘
```

---

## 🔄 Test Execution Flow

```text
TestNG Suite
     ↓
BaseClass
     ↓
Read Configuration
     ↓
Initialize Browser
     ↓
Launch OpenCart
     ↓
Execute Test Case
     ↓
Interact with Page Objects
     ↓
Validate Result
     ↓
Generate Report
     ↓
Capture Screenshot (if required)
     ↓
Write Logs
     ↓
Close Browser
```

---

## 📂 Project Structure

```text
selenium-java-hybrid-framework/
│
├── src/
│   └── test/
│       ├── java/
│       │   ├── pageObjects/
│       │   │   ├── AccountRegistrationPage.java
│       │   │   ├── BasePage.java
│       │   │   ├── HomePage.java
│       │   │   ├── LoginPage.java
│       │   │   └── MyAccountPage.java
│       │   │
│       │   ├── testBase/
│       │   │   └── BaseClass.java
│       │   │
│       │   ├── testCases/
│       │   │   ├── TC001_AccountRegistrationPage.java
│       │   │   ├── TC002_LoginTest.java
│       │   │   └── TC003_LoginTestDDT.java
│       │   │
│       │   └── utilities/
│       │       ├── DataProviders.java
│       │       ├── ExcelUtility.java
│       │       └── ExtentReportManager.java
│       │
│       └── resources/
│           ├── config.properties
│           └── log4j2.xml
│
├── reports/
├── screenshots/
├── logs/
├── target/
├── test-output/
│
├── testData/
│   └── OpenCart_LoginData.xlsx
│
├── crossbrowsertesting.xml
├── docker-compose.yaml
├── grid-docker.xml
├── grouping.xml
├── master.xml
├── pom.xml
├── run.bat
├── commands.txt
├── .gitignore
└── README.md
```

---

## 🧪 Current Test Cases

```text
TC001
Account Registration

TC002
Login Test

TC003
Data-Driven Login Test
```

The framework structure is designed so more test cases can be added without changing the core framework components.

---

## 📊 Data-Driven Testing

The login test uses external Excel data.

```text
Excel File
    ↓
ExcelUtility
    ↓
TestNG DataProvider
    ↓
Login Test
    ↓
Validation
```

Test data is maintained in:

```text
testData/OpenCart_LoginData.xlsx
```

---

## 🌐 Cross-Browser Testing

Cross-browser execution is configured using TestNG XML files.

Example:

```text
crossbrowsertesting.xml
```

The framework can be configured to execute tests against supported browsers such as Chrome and Edge.

---

## 🐳 Selenium Grid / Docker

The project also contains Docker and Selenium Grid configuration.

```text
TestNG
   ↓
Selenium Grid
   ↓
Browser Node
   ↓
WebDriver
   ↓
OpenCart
```

Configuration files:

```text
docker-compose.yaml
grid-docker.xml
```

---

## 📝 Configuration

Environment and application settings are maintained separately.

```text
src/test/resources/config.properties
```

This allows configuration values to be changed without modifying test classes.

---

## 📋 Logging

Log4j2 is used to record test execution details.

```text
src/test/resources/log4j2.xml
```

Generated logs can be found in:

```text
logs/
```

---

## 📈 Reporting

Extent Reports are generated after test execution.

```text
reports/
```

Reports can be used to review:

```text
✔ Passed tests
✔ Failed tests
✔ Test execution details
✔ Failure information
```

---

## 📸 Screenshots

Screenshots are stored for debugging and failure analysis.

```text
screenshots/
```

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone <your-repository-url>
```

### 2. Open the project

Open the project in Eclipse or IntelliJ IDEA as a Maven project.

### 3. Check configuration

Open:

```text
src/test/resources/config.properties
```

Update the required values if necessary.

### 4. Run the TestNG suite

For example:

```text
master.xml
```

Other available suites include:

```text
grouping.xml
crossbrowsertesting.xml
grid-docker.xml
```

### 5. Run with Maven

```bash
mvn test
```

### 6. Review the results

After execution, check:

```text
reports/
screenshots/
logs/
test-output/
```

---

## 🎯 Learning Objectives

This project helped me practice:

```text
Java
   ↓
Selenium WebDriver
   ↓
TestNG
   ↓
Page Object Model
   ↓
Data-Driven Testing
   ↓
Reporting & Logging
   ↓
Cross-Browser Testing
   ↓
Selenium Grid / Docker
```

---

## 🚧 Future Improvements

```text
→ API Automation using REST Assured
→ Database Validation
→ CI/CD Integration
→ More End-to-End Test Scenarios
→ Improved Parallel Execution
→ Environment-specific execution
```

---

## ✅ Status

**Completed**

This project represents my completed Selenium + TestNG Hybrid Automation Framework practice.

---

## 👨‍💻 Author

**Vinay S. Chaudhari**

Java | Selenium | TestNG | QA Automation

<div align="center">

⭐ **Thanks for visiting the repository!**

</div>
