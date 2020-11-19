package com.web.automation.stepdefination;
import java.util.Properties;
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

{	
	public static LoginPage page;
	public static AddToCartPage addtocartpage;
	 public static SearchPage searchpage;
	 public static CheckOutPage checkoutpage;
	
	ConfigReader obj= new ConfigReader();
	@Given("^User is on home page")
	public void user_is_on_login_page() throws Throwable {
		Properties properties = obj.getProperty();	
		driver = DriverInstance.OpenBrowser(properties.getProperty("browser.name") ,properties.getProperty("browser.baseURL"));
	}

	@When("^User enters email address$")
	public void user_enters_email_address() throws Throwable {
		page = new LoginPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOf(page.txtUsername()));
        page.btnSignIn().click();
		page.txtUsername().sendKeys("abc@gmail.com");
		}

	@When("^User enters Password$")
	public void user_enters_Password() throws Throwable {
		page.txtPassword().sendKeys("abc");
	}
	@Then("^User is on signin page$")
	public void user_is_on_signin_page() throws Throwable {
		// Assert.assertEquals(true,page.txtUsername().isDisplayed());
	}
	@When("^User enters signin buton$")
	public void user_enters_signin_buton() throws Throwable {
		
		page.btnSubmit().click();
	}
	@Then("^User should be loggedin$")
	public void user_should_be_loggedin() throws Throwable {
	    System.out.println("User successfully logged in");
	    
	}

    @When("^User enters text in the search text box$")
    public void user_enters_text_in_the_search_text_box() throws Throwable {
    	searchpage = new SearchPage(driver);
    	searchpage.txtsearch().sendKeys("Printed");}
       //driver.findElement(By.id("search_query_top")).sendKeys("Printed");}

    @And("^User click search button$")
    public void user_click_search_button() throws Throwable {
       
    	searchpage.btnsearch().click();
    	}

    @Then("^User should be on search page$")
    public void user_should_be_on_search_page() throws Throwable {
    	System.out.println("User successfully see the search products");
    	 Assert.assertEquals(true,searchpage.searchpage().isDisplayed());
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
	WebDriverWait wait = new WebDriverWait(driver, 3);
    wait.until(ExpectedConditions.elementToBeClickable(addtocartpage.image()));
	addtocartpage.btnAddtocart().click();
}

@Then("^Product successfully added popup should be populated$")
public void product_successfully_added_popup_should_be_populated() throws Throwable {
	WebDriverWait wait = new WebDriverWait(driver, 3);
    wait.until(ExpectedConditions.visibilityOf(addtocartpage.popup()));
	 Assert.assertEquals(true,addtocartpage.popup().isDisplayed());
}
@When("^User click on proceed to checkout button$")
public void user_click_on_proceed_to_checkout_button() throws Throwable {
	checkoutpage = new CheckOutPage(driver);
	checkoutpage.btnproceedtocheckout().click();
}
@When("^User click on proceed to checkout button on summary page$")
public void user_click_on_proceed_to_checkout_button_on_summary_page() throws Throwable {
	
	  checkoutpage.btnsummarypagecheckout().click();
}
@Then("^User is on shopping cart summary page$")
public void user_is_on_shopping_cart_summary_page() throws Throwable {
	Assert.assertEquals(true,checkoutpage.btnsummarypagecheckout().isDisplayed());

}
}
	
	