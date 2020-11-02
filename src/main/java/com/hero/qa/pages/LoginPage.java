package com.hero.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.hero.qa.Base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="username")
	WebElement txtBoxUserName;
	
	@FindBy(id="password")
	WebElement txtBoxPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//div[@id='flash']")
	WebElement ErrorFlash;
	
	//++++++++++++++++++++++++++
	
	public LoginPage(){
		 PageFactory.initElements(driver, this);
		 
	 }
	
	//++++++++++++++++++++++++++++++
	
	//Verify to make sure username textbox is displayed
	
	public LoginPage ValidateUserNameTextboxDisplay() {
		
		if(txtBoxUserName.isDisplayed()){
			System.out.println("Textbox username is displayed");
			
		}else System.out.println("Error: Textbox username is not displayed");
		
		return new LoginPage();
	}
	
	public Secure login( String un, String Pwd) {		 
			
		if(txtBoxUserName.isDisplayed()){
		  System.out.println("Textbox username is displayed");
			
		//Enter username	
		 txtBoxUserName.sendKeys(un);	 
		 
		//Enter Password and hit keyboard Enter key to login
		 txtBoxPassword.sendKeys(Pwd + Keys.ENTER);	
		}else 
		  System.out.println("Error: Textbox username is not displayed");
		 
		 return new Secure();
		 
	 }
	
	public LoginPage usernameInvalid( String un, String Pwd) {
		 //Enter username
		 txtBoxUserName.sendKeys(un);	 
		 
		 //Enter Password and hit keyboard Enter key to login
		 txtBoxPassword.sendKeys(Pwd + Keys.ENTER); 
		 
		 if(ErrorFlash.isDisplayed()) {
			System.out.println("Error flash is displayed");
			String errorText= ErrorFlash.getText();
				if(errorText.contains("Your username is invalid!")) {
					System.out.println("username invalid message is displayed");
				}else if(errorText.contains("Your password is invalid!")) {					
					System.out.println("password invalid message is displayed");
				}
		 }
		 	
		 return new LoginPage();
	} 
	
	
	
	
	
			
	
	
	

}
