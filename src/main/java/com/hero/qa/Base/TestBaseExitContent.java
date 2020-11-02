package com.hero.qa.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBaseExitContent {	
	

	public static WebDriver driver;
	
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Savita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");		
		driver = new ChromeDriver();		
		
		//delete all cookies
		driver.manage().deleteAllCookies();	
				 
		//Launch browser
		driver.get("https://the-internet.herokuapp.com/exit_intent");
		
		driver.manage().window().maximize();
	}
	

	
	public static void WaitForObjectToInvisible(WebElement element){
		new WebDriverWait(driver, 40).until(ExpectedConditions.invisibilityOf(element));
		
	}
	
	public static void waitForObjectToVisible(WebElement element) {
		new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOf(element));
		
	}

}
