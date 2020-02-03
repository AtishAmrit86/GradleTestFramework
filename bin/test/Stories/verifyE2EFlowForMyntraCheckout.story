Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario:  To verify E2E flow for purchasing a product on Myntra by Searching

Given the user is on homepage
When the user clicks Login button on homepage
Then the user is taken to Login page
When the user enters login credentials
Then the user clicks Login button on the Loginpage
And the user is logged in
When the user search any product in searchbar
Then the user clicks search button
And the user is taken to listing page
When the user selects any product
Then the user is taken to product page
When the user selects the size
Then the user clicks Add To Bag button
And the product is added to the bag
When the user clicks cart icon
Then the user is taken to cart page
When the user clicks Place Order button
Then the user is taken to Add Address Page
When the user enters address details
Then the user clicks Save button
And the user is taken to Payment Page
Then the user enters payment details
