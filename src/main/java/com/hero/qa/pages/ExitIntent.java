package com.hero.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.hero.qa.Base.TestBaseExitContent;

public class ExitIntent extends TestBaseExitContent{
	
	
	public ExitIntent testExitIntent() {
		
		//Switch to Alert pop up 
		
		 WebElement e = driver.findElement(By.cssSelector("h3"));
	        Actions action = new Actions(driver);
	        action.moveToElement(e).moveByOffset(600,-1).build().perform();
	        driver.findElement(By.xpath(".//*[@id='ouibounce-modal']/div[2]/div[3]/p")).click();
	    			
		return new ExitIntent();
	}
	
	
}
