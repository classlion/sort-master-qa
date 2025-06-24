## soft-master-qa

Soft-master-qa is a test automation project for the soft-master application. It covers UI and API testing using Java, TestNG, Selenium WebDriver, Rest Assured and Gradle. The architecture follows the Page Object Model and supports modular and reusable components.

🚀 Technologies
Java 17+
Gradle
TestNG
Selenium WebDriver (UI Testing)
Rest Assured (API Testing)
Lombok
Logback

📂 Project Structure
src/
main/java/de/ait/softMaster/
├─ api/
| ├─ dto/ # DTO objects (fields)
├─ gui/
│ ├─ core/ # BasePage and core UI classes
│ └─ pages/ # UI page methods
└─ utils/ # Listeners

test/java/de/ait/taskTracker/
├─ api/
│ ├─ config/ # Base API test class
│ └─ tests/ # API tests
├─ gui/
│ ├─ core/ # Base UI test class
│ └─ tests/ # UI tests

test/resources/
├─ suites/ # TestNG XML suite files
├─ data/ # CSV files for DataProvider
├─ data.properties # Configuration properties
└─ logback.xml # Logging configuration
build.gradle
⚙️ Setup Instructions
Install JDK 17+
📦 Build and Test Execution
The project uses Gradle as a build tool.

Running Tests
Running Tests Run all tests:

gradle clean test 

Run a specific suite (e.g., smoky):

gradle smoky 

Run with a specific browser:

gradle positiveAuth -Dbrowser=firefox

🧪 Test Coverage
API tests: test/java/de/ait/softMaster/api/tests/, use Rest Assured and extend base API TestBase.

UI tests: test/java/de/ait/softMaster/gui/tests/, use Selenium WebDriver and Page Object Model.


➕ Adding New Entities or Tests

Add UI page objects in gui/pages/ and tests in gui/tests/.

Write tests in corresponding test/java/de/ait/softMaster/{api|gui}/tests/.

Update TestNG suite XML files in test/resources/suites/.
