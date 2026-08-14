````markdown
# 🚀 Selenium Java Hybrid Automation Framework

<p align="center">
  <strong>OpenCart UI Test Automation Framework</strong>
</p>

<p align="center">
  A structured Selenium + Java automation framework using TestNG, Page Object Model,
  Data-Driven Testing, Extent Reports, Log4j2, Cross-Browser Testing and Selenium Grid.
</p>

<p align="center">

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk)

![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?style=for-the-badge&logo=selenium&logoColor=white)

![TestNG](https://img.shields.io/badge/TestNG-Testing-red?style=for-the-badge)

![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven)

![POM](https://img.shields.io/badge/Design-Page%20Object%20Model-blue?style=for-the-badge)

![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

</p>

---

## ✨ About The Project

This project is a **Selenium Java Hybrid Automation Framework** created for automating the **OpenCart** web application.

The framework combines multiple automation practices into a single structured project, including:

- Selenium WebDriver
- Java
- TestNG
- Page Object Model (POM)
- Data-Driven Testing
- Apache POI
- Extent Reports
- Log4j2 Logging
- Configuration Management
- Cross-Browser Testing
- Selenium Grid
- Docker

The main goal of this project is to understand how a maintainable Selenium automation framework can be structured instead of writing all automation code inside individual test classes.

---

# 🧰 Tech Stack

| Technology | Purpose |
|---|---|
| ☕ Java | Programming Language |
| 🕸️ Selenium WebDriver | Web UI Automation |
| 🧪 TestNG | Test Execution & Test Management |
| 📦 Maven | Dependency & Build Management |
| 🏗️ POM | Page Object Model |
| 📊 Apache POI | Excel Test Data |
| 📈 Extent Reports | HTML Test Reports |
| 📝 Log4j2 | Logging |
| 🌐 ChromeDriver | Browser Automation |
| 🐳 Docker | Containerized Execution |
| 🖥️ Selenium Grid | Distributed / Cross-Browser Testing |

---

# 🏗️ Framework Architecture

```mermaid
flowchart TD

    A[TestNG Test Cases] --> B[Page Objects]

    B --> C[Selenium WebDriver]

    C --> D[OpenCart Application]

    A --> E[Test Data]

    E --> F[Apache POI / DataProvider]

    A --> G[Utilities]

    G --> H[Extent Reports]

    G --> I[Log4j2]

    A --> J[TestNG XML]

    J --> K[Cross Browser Execution]

    K --> L[Selenium Grid]

    L --> M[Docker]
````

---

# 🔄 Automation Flow

```text
Requirement
     ↓
Test Scenario
     ↓
Test Case
     ↓
TestNG
     ↓
Page Object
     ↓
Selenium WebDriver
     ↓
OpenCart
     ↓
Validation
     ↓
Test Result
     ↓
┌───────────────┬───────────────┐
↓               ↓               ↓
Report        Screenshot       Log
```

---

# 📂 Project Structure

```text
selenium-java-hybrid-framework/
│
├── src/
│   └── test/
│       │
│       ├── java/
│       │   │
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
└── README.md
```

---

# 🧩 Framework Components

## 1️⃣ Page Object Model

Page classes are maintained separately from test cases.

```text
pageObjects/
│
├── LoginPage.java
├── HomePage.java
├── MyAccountPage.java
├── AccountRegistrationPage.java
└── BasePage.java
```

This keeps locators and page-related actions separate from the actual test logic.

---

## 2️⃣ Test Base

`BaseClass.java` handles common test setup and configuration.

It provides the common foundation required by the test cases.

---

## 3️⃣ Test Cases

The `testCases` package contains the actual automation tests.

Current examples include:

```text
TC001_AccountRegistrationPage
TC002_LoginTest
TC003_LoginTestDDT
```

---

## 4️⃣ Data-Driven Testing

The framework supports data-driven testing using:

```text
TestNG DataProvider
        +
Apache POI
        +
Excel
```

Test data is stored in:

```text
testData/
└── OpenCart_LoginData.xlsx
```

This allows the same test scenario to be executed with different sets of test data.

---

## 5️⃣ TestNG

TestNG is used for:

* Test execution
* Test annotations
* Assertions
* Test grouping
* Data providers
* Test suites
* Cross-browser execution

Available TestNG suite files include:

```text
master.xml
grouping.xml
crossbrowsertesting.xml
grid-docker.xml
```

---

## 6️⃣ Extent Reports

Extent Reports are used to generate HTML execution reports.

Generated reports are stored inside:

```text
reports/
```

Example:

```text
Test-Report-YYYY.MM.DD.HH.MM.SS.html
```

---

## 7️⃣ Logging

Log4j2 is used to maintain execution logs.

Configuration:

```text
src/test/resources/log4j2.xml
```

Logs:

```text
logs/
└── automation.log
```

Logs help during debugging and failure investigation.

---

## 8️⃣ Screenshots

Screenshots are captured during test execution when required.

They are stored inside:

```text
screenshots/
```

This makes it easier to investigate failed test cases.

---

## 9️⃣ Configuration Management

Application and execution settings are maintained inside:

```text
src/test/resources/config.properties
```

This avoids hardcoding configuration values throughout the framework.

Example:

```properties
execution_env=local
browser=chrome
appURL=YOUR_APPLICATION_URL
```

---

# 🌐 Cross-Browser Testing

The framework contains a separate TestNG configuration for cross-browser execution.

```text
crossbrowsertesting.xml
```

The framework can be configured to execute tests against different browsers.

---

# 🐳 Selenium Grid & Docker

The project also contains Selenium Grid and Docker configuration.

Files:

```text
docker-compose.yaml
grid-docker.xml
```

This allows the framework to be extended toward distributed and parallel test execution.

---

# ▶️ How To Run

## 1. Clone the Repository

```bash
git clone <repository-url>
```

## 2. Open The Project

Open the project in:

* Eclipse
* IntelliJ IDEA

Import it as a **Maven Project**.

## 3. Configure The Application

Open:

```text
src/test/resources/config.properties
```

Update the required configuration values.

## 4. Run TestNG

Run one of the available TestNG suites.

For example:

```text
master.xml
```

or use the appropriate suite based on the required execution.

## 5. Check Results

After execution, check:

```text
reports/
screenshots/
logs/
test-output/
```

---

# 📊 Test Execution

The framework produces multiple types of test artifacts:

```text
Test Execution
      │
      ├── 📊 Extent Report
      │
      ├── 📸 Screenshots
      │
      ├── 📝 Execution Logs
      │
      └── 🧪 TestNG Results
```

---

# 🎯 Test Scenarios Covered

The current framework contains automation examples for:

### 👤 Account

* Account Registration

### 🔐 Authentication

* Login
* Data-Driven Login Testing

More scenarios can be added as the framework evolves.

---

# 💡 Why Hybrid Framework?

The framework combines multiple automation approaches instead of relying on a single technique.

```text
                 Hybrid Framework
                        │
        ┌───────────────┼───────────────┐
        ↓               ↓               ↓
       POM         Data Driven       TestNG
        │               │               │
        ↓               ↓               ↓
   Page Objects       Excel         Test Suites
        │               │               │
        └───────────────┼───────────────┘
                        ↓
                 Selenium WebDriver
                        ↓
                  OpenCart Testing
```

---

# 📌 Project Status

<p align="center">

### ✅ Selenium + TestNG Hybrid Framework Completed

</p>

The current version demonstrates a structured Selenium automation framework with:

```text
✅ Selenium WebDriver
✅ Java
✅ TestNG
✅ Page Object Model
✅ Data-Driven Testing
✅ Apache POI
✅ Extent Reports
✅ Log4j2
✅ Screenshots
✅ Configuration Management
✅ Cross-Browser Testing
✅ Selenium Grid
✅ Docker
```

---

# 🚀 Future Improvements

The framework can be extended with:

```text
REST Assured
     ↓
API Automation
     ↓
SQL / Database Validation
     ↓
CI/CD
     ↓
GitHub Actions
     ↓
Complete SDET Automation Pipeline
```

Other possible improvements:

* More end-to-end scenarios
* API automation
* Database validation
* Parallel execution improvements
* CI/CD integration
* Better test-data management
* Environment-specific configuration

---

# 📚 Learning Journey

This framework is part of my automation testing learning journey:

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
Hybrid Automation Framework
  ↓
API Testing
  ↓
REST Assured
  ↓
SQL
  ↓
CI/CD
```

---

# 👨‍💻 Author

**Vinay Chaudhari**

Computer Engineering | QA Automation / SDET

---

<p align="center">

⭐ If you find this project useful, feel free to explore the repository.

</p>
```
