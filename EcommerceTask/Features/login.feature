Feature: Login to the application

Scenario: Registered user come to application, login
Given 	User is on login page
When 	User enters email address
And 	User enters Password
And 	User enters signin buton 
Then 	User should be loggedin


Scenario: logged in user come to application, search for products
Given   User is logged in
When 	User enters text in the search text box
And 	User click search button 
Then 	User should be on search page
And 	User able to see search products
When    User click on add to cart link for the selected product
Then 	Pop-up should be populated 