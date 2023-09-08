package careers_360_test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.CTA_Ques_Ans_Ask_Now_Page;

public class CTA_Ques_Ans_Ask_Now_Test extends Baselibrary
{
	CTA_Ques_Ans_Ask_Now_Page ob;
	@Parameters("env")
	@BeforeTest
	
	public void geturllaunch1(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new CTA_Ques_Ans_Ask_Now_Page();
	}
	
	@Test(priority=1)
	public void clickon_Q_A()
	{
		ob.clickon_Q_A();
	}
	@Test(priority=2)
	public void clickon_Ask_Now()
	{
		ob.clickon_Ask_Now();
	}
	@Test(priority=3)
	public void fill_description()
	{
		ob.fill_description();
	}
	@Test(priority=4)
	public void clickon_submit()
	{
		ob.clickon_submit();
	}
	@Test(priority=5)
	public void click_On_Frame()
	{
		ob.click_On_Frame();
	}
	@Test(priority=6)
	public void get_Signup_Text()
	{
		ob.get_Signup_Text();
	}
	@Test(priority=7)
	public void singin_details() throws IOException, AWTException
	{
		ob.singin_details();
	}
}
