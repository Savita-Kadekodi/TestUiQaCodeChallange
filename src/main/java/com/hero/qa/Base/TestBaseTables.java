package com.hero.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TestBaseTables {
	
	
		public static WebDriver driver;
		public static long IMPLICIT_WAIT =3;
			
			public static void initialization() {
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Savita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");		
				driver = new ChromeDriver();		
				
				//delete all cookies
				driver.manage().deleteAllCookies();
				
				driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
				
				//Launch browser
				driver.get("https://the-internet.herokuapp.com/tables");
			}
			

			public static void WaitForObject(WebElement element){
				new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOf(element));
				
			}
			
			public static void WaitForObjectToInvisible(WebElement element){
				new WebDriverWait(driver, 40).until(ExpectedConditions.invisibilityOf(element));
				
			}
			
			public static void WaitForClickableObject(WebElement element) {
				new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(element));
				
			}



}
