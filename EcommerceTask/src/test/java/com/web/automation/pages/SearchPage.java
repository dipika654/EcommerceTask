package com.web.automation.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage {
	public WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	

	//public WebElement txtUsername(){
    // return driver.findElement(By.id("email"));}
    public WebElement txtsearch(){
    return driver.findElement(By.id("search_query_top"));
    }

public WebElement btnsearch(){
    return driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
    }
public WebElement searchpage(){
    return driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
    }

}