package com.web.automation.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public Properties getProperty() throws IOException
	{
		FileInputStream inputStream = null;
		Properties properties =  new Properties();
		try
		{
			properties.load(new FileInputStream("ConfigFiles/ProjectConfiguration.properties"));
		} catch(Exception e)
		{
			System.out.println("Exception: "+ e);
		}
		return properties;
	}
}
	