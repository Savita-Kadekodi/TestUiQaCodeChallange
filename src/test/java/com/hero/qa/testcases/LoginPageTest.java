package com.hero.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hero.qa.pages.LoginPage;
import com.hero.qa.Base.TestBase;
import com.hero.qa.pages.Secure;

public class LoginPageTest extends TestBase {

	LoginPage LoginPage;
	Secure Secure;
	
	public LoginPageTest(){		
		super();		
	}
	
	@BeforeMethod	
	public void setUp(){		
		initialization();
		LoginPage = new LoginPage();		
	}
	
	@Test
	public void UserNameInvalidMain() {
		for (int i = 1; i <= 18; i++) {
			LoginPage.usernameInvalid(prop.getProperty("username" + i),prop.getProperty("password" + i));	
		}
	}
	
	@AfterMethod	
	public void tearDown() {
		driver.quit();
	}
}
