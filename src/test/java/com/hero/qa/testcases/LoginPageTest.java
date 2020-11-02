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
	
	
	@Test(priority=1)
	public void loginTest() {			
		Secure=LoginPage.login(prop.getProperty("username"),prop.getProperty("password"));			
	}		
	
	@Test(priority=2)
	public void UserNameInvalid1() {		
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username1"),prop.getProperty("password1"));
	}	
	
	@Test(priority=3)
	public void UserNameInvalid2() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username2"),prop.getProperty("password2"));				
	}	
	
	@Test(priority=4)
	public void UserNameInvalid3() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username3"),prop.getProperty("password3"));				
	}	
	
	@Test(priority=5)
	public void UserNameInvalid4() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username4"),prop.getProperty("password4"));				
	}	
	@Test(priority=6)
	public void UserNameInvalid5() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username5"),prop.getProperty("password5"));				
	}	
	@Test(priority=7)
	public void UserNameInvalid6() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username6"),prop.getProperty("password6"));				
	}	
	@Test(priority=8)
	public void UserNameInvalid7() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username7"),prop.getProperty("password7"));				
	}	
	
	@Test(priority=9)
	public void UserNameInvalid8() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username8"),prop.getProperty("password8"));				
	}	
	
	@Test(priority=10)
	public void UserNameInvalid9() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username9"),prop.getProperty("password9"));				
	}		
	
	@Test(priority=11)
	public void UserNameInvalid10() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username10"),prop.getProperty("password10"));				
	}
	
	@Test(priority=12)
	public void UserNameInvalid11() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username11"),prop.getProperty("password11"));				
	}	
	
	@Test(priority=13)
	public void UserNameInvalid12() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username12"),prop.getProperty("password12"));				
	}	
	@Test(priority=14)
	public void UserNameInvalid13() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username13"),prop.getProperty("password13"));				
	}	
	@Test(priority=15)
	public void UserNameInvalid14() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username14"),prop.getProperty("password14"));				
	}	
	@Test(priority=16)
	public void UserNameInvalid15() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username15"),prop.getProperty("password15"));				
	}	
	
	@Test(priority=17)
	public void UserNameInvalid16() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username16"),prop.getProperty("password16"));				
	}	
	
	@Test(priority=18)
	public void UserNameInvalid17() {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty("username17"),prop.getProperty("password17"));				
	}	
	
	
	
	
	
	
	public void userNameInvalidTest(String test_username, String test_password) {
		LoginPage=LoginPage.usernameInvalid(prop.getProperty(test_username),prop.getProperty(test_password));	
	}
	
	
	@AfterMethod	
	public void tearDown() {
		driver.quit();
	}

	
	
	
	
	

}
