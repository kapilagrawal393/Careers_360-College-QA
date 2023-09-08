package careers_360_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.University_Review_Page;

public class University_Review_Test extends Baselibrary
{
	University_Review_Page ob;
	@Parameters("env")
	@BeforeTest
	
	public void getlaunchurl_11(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new University_Review_Page();
	}
	
	
	@Test(priority=1)
	public void clickon_review()
	{
		ob.clickon_review();
	}
	@Test(priority=2)
	public void IIT_Delhi_Reviews_Title()
	{
		ob.IIT_Delhi_Reviews_Title();
	}
	@Test(priority=3)
	public void Rating_Summary_Title()
	{
		ob.Rating_Summary_Title();
	}
	@Test(priority=4)
	public void Review_Count() throws InterruptedException
	{
		ob.Review_Count();
	}
//	@Test(priority=5)
//	public void scrollToChart()
//	{
//		ob.scrollToChart();
//	}
//	@Test(priority=5)
//	public void clickon_Rating_Parameter() throws InterruptedException
//	{
//		ob.clickon_Rating_Parameter();
//	}
	@Test(priority=5)
	public void clickon_Infrastructure() throws InterruptedException
	{
		ob.clickon_Infrastructure();
	}	
	@Test(priority=6)
	public void clickon_Academics() throws InterruptedException
	{
		ob.clickon_Academics();
	}	
	@Test(priority=7)
	public void clickon_placement() throws InterruptedException
	{
		ob.clickon_placement();
	}	
	@Test(priority=8)
	public void clickon_Value_for_money() throws InterruptedException
	{
		ob.clickon_Value_for_money();
	}
	@Test(priority=9)
	public void clickon_Campus_life() throws InterruptedException
	{
		ob.clickon_Campus_life();
	}
}
