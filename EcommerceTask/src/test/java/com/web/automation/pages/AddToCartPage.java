package com.web.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {
	public WebDriver driver;
	
	public AddToCartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public WebElement image(){
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img"));
        }
	
	public WebElement btnAddtocart(){
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span"));
        }
	
}