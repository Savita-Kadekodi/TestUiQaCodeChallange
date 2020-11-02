package com.hero.qa.pages;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hero.qa.Base.TestBase1;

public class DynamicControls extends TestBase1 {
	
	@FindBy(xpath="//input[@type='text']")
	WebElement inputField;
	
	@FindBy(xpath="//button[@onclick='swapInput()']")
	WebElement enableDisableButton;
	
	@FindBy(xpath="//p[@id='message']")
	WebElement message;	
		
	@FindBy(xpath="//div[@id='loading']")
	WebElement ajaxLoding;	
	
	
	//++++++++++++++++++++++++++
	public DynamicControls(){	
	
		PageFactory.initElements(driver, this);			 
	}
		
	//++++++++++++++++++++++++++++++
		
	
	public DynamicControls verifyinputfieldEnable() {
		
		String inputVal= "test";
		
		//Click enable button
		enableDisableButton.click();			
			
		//Wait for the completion of the Async process			
		WaitForObjectToInvisible(ajaxLoding);	
			
		String enabledMsg=message.getText();
		
			if(enabledMsg.contains("It's enabled!")) {
				System.out.println("Input field is enabled");			
			}
			
		inputField.sendKeys(inputVal);						
		enableDisableButton.click();
					
			
		//Wait for the completion of the Async process			
		WaitForObjectToInvisible(ajaxLoding);	
		
		String disableMsg1=message.getText();
		
			if(disableMsg1.contains("It's disabled!")) {
			   System.out.println("Input field is disabled");
			}		
				
		//Get the text stored in the input field and validate with the input string entered.
		String valStored = inputField.getAttribute("value");
		Assert.assertEquals(valStored, inputVal);
		
		return new DynamicControls();
	}
		
			
}



