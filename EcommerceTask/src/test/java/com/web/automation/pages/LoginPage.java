package com.web.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email")
	@CacheLookup 
	WebElement txtUsername;
	
	@FindBy(id = "passwd")
	@CacheLookup 
	WebElement txtPassword;
	
	@FindBy(id = "SubmitLogin")
	@CacheLookup 
	WebElement btnSubmit;
	
	
			







}
