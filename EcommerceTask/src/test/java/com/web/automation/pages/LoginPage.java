package com.web.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import com.web.automation.base.DriverInstance;


public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement btnSignIn(){
        return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));}
	
	public WebElement txtUsername(){
        return driver.findElement(By.id("email"));}
	
	
	public WebElement txtPassword(){
        return driver.findElement(By.id("passwd"));}
	
	public WebElement btnSubmit(){
        return driver.findElement(By.id("SubmitLogin"));}
}
