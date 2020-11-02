package com.hero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hero.qa.Base.TestBase;

public class Secure extends TestBase {	
	
	

	@FindBy(xpath="//div[@class='flash success']")
	WebElement flashSuccess;
	
	@FindBy(xpath="//a[@class='button secondary radius']")
	WebElement btnLogOut;
	
	//+++++++++++++++++++++++++
	public Secure() {
		
		 PageFactory.initElements(driver, this);
	}
	
	//+++++++++++++++++++++++
	
	public Secure verifySuccessMessage() {
		
		WaitForObject(flashSuccess);
		
			if(flashSuccess.isDisplayed()) {
				
				System.out.println("User logged in successfully");
				String successMsg = flashSuccess.getText();
				
				if(successMsg.contains("You logged into a secure area!")) {
					System.out.println("Success message text is verified");
				}
				
			}
		return new Secure();
	}
	
	
	public LoginPage Logout() {
		
		if(btnLogOut.isDisplayed()) {
			btnLogOut.click();
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, "https://the-internet.herokuapp.com/login" );
		}		
		
		return new LoginPage();
	}
	

}
