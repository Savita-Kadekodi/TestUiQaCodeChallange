package com.hero.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hero.qa.Base.TestBaseWindows;

public class Windows extends TestBaseWindows{
	
	@FindBy(xpath="//a[text()='Click Here']")
	WebElement ClickHere;
	
	
	//++++++++++++++++++++++++++
		public Windows(){	
		
			PageFactory.initElements(driver, this);			 
		}
			
	//++++++++++++++++++++++++++++++
		
	public Windows checkNewTab() {
		
		ClickHere.click();
		
		Set<String> handler=driver.getWindowHandles();
		
		int num = handler.size();
		
			if(num>1) {
				
				System.out.println("A new tab or window has been opened");
			}
		
		Iterator<String> it=handler.iterator();
		
		String parentwindID=it.next();
		
		System.out.println("parent window ID is " + parentwindID);
		
		
		String NewWindowID = it.next();
		System.out.println("child window ID is " + NewWindowID );
		
		
		return new Windows();
	}
		
		
		
		
		
	
}
