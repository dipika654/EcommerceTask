package com.web.automation.stepdefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import Search.searchFunctionality;

//import com.web.automation.base.DriverInstance;
//import com.web.automation.utility.ConfigReader;


import cucumber.api.java.en.*;


public class login 
{
	WebDriver driver = null;
	
	@Given("^User is on login page")
	public void user_is_on_login_page() throws Throwable {
		
		
		//DriverInstance.startDriverInstance();
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
	}

	@When("^User enters email address$")
	public void user_enters_email_address() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");   
	}

	@When("^User enters Password$")
	public void user_enters_Password() throws Throwable {
		driver.findElement(By.id("passwd")).sendKeys("abc"); 
	    
	}

	@When("^User enters signin buton$")
	public void user_enters_signin_buton() throws Throwable {
		
		driver.findElement(By.id("SubmitLogin")).click();

	}
	@Then("^User should be loggedin$")
	public void user_should_be_loggedin() throws Throwable {
	    System.out.println("User successfully logged in");
	    driver.quit();
	}
}
	
	