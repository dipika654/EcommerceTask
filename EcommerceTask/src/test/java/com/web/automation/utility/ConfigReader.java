package com.web.automation.utility;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {
	
	public static String readProjectConfiguration(String KeyName) {
		String value = null;
		try
		{
				FileReader file = new FileReader(new File("ConfigFiles/ProjectConfiguration.properties"));
				Properties readproperty = new Properties();
				readproperty.load(file);
				return readproperty.getProperty(KeyName).trim();
		}
	catch(Exception exception) {
		exception.printStackTrace();
		throw (new RuntimeException("***ERROR*** : - Key with name "+  KeyName + "does not exists"));
	}

}
	
	public static String readElementLocators(String KeyName) {
		String value=null;
		try
		{
				FileReader file = new FileReader(new File("ElementLocators/Locators.properties"));
				Properties readproperty = new Properties();
				readproperty.load(file);
				return readproperty.getProperty(KeyName).trim();
		}
	catch(Exception exception) {
		exception.printStackTrace();
		throw (new RuntimeException("***ERROR*** : - Locator with name "+  KeyName + "does not exists"));
	}

}
}