package com.hero.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.hero.qa.Base.TestBaseTables;

public class Tables extends TestBaseTables{
	
	@FindBy(id="table1")
	WebElement Table1;
	
	@FindBy(id="table2")
	WebElement Table2;
	
//+++++++++++++++++++++++
	public Tables(){
		
		PageFactory.initElements(driver, this);		
	}
//+++++++++++++++++++++++
	
	public Tables sortByLastName() {
		
		
		WaitForObject(Table1);
		
		WebElement tbody=Table1.findElement(By.tagName("tbody"));
		
		List<WebElement> rows=tbody.findElements(By.tagName("tr"));
		int rowC=rows.size();		
			
		//get the default last names and add it to array list		
		ArrayList<String> obtainedList = new ArrayList<>();
			for(int x=0; x<rowC; x++) {
				//get the last names from table	
				String lastNames=rows.get(x).findElement(By.tagName("td")).getText();
				obtainedList.add(lastNames);
			}
			
		//sort the lastnames manually		
		Collections.sort(obtainedList);
		System.out.println("obtained List "+ obtainedList);
			
		//Click Last Name header to sort the column			
		List<WebElement> headers=Table1.findElements(By.tagName("th"));
				
			for(int i=0; i<headers.size(); i++) {
				
				String LN=headers.get(i).getText();
					if(LN.equals("Last Name")) {
					  //click for (A..Z)order 
					  headers.get(i).click(); 
					
					}
			}	
			
		tbody=Table1.findElement(By.tagName("tbody"));
			
		rows=tbody.findElements(By.tagName("tr"));

		ArrayList<String>sortedList = new ArrayList<>();

		for(int y=0; y<rows.size(); y++) {
			//get the sorted last names from table	
			String sortedLastNames=rows.get(y).findElement(By.tagName("td")).getText();
			
			//add the sorted values to array list
			sortedList.add(sortedLastNames);						
		}
		
		//compare manually sorted list to the sorted list after the click		
		Assert.assertTrue(sortedList.equals(obtainedList));		
		
		return new Tables();
	}
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++	
	
	
	 public  Tables sortByFirstName() {
		 
		 WaitForObject(Table2);
			
			WebElement tbody=Table2.findElement(By.tagName("tbody"));
			
			List<WebElement> rows=tbody.findElements(By.tagName("tr"));
		
				
			//get the default first names and add it to array list		
			ArrayList<String> obtainedList = new ArrayList<>();
				for(int x=0; x<rows.size(); x++) {
					//get the first names from table
					List<WebElement> firstNames=rows.get(x).findElements(By.tagName("td"));
					obtainedList.add(firstNames.get(1).getText());
				}
				
			//sort the first names manually		
			Collections.sort(obtainedList);
			System.out.println("obtained List "+ obtainedList);
				
			//Click Last Name header to sort the column			
			List<WebElement> headers=Table2.findElements(By.tagName("th"));
					
				for(int i=0; i<headers.size(); i++) {
					
					String LN=headers.get(i).getText();
						if(LN.equals("First Name")) {
						  //click for (A..Z)order 
						  headers.get(i).click(); 
						  
						}
				}	
				
			tbody=Table2.findElement(By.tagName("tbody"));
				
			rows=tbody.findElements(By.tagName("tr"));

			ArrayList<String>sortedList = new ArrayList<>();

			for(int y=0; y<rows.size(); y++) {
				//get the sorted first names from table	
				List<WebElement> sortedFirstNames=rows.get(y).findElements(By.tagName("td"));
				
				//add the sorted values to array list
				sortedList.add(sortedFirstNames.get(1).getText());							
			}
			
			//compare manually sorted list to the sorted list after the click		
			Assert.assertTrue(sortedList.equals(obtainedList));		
			
			return new Tables();
		 
	 }
	
}