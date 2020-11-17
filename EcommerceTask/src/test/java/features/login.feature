Feature: Login to the application

Scenario: Registered user come to application, login
Given 	User is on login page
When 	User enters email address
And 	User enters Password
And 	User enters signin buton 
Then 	User should be loggedin
