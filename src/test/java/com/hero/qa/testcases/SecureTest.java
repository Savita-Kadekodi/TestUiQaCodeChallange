package com.hero.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hero.qa.Base.TestBase;
import com.hero.qa.pages.LoginPage;
import com.hero.qa.pages.Secure;

public class SecureTest extends TestBase{
	
	
	LoginPage LoginPage;
	Secure Secure;
	
	public SecureTest(){
		
		super();		
	}
	
	
	@BeforeMethod	
	public void setUp(){		
		initialization();
		LoginPage = new LoginPage();		
		 
	}
	
	
	@Test
	public void saveContactWithNoValueAdded() {
		Secure=LoginPage.login(prop.getProperty("username21"),prop.getProperty("password21"));
		Secure = Secure.verifySuccessMessage(); 
		LoginPage = Secure.Logout();
		
	}	 
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		

}
