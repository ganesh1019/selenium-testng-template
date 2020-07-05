Introduction: 
---------------

*   This Test Automation Framework is created using Java + Selenium Web Driver + TestNG. 
*   This is for testing MultiCurrency Feature

Prerequisites:
---------------
*	Java jdk-1.8 or higher
*   Mac ChromeDriver 
*   Run only in MAC OS Environment.
*	Apache Maven 3 or higher
*	Please refer for any help in Maven. 
* 	http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
* 	http://www.tutorialspoint.com/maven/maven_environment_setup.htm
*   For Windows, Please make the following changes 
        * Download the Chrome Driver and place it in drivers folder.
        * In line number 65, Please change chromedriver to chromedriver.exe in helper/TestBase.java file.

Environment:
---------------
* 	This Framework was developed in Mac Environment - CHROME DRIVER USED IS MAC64-bit

Execution:
---------------
*	Download the repo.
*   Extract the Zip/Go to Directory foex-ui-automation.
*	To run use command ....\.\foex-ui-automation> mvn clean test
*	log4j configured to capture the test execution logs
*   Chrome Driver in drivers/chromedriver
*	Execution log is captured in the //logs/Automation_Execution.log

