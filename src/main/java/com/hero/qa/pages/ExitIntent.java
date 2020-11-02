package com.hero.qa.pages;
import java.awt.Robot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hero.qa.Base.TestBaseExitContent;

public class ExitIntent extends TestBaseExitContent{
	
	@FindBy(xpath=".//*[@id='ouibounce-modal']/div[2]/div[3]/p")
	WebElement OutBoundModel;
	
	//+++++++++++++++++++++
	public ExitIntent() {
		
		 PageFactory.initElements(driver, this);
	}
	
	//++++++++++++++++++++++++++
	
	public ExitIntent testExitIntent() {
		
		Robot robot;
		try {
			robot = new Robot();
	        robot.mouseMove(600,0);
	        
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		 
		OutBoundModel.click();
        waitForObjectToVisible(OutBoundModel);	              
         
		return new ExitIntent();
	}
	
	
}
