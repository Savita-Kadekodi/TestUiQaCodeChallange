package com.hero.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hero.qa.Base.TestBaseExitContent;
import com.hero.qa.pages.ExitIntent;

public class ExitIntentTest extends TestBaseExitContent {
	
	ExitIntent ExitIntent;
	
	public ExitIntentTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
	  initialization();
	  ExitIntent= new ExitIntent();
		
	}
	
	@Test
	public void verifyExitIntent() {
		
		ExitIntent = ExitIntent.testExitIntent();
	}
	
	//@AfterMethod
	public void tearDown() {		
		driver.quit();
	}


}
