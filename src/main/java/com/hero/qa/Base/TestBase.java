package com.hero.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		
		
		try{						
			prop = new Properties();
			
			FileInputStream ip = new FileInputStream("C:\\Users\\Savita\\eclipse-workspace\\testui1\\src\\main\\java\\com\\hero\\qa\\config\\config.properties");
			//Load the values from the config file
			prop.load(ip);				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Savita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");		
			driver = new ChromeDriver();	
		}
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		//Launch browser
		driver.get(prop.getProperty("url"));
	}
	
	public static void WaitForObject(WebElement element){
		new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void WaitForClickableObject(WebElement element) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(element));
		
	}

}
