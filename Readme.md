# Project Assessment:(Myntra End-To-End Flow)
The provided repository contains an complete automated test to verify End-To-End flow on Myntra.

The test is supposed to:
- Login to Myntra
- Search any product with the given text as mentioned in src/main/resources/testData/testData.properties
- Navigate to Listing page and Select any Product
- Navigate to Product Description Page, Select the size and add it to bag
- Navigate to Cart page and proceed for checkout
- Enter the address and Proceed for Payment
- Enter the Credit Card Details
- Generate test execution report at the end

# Prerequisites:
- ChromeDriver 2.44 , JDK 8+
- Any IDE

# Code Flow
- The entry-point for the code is runnerClass.java. This class extends "Serenity Stories" class and is used to find stories file to start the test.
- The story file is a feature file written in Gherkin language to make people understand the test flow in a simple language. 
- The story file is mapped to a testStep(testStep.java) file through different annotations.
- Test Step file is basically a java class file with the methods defined for each-steps individually. The implementation of these methods are provided in a separate java file(testMethods.java) and is called to testStep file by creating the instance of testMethods.java in the step file.
- To make webdriver interact with web element we need locators.These locators are stored in a property file(locators.properties) and are accessed using key-value pair.
- Another property file(testData.properties) is used for storing test data. 
- A separate java class(utilites.java) is created to create generic methods to be reused.
 	
In simple language the code flow in following way:
 	
	- runnerClass.java --> story --> testStep.java --> testMethods.java(uses webElementLocators.properties and testData.properties for locators and testData)-->commonUtilities.java
 	


# How To Run Test:
- On any terminal, move to the project's root folder and execute the following command:
    - ./gradlew clean test aggregate

# How to view report:
- The test execution ends at the last line of story and report are generated automatically at the end of the test execution.

- To View report follow the below mentioned steps:

	1. Navigate to the folder location on your system and open it
	2. Open the folder target >> site >> serenity
	3. In the serenity folder look for "index.html" file and open it with any browser
