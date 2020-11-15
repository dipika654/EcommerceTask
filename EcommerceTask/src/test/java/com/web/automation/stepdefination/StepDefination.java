package com.web.automation.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.web.automation.base.DriverInstance;
//import com.web.automation.utility.ConfigReader;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver driver = null;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		
		
		//DriverInstance.startDriverInstance();
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		
	}

	private WebElement driver(String readElementLocators) {
		// TODO Auto-generated method stub
		return null;
	}

	@When("^User enters email address$")
	public void user_enters_email_address() throws Throwable {
	
	    
	}

	@When("^User enters Password$")
	public void user_enters_Password() throws Throwable {
		
	    
	}

	@When("^User enters signin buton$")
	public void user_enters_signin_buton() throws Throwable {
	

	}
	@Then("^User should be loggedin$")
	public void user_should_be_loggedin() throws Throwable {
	    
	}

	@Given("^User is on registration page$")
	public void user_is_on_registration_page() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
	    
	}

	@When("^User click on create account button$")
	public void user_click_on_create_account_button() throws Throwable {
		
		driver.findElement(By.id("SubmitCreate")).click();
	    
	}

	@Then("^User account should be created$")
	public void user_account_should_be_created() throws Throwable {
		System.out.println("User account is succesfully created");
	   
	}



}
