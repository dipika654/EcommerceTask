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


public class StepDefination 
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
	}
	@When("^User enters text for search in the search text box$")
	public void user_enters_text_for_search_in_the_search_text_box() throws Throwable {
		class searchFunctionality {

			Actions action;
			public searchFunctionality(WebDriver driver) {
				action = new Actions(driver);
			}
			
			//Navigate to next line
			public void pressEnter() {
				action.sendKeys(Keys.ENTER).build().perform();}
			
			// In order to scroll down we use javascriptexecutor interface 
			public void scrollDown(WebDriver driver)
			{
			JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("window.scrollBy(0,2000)", "");
			}
			
			public void performMouseHover(WebElement element) {
				action.moveToElement(element).build().perform();
			}
			
			public void clickUsingJavaScriptExecutor(WebElement element, WebDriver driver )
			{
			JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", element);
			}

		public void main(String[] args) throws IOException {
			

			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			searchFunctionality objSearch = new searchFunctionality(driver);
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			
			WebElement inputSearch = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
			inputSearch.sendKeys("Printed");
			objSearch.pressEnter();
			objSearch.scrollDown(driver);
			String image = "2";
			WebElement searchImage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li["+image+"]/div/div[1]/div/a[1]/img"));
			objSearch.performMouseHover(searchImage);
			String addtocart = "2";
			WebElement btnAddToCart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li["+addtocart+"]/div/div[2]/div[2]/a[1]/span"));
			objSearch.clickUsingJavaScriptExecutor(btnAddToCart, driver);
			
		
		}
		

	@When("^User click search button$")
	public void user_click_search_button() throws Throwable {
		
	}

	@Then("^User should be see search page$")
	public void user_should_be_see_search_page() throws Throwable {
		 System.out.println("User successfully see the search products");
	}
		}}}
