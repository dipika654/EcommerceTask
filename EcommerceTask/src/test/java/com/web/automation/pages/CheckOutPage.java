package com.web.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
public WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	

	public WebElement btnproceedtocheckout(){
     return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));}
	
	public WebElement btnsummarypagecheckout(){
	     return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));}
}
