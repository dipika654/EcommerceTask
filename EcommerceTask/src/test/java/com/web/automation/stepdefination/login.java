package com.web.automation.stepdefination;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.WebDriver;
import com.web.automation.base.DriverInstance;
import com.web.automation.utility.ConfigReader;
import cucumber.api.java.en.*;
import org.junit.Assert;

import com.web.automation.pages.*;
public class login extends DriverInstance 

{	//public WebDriver driver;
	public static LoginPage page;
	public static AddToCartPage addtocartpage;
	
	
	ConfigReader obj= new ConfigReader();

	@Given("^User is on login page")
	public void user_is_on_login_page() throws Throwable {
		
		Properties properties = obj.getProperty();	
		driver = DriverInstance.OpenBrowser(properties.getProperty("browser.name") ,properties.getProperty("browser.baseURL"));
	}

	@When("^User enters email address$")
	public void user_enters_email_address() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		page = new LoginPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOf(page.txtUsername()));
		page.txtUsername().sendKeys("abc@gmail.com");
		
	}

	@When("^User enters Password$")
	public void user_enters_Password() throws Throwable {
		page.txtPassword().sendKeys("abc");
		//driver.findElement(By.id("passwd")).sendKeys("abc"); 
	}

	@When("^User enters signin buton$")
	public void user_enters_signin_buton() throws Throwable {
		page.btnSubmit().click();
		//driver.findElement(By.id("SubmitLogin")).click();btnSubmit

	}
	@Then("^User should be loggedin$")
	public void user_should_be_loggedin() throws Throwable {
	    System.out.println("User successfully logged in");
	}
	  
    @And("^User is logged in$")
    public void user_is_logged_in() throws Throwable {
    	//Properties properties = obj.getProperty();	
		//driver = DriverInstance.OpenBrowser(driver,properties.getProperty("browser.name") ,properties.getProperty("browser.baseURL"));
    	
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



@Then("^User able to see search products$")
public void user_able_to_see_search_products() throws Throwable {
	addtocartpage = new AddToCartPage(driver);
	WebDriverWait wait = new WebDriverWait(driver, 3);
    wait.until(ExpectedConditions.visibilityOf(addtocartpage.image()));
    Assert.assertEquals(true,addtocartpage.image().isDisplayed());
}

@When("^User click on add to cart link for the selected product$")
public void user_click_on_add_to_cart_link_for_the_selected_product() throws Throwable {
	Actions builder = new Actions(driver);
	builder.moveToElement(addtocartpage.image()).perform();
	addtocartpage.btnAddtocart().click();
}

@Then("^Pop-up should be populated$")
public void pop_up_should_be_populated() throws Throwable {
   
}

	}


	
	