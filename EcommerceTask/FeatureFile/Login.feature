Feature: Register and non resigter userwill come on application and perform activities

Scenario: Registered user come to application, login
Given 	User is on login page
When 	User enters email address
And 	User enters Password
And 	User enters signin buton 
Then 	User should be loggedin


Scenario: Non Registered user comes to application, Register and login
Given 	User is on registration page
When 	User enters email address 
And 	User click on create account button
Then 	User account should be created
