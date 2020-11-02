package com.hero.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hero.qa.Base.TestBase1;
import com.hero.qa.pages.DynamicControls;

public class DynamicControlsTest extends TestBase1 {
	
		DynamicControls DynamicControls;
		
		public DynamicControlsTest(){				
				super();		
		}
		
		@BeforeMethod	
		public void setUp(){		
			initialization();					
			DynamicControls = new DynamicControls();
		}
		
		@Test(priority=1)
		public void VerifyDynamicControls() {	
			DynamicControls = DynamicControls.verifyinputfieldEnable();
		}	
	
		@AfterMethod	
		public void tearDown() {
			driver.quit();
		}
	
	
	
	
}
