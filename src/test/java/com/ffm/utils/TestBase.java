package com.ffm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	//constructor to initialize the properties file
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream inputProperties= new FileInputStream(
					"src/test/java/com/ffm/config/config.properties");
			prop.load(inputProperties);
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		  }
			
	}
	        //Initialize the driver
			public static void initializeDriver() {
				
				//Local variable
				String browserName= prop.getProperty("browser");
				
				if (browserName.equals("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver= new FirefoxDriver();
					
				}else if (browserName.equals("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver= new ChromeDriver();
					
				}else if (browserName.equals("edge")) {
					WebDriverManager.edgedriver().setup();
					driver= new SafariDriver();
				}
				 
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(prop.getProperty("baseURL"));	
			}
}

