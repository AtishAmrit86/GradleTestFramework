package com.myntrafrntendautomation.testSteps;

import org.jbehave.core.annotations.*;

import com.myntafrntendautomation.testMethods.testMethods;



public class testSteps {
	
public testMethods testMthds;
	
	@Given("the user is on homepage")
	public void userOpensHomePage() {
		testMthds.openHomePage();
	}
	
	@When("the user clicks Login button on homepage")
	public void userClicksLoginOnHomePage() {
		testMthds.userClicksLogin();
	}
	
	@Then("the user is taken to Login page")
	public void userIsOnLoginPage() {
		testMthds.userIsTakenToLoginPage();
	}
	
	@When("the user enters login credentials")
	public void userEnterLoginCredentials() {
		testMthds.userEntersLoginCredentials();
	}
	
	@Then("the user clicks Login button on the Loginpage")
	public void userClicksLoginBtnOnLoginPage() {
		testMthds.userClicksLoginButtonOnLoginPage();
	}
	
	@Then("the user is logged in")
	public void userIsLoggedIn() {
		testMthds.userIsLoggedIn();
		
	}
	
	@When("the user search any product in searchbar")
	public void userEntersDesiredSearchText() {
		testMthds.userEntersDesiredSearchText();
	}
	
	@Then("the user clicks search button")
	public void userClicksSearchButton() {
		testMthds.userClicksSearchBtn();
	}
	
	@Then("the user is taken to listing page")
	public void userIsTakenToListingPage() {
		testMthds.userIsTakenToPLP();
	}
	
	@When("the user selects any product")
	public void userSelectsAnyProduct() {
		testMthds.userSelectsAnyProduct();
	}
	
	@Then("the user is taken to product page")
	public void userIsTakenToProductPage() {
		testMthds.userIsTakenToProductPage();
	}
	
	@When("the user selects the size")
	public void userSelectsSize() {
		
	}
	
	@Then("the user clicks Add To Bag button")
	public void userClicksAddToBagButton() {
		testMthds.userSelectsSize();
	}
	
	@Then("the product is added to the bag")
	public void productIsAddedToBag() {
		testMthds.productIsAddedToBag();
	}
	
	@When("the user clicks cart icon")
	public void userClicksCartIcon() throws InterruptedException {
		testMthds.userClicksCartIcon();
	}
	
	@Then("the user is taken to cart page")
	public void userIsTakenToCartPage() {
		testMthds.userIsTakenToCartPage();
	}
	
	@When("the user clicks Place Order button")
	public void userClicksPlaceOrderButton() {
		testMthds.userClicksPlaceOrderButton();
	}
	
	@Then("the user is taken to Add Address Page")
	public void userIsTakenToAddAddressPage() {
		testMthds.userIsTakenToAddAddressPage();
	}
	
	@When("the user enters address details")
	public void userEntersAddress() {
		testMthds.userEntersAddress();
	}
	
	@Then("the user clicks Save button")
	public void userClicksSaveButton() {
		testMthds.userClicksSaveButton();
	}
	
	@Then("the user is taken to Payment Page")
	public void userIsTakenToPaymentPage() {
		testMthds.userIsTakenToPaymentPage();
	}
	
	@Then("the user enters payment details")
	public void userEntersPaymentDetails() {
		testMthds.userEntersPaymentDetails();
	}
}