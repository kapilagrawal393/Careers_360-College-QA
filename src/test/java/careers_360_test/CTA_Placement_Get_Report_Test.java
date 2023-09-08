package careers_360_test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.CTA_Placement_Get_Report_Page;

public class CTA_Placement_Get_Report_Test extends Baselibrary
{
	CTA_Placement_Get_Report_Page ob;
	@Parameters("env")
	@BeforeTest
	
	public void geturllaunch1(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new CTA_Placement_Get_Report_Page();
	}
	
	@Test(priority=1)
	public void clickon_Placement_Button() 
	{
		ob.clickon_Placement_Button();
	}
	
	@Test(priority = 2)
	public void click_On_Get_Report() throws InterruptedException 
	{
		ob.click_On_Get_Report();
	}

	@Test(priority = 3)
	public void click_On_Frame() 
	{
		ob.click_On_Frame();
	}

	@Test(priority = 4)
	public void get_Signup_Text() 
	{
		ob.get_Signup_Text();
	}

	@Test(priority = 5)
	public void singin_details() throws IOException, AWTException 
	{
		ob.singin_details();
	}
	
	
	
	

}
