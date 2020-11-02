package com.hero.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hero.qa.Base.TestBaseWindows;
import com.hero.qa.pages.Windows;

public class WindowsTest extends TestBaseWindows{
	
	Windows Windows;
	
	public WindowsTest() {
		
		super();
	}
	
	
	@BeforeMethod	
	public void setUp(){		
		initialization();					
		Windows = new Windows();
	}
	
	@Test
	public void VerifyNewtabCreated() {
		Windows=Windows.checkNewTab();
	}
	
	@AfterMethod	
	public void tearDown() {
		driver.quit();
	}
	

}
