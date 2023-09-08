package careers_360_test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.University_Signup_page;

public class University_Signup_test extends Baselibrary
{
	University_Signup_page ob;
	@Parameters("env")
	@BeforeTest
	
	public void geturllaunch4(String env)
	{	
		geturllaunch(getreaddata(env));
		ob = new University_Signup_page();
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
	public void singin_details() throws IOException, AWTException
	{
		ob.singin_details();
	}

	

}
