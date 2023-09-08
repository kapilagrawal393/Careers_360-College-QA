package careers_360_test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.CTA_Get_Info_Page;

public class CTA_Get_Info_Test extends Baselibrary
{
	CTA_Get_Info_Page ob;
	@Parameters("env")
	@BeforeTest
	
	public void geturllaunch8(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new CTA_Get_Info_Page();
	}
	
	@Test(priority=1)
	public void click_On_Get_Info() throws InterruptedException 
	{
		ob.click_On_Get_Info();
	}
//	@Test(priority=2)
//	public void click_On_Frame()
//	{
//		ob.click_On_Frame();
//	}
//	@Test(priority=3)
//	public void get_Signup_Text()
//	{
//		ob.get_Signup_Text();
//	}
//	@Test(priority=4)
//	public void click_On_Name() throws InterruptedException
//	{
//		ob.click_On_Name();
//	}
//	@Test(priority=5)
//	public void click_On_Email() throws InterruptedException
//	{
//		ob.click_On_Email();
//	}
//	@Test(priority=6)
//	public void click_On_Mobile() throws InterruptedException
//	{
//		ob.click_On_Mobile();
//	}
//	@Test(priority=7)
//	public void click_On_Study() throws InterruptedException
//	{
//		ob.click_On_Study();
//	}
//	@Test(priority=8)
//	public void click_On_Study_Option()
//	{
//		ob.click_On_Study_Option();
//	}
//	@Test(priority=9)
//	public void click_On_Education() throws InterruptedException
//	{
//		ob.click_On_Education();
//	}
//	@Test(priority=10)
//	public void click_On_Edu_Option()
//	{
//		ob.click_On_Edu_Option();
//	}
//	@Test(priority=11)
//	public void get_Select_Year() throws InterruptedException
//	{
//		ob.get_Select_Year();
//	}
//	@Test(priority=12)
//	public void click_On_Yrs_Option2()
//	{
//		ob.click_On_Yrs_Option();
//	}
//	@Test(priority=13)
//	public void click_On_City() throws InterruptedException, AWTException
//	{
//		ob.click_On_City();
//	}
//	@Test(priority=14)
//	public void click_On_Signup() 
//	{
//		ob.click_On_Signup();
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
