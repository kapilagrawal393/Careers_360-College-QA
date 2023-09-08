package careers_360_test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.CTA_Header_Login_Page;

public class CTA_Header_Login_Test extends Baselibrary
{
	CTA_Header_Login_Page ob;
	@Parameters("env")
	@BeforeTest
	
	public void geturllaunch1(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new CTA_Header_Login_Page();
	}
	
	@Test(priority=1)
	public void click_On_Login() throws InterruptedException 
	{
		ob.click_On_Login();
	}
	@Test(priority=2)
	public void click_On_Frame()
	{
		ob.click_On_Frame();
	}
	@Test(priority=3)
	public void get_Signup_Text()
	{
		ob.get_Signup_Text();
	}
	@Test(priority=4)
	public void singin_details() throws InterruptedException, IOException, AWTException
	{
		ob.singin_details();
	}
	
}
