package com.web.automation.stepdefination;


import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.web.automation.base.DriverInstance;

@RunWith(Cucumber.class)
public class search {
	Actions action;
	public search(WebDriver driver) {
		action = new Actions(driver);
	}

    @When("^	User enters text for search in the search text box$")
    public void user_enters_text_for_search_in_the_search_text_box() throws Throwable {
    	
    	DriverInstance.driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
    }

    @Then("^	User should be see search page $")
    public void user_should_be_see_search_page() throws Throwable {
        throw new PendingException();
    }

    @And("^	User click search button $")
    public void user_click_search_button() throws Throwable {
        throw new PendingException();
    }

}