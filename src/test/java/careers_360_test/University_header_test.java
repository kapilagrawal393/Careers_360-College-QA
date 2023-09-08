package careers_360_test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.University_header_page;

public class University_header_test extends Baselibrary 
{
	University_header_page ob;

	@Parameters("env")
	@BeforeTest

	public void geturllaunch1(String env) 
	{
		geturllaunch(getreaddata(env));
		ob = new University_header_page();
	}

//	@Test(dataProvider="getData")
//	public void placeOrder(HashMap<String,String> input)
//	{				
//			//input.get("url");
//		ob.getReadJsonData(null);
//	}
	
//	@Test(priority = 1)
//	public void Verifying_University_Title() {
//		ob.Verifying_University_Title();
//	}
//
//	@Test(priority = 2)
//	public void Verifying_Precense_of_Careers360_Logo() {
//		ob.Verifying_Precense_of_Careers360_Logo();
//	}
//
//	@Test(priority = 3)
//	public void verifyVisibleOfBrowseByStream()
//	{
//		ob.verifyVisibleOfBrowseByStream();
//	}
//	
//	@Test(priority = 4)
//	public void verifySearchBar()
//	{
//		ob.verifySearchBar();
//	}
//		
//	@Test(priority = 5)
//	public void Verifying_Searching_Icon() {
//		ob.Verifying_Searching_Icon();
//	}
//
//	@Test(priority = 6)
//	public void Verifying_Precense_of_University_Logo() {
//		ob.Verifying_Precense_of_University_Logo();
//	}
//
//	@Test(priority = 7)
//	public void click_On_Home() {
//		ob.click_On_Home();
//	}
//
//	@Test(priority = 8)
//	public void clickon_University_In_India() {
//		ob.clickon_University_In_India();
//	}
//
//	@Test(priority = 9)
//	public void clickon_University_In_City() {
//		ob.clickon_University_In_City();
//	}
//
//	@Test(priority = 10)
//	public void Verify_College_Title() {
//		ob.Verify_College_Title();
//	}
//
//	@Test(priority = 11)
//	public void click_On_City() {
//		ob.click_On_City();
//	}
//
//	@Test(priority = 12)
//	public void click_On_State() throws InterruptedException {
//		ob.click_On_State();
//	}
//
//	@Test(priority = 13)
//	public void clickon_ratingsummary() throws InterruptedException {
//		ob.clickon_ratingsummary();
//	}
//
//	@Test(priority = 14)
//	public void clickon_QandA() throws InterruptedException {
//		ob.clickon_QandA();
//	}
//
//	@Test(priority = 15)
//	public void clickOnCTA() throws InterruptedException {
//		ob.clickOnCTA();
//	}
//	
//	@Test(priority = 1)
//	public void clickOnSubTupple() throws InterruptedException
//	{
//		ob.clickOnSubTupple();
//	}
	@Test(priority = 17)
	public void getH2Title() throws IOException, InterruptedException
	{  
		ob.getH2Title();
    }
	
	@Test(priority = 18)
	public void getH3Title() throws IOException, InterruptedException
	{  
		ob.getH3Title();
    }
	
	
}	
	
	
	
