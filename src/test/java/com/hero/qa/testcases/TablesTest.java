package com.hero.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hero.qa.pages.Tables;

import com.hero.qa.Base.TestBaseTables;

public class TablesTest extends TestBaseTables{
	
	
	Tables Tables;
	
	public TablesTest() {
			
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
	  initialization();
	  Tables= new Tables();
		
	}
	
	@Test(priority=1)
	public void sortByLastName() {		
		Tables=Tables.sortByLastName();
		
	}
	
	@Test(priority=2)
	public void sortByFirstName() {
		Tables=Tables.sortByFirstName();
	}
	
	
	@AfterMethod
	public void tearDown() {		
		driver.quit();
	}

}
