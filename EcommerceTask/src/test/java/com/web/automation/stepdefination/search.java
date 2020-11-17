package com.web.automation.stepdefination;


//import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.web.automation.base.DriverInstance;

@RunWith(Cucumber.class)
public class search {
	WebDriver driver = null;
	//Actions action;
	//public search(WebDriver driver) {
		//action = new Actions(driver);
//	}

    
    @Given("^User is logged in$")
    public void user_is_logged_in() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	 String Actual = driver.getTitle();
        String Expected = "My Store";

        if (Actual.equals(Expected)) {
                   System.out.println("Test Passed!");
        } else {
                   System.out.println("Test Failed");
        }}

    @When("^User enters text in the search text box$")
    public void user_enters_text_in_the_search_text_box() throws Throwable {
       driver.findElement(By.id("search_query_top")).sendKeys("Printed");}

   

    @And("^User click search button$")
    public void user_click_search_button() throws Throwable {
       
    	driver.findElement(By.name("submit_search")).click();
    	}

    @Then("^User should be on search page$")
    public void user_should_be_on_search_page() throws Throwable {
    	System.out.println("User successfully see the search products");
    }

	}

