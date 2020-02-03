package com.myntrafrntendautomation.commonUtilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilities {
	
	public static Properties getLocators(String propertyFile) {
		FileInputStream file = null;
		Properties properties = null;
		try {
			file = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//locators//"+propertyFile+".properties");
			properties = new Properties();
			properties.load(file);
		} catch (Exception e) {
			System.out.println("Unable to load property file"+e.getMessage());
		}
		return properties;
	}
	
	public static Properties getTestData(String propertyFile) {
		FileInputStream file = null;
		Properties properties = null;
		try {
			file = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//testData//"+propertyFile+".properties");
			properties = new Properties();
			properties.load(file);
		} catch (Exception e) {
			System.out.println("Unable to load property file"+e.getMessage());
		}
		return properties;
	}
	
	public static WebElement findElement(WebDriver driver, String elem) {
		return driver.findElement(By.xpath(elem));
	}
	
	public static List<WebElement> findElements(WebDriver driver, String elem){
		return driver.findElements(By.xpath(elem));
	}
	
	public static void clickElement(WebDriver driver, String elem) {
		findElement(driver, elem).click();
	}
	public static void clickListElement(List<WebElement> list) {

		list.get(generateRandomNumber(list.size())).click();
	}
	public static void fillDataInTextBox(WebDriver driver, String elem, String data) {
		findElement(driver, elem).clear();
		findElement(driver, elem).sendKeys(data);
	}
	
	public static boolean verifyElementIsDisplayed(WebDriver driver, String elem) {
		return findElement(driver, elem).isDisplayed();
	}
	
	public static String getText(WebDriver driver, String elem) {
		return findElement(driver, elem).getText();
	}
	
	public static void mouseHover(WebDriver driver, String elem) {
		
		Actions action = new Actions(driver);
		action.moveToElement(findElement(driver, elem)).perform();
		
	}
	
	public static void mouseHoverAndClick(WebDriver driver, String elementToHover, String elementToClick) {
		Actions action = new Actions(driver);
		action.moveToElement(findElement(driver, elementToHover)).click(findElement(driver, elementToClick)).build().perform();;
	}
	
	public static void waitForElementVisibility(WebDriver driver, String elem) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elem)));
		
	}
	
	public static void waitForElementInvisibility(WebDriver driver, String elem) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elem)));
		
	}
	
	public static int generateRandomNumber(int number) {
		
		Random randomNumber = new Random();
		return randomNumber.nextInt(number);
	}
	
	public static void switchTab(WebDriver driver, int tab_index) {
		 ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs_windows.get(tab_index));
	}
	public static void waitForElementToBeClickable(WebDriver driver, String elem) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elem)));
		
	}

}
