package careers_360_test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.CTA_Notable_Alumni_Compare_Page;

public class CTA_Notable_Alumni_Compare_Test extends Baselibrary
{
	CTA_Notable_Alumni_Compare_Page ob;
	@Parameters("env")
	@BeforeTest
	
	public void geturllaunch1(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new CTA_Notable_Alumni_Compare_Page();
	}
	
	@Test(priority=1)
	public void clickon_Notable_Alumni() 
	{
		ob.clickon_Notable_Alumni();
	}
	@Test(priority=2)
	public void click_On_Compare() throws InterruptedException
	{
		ob.click_On_Compare();
	}
	@Test(priority=3)
	public void clickon_2nd_college() throws InterruptedException, AWTException
	{
		ob.clickon_2nd_college();
	}
	@Test(priority=4)
	public void clickon_3rd_college() throws InterruptedException, AWTException
	{
		ob.clickon_3rd_college();
	}
	@Test(priority=5)
	public void clickon_4th_college() throws InterruptedException, AWTException
	{
		ob.clickon_4th_college();
	}
	@Test(priority=6)
	public void scroll_page()
	{
		ob.scroll_page();
	}
	@Test(priority=7)
	public void click_On_Frame() 
	{
		ob.click_On_Frame();
	}
	@Test(priority=8)
	public void get_Signup_Text() 
	{
		ob.get_Signup_Text();
	}
	@Test(priority=9)
	public void singin_details() throws IOException, AWTException
	{
		ob.singin_details();
	}
	
	
	
	
	
	

}
