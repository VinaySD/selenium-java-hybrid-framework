# 🚀 Selenium Java Hybrid Automation Framework

A **Selenium + Java hybrid automation framework** built for testing the **OpenCart** application.

The framework combines **Selenium WebDriver, TestNG, Page Object Model, Excel-based data-driven testing, reporting, logging, and cross-browser execution**.

## 🛠️ Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Apache POI
- Extent Reports
- Log4j2
- Docker / Selenium Grid

## ✨ Key Features

- Page Object Model for maintainable test code
- Data-driven testing with Excel and TestNG DataProvider
- TestNG groups, suites, and dependencies
- Cross-browser testing
- Extent HTML reports
- Log4j2 logging
- Failure screenshots
- Selenium Grid / Docker support
- External configuration using `config.properties`

## 📂 Project Structure

```text
src/test/java/
├── pageObjects/                 # Page classes and locators
├── testBase/                    # Driver setup and common test utilities
├── testCases/                   # TestNG test cases
└── utilities/                   # Excel, DataProvider, and reporting utilities

src/test/resources/
├── config.properties            # Test configuration
└── log4j2.xml                   # Logging configuration

testData/                        # Excel test data
reports/                         # Generated Extent reports
screenshots/                     # Failure screenshots
logs/                            # Automation logs

testng.xml files:
├── master.xml
├── grouping.xml
├── crossbrowsertesting.xml
└── grid-docker.xml

docker-compose.yaml              # Selenium Grid / Docker setup
pom.xml                           # Maven dependencies and build configuration
run.bat                           # Windows run script
```

## 🧪 Current Test Cases

```text
TC001 - Account Registration
TC002 - Login Test
TC003 - Data-Driven Login Test
TC004 - Search Test
TC005 - Add to Cart Test
```

## ▶️ How to Run

### Local Execution

1. Clone the repository.
2. Open the project as a Maven project.
3. Check `src/test/resources/config.properties`.
4. Set the required browser and execution configuration.
5. Run `master.xml` or another required TestNG suite.
6. Check the generated reports, logs, screenshots, and TestNG results.

### Cross-Browser / Grid Execution

1. Make sure the required Selenium Grid / Docker setup is running.
2. Use the appropriate TestNG suite, such as `crossbrowsertesting.xml` or `grid-docker.xml`.
3. Run the suite.
4. Check the generated reports and execution results.

## 📊 Test Execution Flow

```text
TestNG
   ↓
BaseClass
   ↓
Test Cases
   ↓
Page Objects
   ↓
Selenium WebDriver
   ↓
OpenCart
   ↓
Reports + Logs + Screenshots
```

## 📊 Reporting & Logs

After execution, generated files can be found in:

```text
reports/
screenshots/
logs/
test-output/
```

## 🎯 Purpose

This project was built to practice and demonstrate how Selenium, TestNG, POM, data-driven testing, reporting, logging, and browser execution can be combined into a maintainable automation framework.

## ✅ Status

**Completed**

## 👨‍💻 Author

**Vinay S. Chaudhari**  
Java | Selenium | TestNG | QA Automation
