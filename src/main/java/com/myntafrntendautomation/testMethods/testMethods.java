package com.myntafrntendautomation.testMethods;



import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.myntrafrntendautomation.commonUtilities.utilities;

import net.serenitybdd.core.pages.PageObject;

public class testMethods extends PageObject{
	
	
	public Properties locators;
	public Properties testData;
	
	public testMethods() {
		
		locators = utilities.getLocators("locators");
		testData = utilities.getTestData("testData");
	}
		
	public void openHomePage() {
		getDriver().get(testData.getProperty("baseUrl"));
		getDriver().manage().window().maximize();
		
	}
	
	public void userClicksLogin() {
		
		String profileIcon = locators.getProperty("homepageProfileIcon");
		String btnLogin = 	locators.getProperty("homepageLoginBtn");
		utilities.waitForElementVisibility(getDriver(), profileIcon);
		
		
		utilities.mouseHoverAndClick(getDriver(), profileIcon, btnLogin);
	}
	
	public void userIsTakenToLoginPage() {
		String loginBox = locators.getProperty("loginpageLoginBox");
		String txtBoxEmail = locators.getProperty("loginpagetxtBoxEmail");
		String txtBoxPwd = locators.getProperty("loginpagetxtBoxPwd");
		String btnLogin = locators.getProperty("loginpageLoginBtn");
		
		utilities.waitForElementVisibility(getDriver(), loginBox);
		Assert.assertTrue("Email Text Box present is :", utilities.verifyElementIsDisplayed(getDriver(), txtBoxEmail));
		Assert.assertTrue("Password Text Box present is :", utilities.verifyElementIsDisplayed(getDriver(), txtBoxPwd));
		Assert.assertTrue("Login Button present is :", utilities.verifyElementIsDisplayed(getDriver(), btnLogin));
	}
	
	public void userEntersLoginCredentials() {
		
		String txtBoxEmail = locators.getProperty("loginpagetxtBoxEmail");
		String txtBoxPwd = locators.getProperty("loginpagetxtBoxPwd");
		
		
		utilities.fillDataInTextBox(getDriver(), txtBoxEmail, testData.getProperty("email"));
		utilities.fillDataInTextBox(getDriver(), txtBoxPwd, testData.getProperty("password"));
		
		
	}
	
	public void userClicksLoginButtonOnLoginPage() {
		
		String btnLogin = locators.getProperty("loginpageLoginBtn");
		utilities.clickElement(getDriver(), btnLogin);
	}
	
	public void userIsLoggedIn() {
		
		String profileIcon = locators.getProperty("homepageProfileIcon");
		String emailInfo = locators.getProperty("homepageUserLoginEmail");
		
		utilities.waitForElementVisibility(getDriver(), profileIcon);
		utilities.mouseHover(getDriver(), profileIcon);
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), emailInfo));
		
	}
	
	public void userEntersDesiredSearchText() {
		
		String homepageSearchBar = locators.getProperty("homepageSearchBar");
		utilities.fillDataInTextBox(getDriver(), homepageSearchBar, testData.getProperty("searchData"));
	}
	
	public void userClicksSearchBtn() {
		
		String iconSearch = locators.getProperty("iconSearch");
		utilities.clickElement(getDriver(), iconSearch);
	}
	
	public void userIsTakenToPLP() {
		String productList = locators.getProperty("productList");
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), productList));
	}
	
	public void userSelectsAnyProduct() {
		String productList = locators.getProperty("productList");
		List<WebElement> listOfProducts = utilities.findElements(getDriver(), productList);
		utilities.clickListElement(listOfProducts);
	}
	
	public void userIsTakenToProductPage() {
		utilities.switchTab(getDriver(), 1);
		String pdpProductImage = locators.getProperty("pdpProductImage");
		String pdpProductDescription = locators.getProperty("pdpProductDescription");
		String pdpAvailableSizes = locators.getProperty("pdpAvailableSizes");
		
		utilities.verifyElementIsDisplayed(getDriver(), pdpProductImage);
		utilities.verifyElementIsDisplayed(getDriver(), pdpProductDescription);
		utilities.verifyElementIsDisplayed(getDriver(), pdpAvailableSizes);
	}
	
	public void userSelectsSize() {
		String pdpAvailableSizes = locators.getProperty("pdpAvailableSizes");
		List<WebElement> listOfSizes = utilities.findElements(getDriver(), pdpAvailableSizes);
		utilities.clickListElement(listOfSizes);
	}
	
	public void productIsAddedToBag() {
		String pdpBtnAddToBag = locators.getProperty("pdpBtnAddToBag");
		String pdpBtnGoToCart = locators.getProperty("pdpBtnGoToCart");
		
		utilities.clickElement(getDriver(), pdpBtnAddToBag);
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), pdpBtnGoToCart));
	}
	
	public void userClicksCartIcon() throws InterruptedException {
		String pdpBtnGoToCart = locators.getProperty("pdpBtnGoToCart");
		Thread.sleep(3000);
		utilities.waitForElementToBeClickable(getDriver(), pdpBtnGoToCart);
		utilities.clickElement(getDriver(), pdpBtnGoToCart);
	}
	
	public void userIsTakenToCartPage() {
		String orderSummarySection = locators.getProperty("orderSummarySection");
		String btnPlaceOrder = locators.getProperty("btnPlaceOrder");
		
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), orderSummarySection));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), btnPlaceOrder));
	}
	
	public void userClicksPlaceOrderButton() {
		String btnPlaceOrder = locators.getProperty("btnPlaceOrder");
		utilities.clickElement(getDriver(), btnPlaceOrder);
	}
	
	public void userIsTakenToAddAddressPage() {
		String addressForm = locators.getProperty("addressForm");
		String txtBoxName = locators.getProperty("txtBoxName");
		String txtBoxPhone = locators.getProperty("txtBoxPhone");
		String txtBoxPin = locators.getProperty("txtBoxPin");
		String txtBoxStreet = locators.getProperty("txtBoxStreet");
		String txtBoxLocaity = locators.getProperty("txtBoxLocaity");
		String txtBoxCity = locators.getProperty("txtBoxCity");
		String txtBoxState = locators.getProperty("txtBoxState");
		String btnSave = locators.getProperty("btnSave");
		
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), addressForm));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), txtBoxName));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), txtBoxPhone));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), txtBoxPin));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), txtBoxStreet));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), txtBoxLocaity));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), txtBoxCity));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), txtBoxState));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), btnSave));
		
	}
	
	public void userEntersAddress() {
		
		String txtBoxName = locators.getProperty("txtBoxName");
		String txtBoxPhone = locators.getProperty("txtBoxPhone");
		String txtBoxPin = locators.getProperty("txtBoxPin");
		String txtBoxStreet = locators.getProperty("txtBoxStreet");
		String txtBoxLocaity = locators.getProperty("txtBoxLocaity");
		String addressTypeSelection = locators.getProperty("addressTypeSelection");
		String defaultAddressCheckbox = locators.getProperty("defaultAddressCheckbox");
		List<WebElement> typesOfAddress = utilities.findElements(getDriver(), addressTypeSelection);
		
		utilities.fillDataInTextBox(getDriver(), txtBoxName, testData.getProperty("name"));
		utilities.fillDataInTextBox(getDriver(), txtBoxPhone, testData.getProperty("mobile"));
		utilities.fillDataInTextBox(getDriver(), txtBoxPin, testData.getProperty("pinCode"));
		utilities.fillDataInTextBox(getDriver(), txtBoxStreet, testData.getProperty("streetName"));
		utilities.fillDataInTextBox(getDriver(), txtBoxLocaity, testData.getProperty("localityName"));
		utilities.clickListElement(typesOfAddress);
		utilities.clickElement(getDriver(), defaultAddressCheckbox);
			
	}
	
	public void userClicksSaveButton() {
		String btnSave = locators.getProperty("btnSave");
		utilities.clickElement(getDriver(), btnSave);
		String btnContinue = locators.getProperty("btnContinue");
		utilities.clickElement(getDriver(), btnContinue);
		
	}
	
	public void userIsTakenToPaymentPage() {
		String paymentBlock = locators.getProperty("paymentBlock");
		String txtBoxCreditCardNumber = locators.getProperty("txtBoxCreditCardNumber");
		String txtBoxCardName = locators.getProperty("txtBoxCardName");
		String drpdwnExpMnth = locators.getProperty("drpdwnExpMnth");
		String drpdwnExpYear = locators.getProperty("drpdwnExpYear");
		String txtBoxCVV = locators.getProperty("txtBoxCVV");
		
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), paymentBlock));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), txtBoxCreditCardNumber));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), txtBoxCardName));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), drpdwnExpMnth));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), drpdwnExpYear));
		Assert.assertTrue(utilities.verifyElementIsDisplayed(getDriver(), txtBoxCVV));
		
		
	}
	
	public void userEntersPaymentDetails() {
		
		String txtBoxCreditCardNumber = locators.getProperty("txtBoxCreditCardNumber");
		String txtBoxCardName = locators.getProperty("txtBoxCardName");
		String drpdwnExpMnth = locators.getProperty("drpdwnExpMnth");
		String drpdwnExpYear = locators.getProperty("drpdwnExpYear");
		String txtBoxCVV = locators.getProperty("txtBoxCVV");
		
		utilities.fillDataInTextBox(getDriver(), txtBoxCreditCardNumber, testData.getProperty("creditCardNumber"));
		utilities.fillDataInTextBox(getDriver(), txtBoxCardName, testData.getProperty("creditCardName"));
		utilities.fillDataInTextBox(getDriver(), txtBoxCVV, testData.getProperty("creditCardCVV"));
		
		Select expMnthDrpDwn = new Select(utilities.findElement(getDriver(), drpdwnExpMnth));
		Select expYearDrpDwn = new Select(utilities.findElement(getDriver(), drpdwnExpYear));
		expMnthDrpDwn.selectByIndex(4);
		expYearDrpDwn.selectByIndex(2);
	}
}
