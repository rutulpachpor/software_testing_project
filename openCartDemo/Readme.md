 🚀 Selenium Automation Test (OpenCart Demo)

This is a **Selenium Automation Test Framework** created for the [OpenCart Demo](https://tutorialsninja.com/demo/) application.  
It demonstrates **Page Object Model (POM)**, **TestNG**, **Data-Driven Testing with Excel**, **logging**, and **Dockerized Selenium Grid** for cross-browser testing.  

---

 ✨ Highlights

- 🧩 **Page Object Model (POM)** → Clean, reusable test code  
- 🧪 **TestNG Framework** → Test management with groups, assertions, and reports  
- 📑 **Data-Driven Testing** → Read test data from Excel (Apache POI)  
- 📝 **Log4j2 Logging** → File & console logs for debugging  
- 🌍 **Cross-Browser Support** → Chrome, Edge, Firefox  
- 🐳 **Dockerized Selenium Grid** → Parallel & remote execution  
- ⚡ **Maven Build Tool** → Dependency management + test execution  
- 🔄 **CI/CD Ready** → Can integrate with Jenkins / GitHub Actions  

---

 📂 Project Structure

openCartDemo/
│── src/
│ ├── test/java/pageObjects/ 	# Page classes (POM)
│ ├── test/java/testCases/ 	# TestNG test classes
│ ├── test/java/testBase/ 	# Base class (WebDriver setup)
│ ├── test/java/utilities/ 	# ExcelUtility, DataProviders, ExtentReporters 
│ ├── test/resources/config.properties 	# Config (URL, credentials, browser, env)
│ ├── test/resources/docker-compose.yaml 	# Selenium Grid setup (Docker)
│ ├── test/resources/log4j2.xml 	# Logging configuration
│── reports/ 	# ExtentReports
│── testData/ 	# Excel files for test data
│── test-output/ 	# Default TestNG reports (index.html, emailable-report.html)
│── logs/ 	# Log4j2 logs
│── screenshots/ 	# Failure screenshots
│── crossbrowsertesting.xml 	# Executes same tests in multiple browsers
│── grouping.xml 	# Executes tests based on groups (Sanity, Regression, Master)
│── master.xml 		# Runs all test cases
│── README.md 		# Documentation
│── pom.xml  		# Maven dependencies


 ⚙️ Setup & Execution

1️⃣ Clone the Repo
git clone https://github.com/your-username/software_testing_project.git 
cd software_testing_project

2️⃣ Install Dependencies
Make sure Java 17+ and Maven are installed. Then run:
mvn clean install

3️⃣ Configure Properties
Edit config.properties as per your test environment:
execution_env=local           # local or remote (for Grid/Docker)
appURL=https://tutorialsninja.com/demo/
email=your-email@test.com (pachpor@gmail.com)
pwd=yourpassword (rutul)

▶️ Run all tests
mvn test

Run by TestNG Group
mvn test -groups=Sanity
mvn test -groups=Regression
mvn test -groups=Master

▶️ Run on Dockerized Selenium Grid
Start Selenium Grid:
docker-compose up -d

Update config.properties:
execution_env=remote
browser=chrome

Run tests on Grid:
mvn test

▶️ Run from Eclipse IDE
Right-click on master.xml, grouping.xml, or crossbrowsertesting.xml.
Select → Run As → TestNG Suite.
Reports (test-output & reports) will be generated automatically.

📊 Reporting & Logs
TestNG Default Reports → /test-output/
index.html → Detailed test execution summary
emailable-report.html → Lightweight HTML report

OR

Extent Reports → /reports/ (rich HTML report with screenshots)

Log4j2 Logs → /logs/automation.log

Screenshots (on failure) → /screenshots/

==> These reports can be opened in any browser for analysis.

✅ Test Cases

~ TC001_AccountRegistrationTest → Register a new account

~ TC002_LoginTest → Login with valid credentials

~ TC003_OrderProductTest → Add product to cart → Checkout → Place order

~ TC_LoginDDT → Login test with multiple datasets (Excel-driven)

👨‍💻 About This Project

~ Selenium WebDriver automation with TestNG

~ Page Object Model (POM) design pattern

~ Data-driven testing from Excel (Apache POI)

~ Logging with Log4j2

~ Execution in local, remote, and Docker environments
