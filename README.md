# TestUiQaCodeChallange

I have a created a Selenium Maven project 'testui1'. 

src/main/java/com.hero.qa.Base has test bases, please set your chromedriver.exe path. 
System.setProperty("webdriver.chrome.driver","*****Chrome dirver path*****");	

The page object model includes 
A. Page layer (found in src/main/java/com.hero.qa.pages)
B. Test layer (found in src/test/java/com.hero.qa.testcases)
C. Test bases (found in src/main/java/com.hero.qa.Base)
D. testNG.xml runner. 
E. Extent report

To run the test cases, go to src/main/resources,testng.xml and right click / Run As / TestNG Suite

Once the test runs, refresh the 'testui1' project.
 
Expand 'test-output', right click on 'Extent.html' and select 'properties'

copy the path shown in 'Location', open a new browser and paste it and hit enter.

Extent report will show the pass / fail results. Test report also shows each of the test case run with date and time

Automation report section shows pie chart reports. I have added a file ('ExtentReport screenshots and info') 
that has Extent report screenshots, instructions to run testNG runner and how to get the extent report.

Tests can be run individually for each of the java class in 'src/test/java/com.hero.qa.testcases'. 
Open the class by double clicking the class. Right click and click / Run As / TestNG Suite.

LoginPageTest.java uses data from config.properties file

SecureTest.java shows the success login test case

++++++++++++++++++++++++++++++

I have added a file 'Postman_TestResults'that has the API tests results. 

   




