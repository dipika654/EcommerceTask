Feature: Register and non resigter userwill come on application and perform activities

Scenario: logged in user come to application, search for products
Given   User is logged in
When 	User enters text in the search text box
And 	User click search button 
Then 	User should be on search page 