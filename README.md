# Elorus Automation Framework

![Java](https://img.shields.io/badge/Language-Java-orange)
![Selenium](https://img.shields.io/badge/Tool-Selenium-brightgreen)
![TestNG](https://img.shields.io/badge/Framework-TestNG-blue)

## 📌 Overview

The **Elorus Automation Framework** is a robust, scalable, and maintainable test automation solution designed to validate the core functionalities of the [Elorus](https://www.elorus.com) web application. Built using **Java** and industry-standard tools, this framework enables faster test execution, reduces manual testing effort, and ensures consistent application quality across releases.

---

## 🎯 Objectives

- Automate end-to-end testing of critical Elorus web application workflows
- Improve testing efficiency and reduce regression cycle time
- Provide reliable, repeatable test execution with clear reporting
- Support continuous integration for early defect detection

---

## 🛠️ Tech Stack

| Layer            | Technology         |
|------------------|--------------------|
| Language         | Java               |
| Automation Tool  | Selenium WebDriver |
| Test Framework   | TestNG             |
| Build Tool       | Maven              |
| Reporting        | ExtentReports / TestNG Reports |

---

---

## ✅ Features

- **Page Object Model (POM):** Clean separation of test logic and UI interaction
- **Data-Driven Testing:** Parameterized tests for broader coverage
- **Cross-Browser Support:** Run tests across Chrome, Firefox, and Edge
- **Detailed Reporting:** Auto-generated HTML reports after each test run
- **Reusable Utilities:** Common helper methods for waits, screenshots, and config management

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 11 or higher
- Maven 3.6+
- Chrome / Firefox browser installed
- ChromeDriver / GeckoDriver (matching your browser version)

### Installation

```bash
# Clone the repository
git clone https://github.com/shashankKumar2108/Elorus_Automation_Framework.git

# Navigate to the project directory
cd Elorus_Automation_Framework/Elorus

# Install dependencies
mvn clean install -DskipTests
```

### Running Tests

```bash
# Run all tests
mvn test

# Run a specific TestNG suite
mvn test -DsuiteXmlFile=testng.xml
```

---

## 📊 Test Reports

After execution, HTML reports are generated in the `test-output/` directory. Open `index.html` in a browser to view detailed results including pass/fail status, execution time, and logs.


---

## 👤 Author

**Shashank Kumar**
- GitHub: [@shashankKumar2108](https://github.com/shashankKumar2108)

---
