Feature: Login to the application

Scenario: Registered user come to application, login
Given   User is on home page
When 	User enters text in the search text box
And 	User click search button 
Then 	User should be on search page
And 	User able to see search products
When    User click on add to cart link for the selected product
And 	Product successfully added popup should be populated 
And 	User click on proceed to checkout button
And 	User is on shopping cart summary page
When 	User click on proceed to checkout button on summary page
Then 	User is on signin page
When 	User enters email address
And 	User enters Password
And 	User enters signin buton 
Then 	User should be loggedin
