package com.web.automation.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.web.automation.utility.ConfigReader;

public class DriverInstance {
	public static WebDriver driver = null;
	
	//Initiate Driver instance
	public static void startDriverInstance() {
		Properties prop = new Properties();
		ConfigReader.readProjectConfiguration("BrowserName").equalsIgnoreCase("Chrome");
		{
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		//else (ConfigReader.readElementLocators("BrowserName").equalsIgnoreCase("Firefox"))
		//{
			//System.setProperty("webdriver.gecko.driver", "Driver/chromedriver.exe");
			//driver = new FirefoxDriver();
		//}
		
	
	
	driver.manage().window().maximize();
	driver.get(ConfigReader.readProjectConfiguration("ApplicationURL"));
}

	//       Returning driver Instance
	public WebDriver getDriverInstance() {
		if(driver!=null) {
			return driver;
		}
		else
		{
			DriverInstance.startDriverInstance();
			return driver;
		}
	}
	
	
	//Setting driver instance to null
	public static void setDriverInstanceToNull() {
		driver = null;
	}

}
