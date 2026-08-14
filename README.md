# 🚀 Selenium Java Hybrid Automation Framework

## 📌 About

A Selenium Java Hybrid Automation Framework built for testing the **OpenCart** application.

The framework combines Selenium, TestNG, Page Object Model, Data-Driven Testing, reporting, logging, and cross-browser execution.

## 🛠️ Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* Apache POI
* Extent Reports
* Log4j2
* Docker / Selenium Grid

## ✨ Key Features

* Page Object Model
* Data-Driven Testing with Excel
* TestNG DataProvider
* TestNG Groups & Suites
* Test Dependencies
* Cross-Browser Testing
* Extent Reports
* Log4j2 Logging
* Failure Screenshots
* Selenium Grid / Docker

## 📂 Structure

```text
src/test/java/
├── pageObjects/
├── testBase/
├── testCases/
└── utilities/

src/test/resources/
├── config.properties
└── log4j2.xml

testData/
reports/
screenshots/
logs/

master.xml
grouping.xml
crossbrowsertesting.xml
grid-docker.xml
docker-compose.yaml
pom.xml
run.bat
```

## 🧪 Current Tests

```text
TC001 - Account Registration
TC002 - Login Test
TC003 - Data-Driven Login Test
```

## ▶️ How to Run

1. Clone the repository.
2. Open it as a Maven project.
3. Update `config.properties` if required.
4. Run `master.xml` or the required TestNG suite.
5. Check reports, logs, screenshots, and TestNG results.

## 📊 Test Flow

```text
TestNG
   ↓
BaseClass
   ↓
Page Objects
   ↓
Selenium WebDriver
   ↓
OpenCart
   ↓
Reports + Logs + Screenshots
```

## ✅ Status

**Completed**

## 👨‍💻 Author

**Vinay S. Chaudhari**

Java | Selenium | TestNG | QA Automation
