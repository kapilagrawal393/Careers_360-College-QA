package careers_360_test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.University_Fees_Structure_Page;

public class University_Fees_Structure_Test extends Baselibrary 
{
	University_Fees_Structure_Page ob;
	@Parameters("env")
	@BeforeTest
	
	
	public void geturllaunch7(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new University_Fees_Structure_Page();
	}
	

	@Test(priority=1)
	public void clickon_Course_Fees_Submodule()
	{
		ob.clickon_Course_Fees_Submodule();
	}
	@Test(priority=2)
	public void get_Course_Fees_Title()
	{
		ob.get_Course_Fees_Title();
	}
	@Test(priority=3)
	public void scrollToChart()
	{
		ob.scrollToChart();
	}
	@Test(priority=4)
	public void get_details() throws InterruptedException
	{
		ob.get_details();
	}
//	@Test(priority=3)
//	public void get_Courses_Count() throws InterruptedException
//	{
//		ob.get_Courses_Count();
//	}
//	@Test(priority=4)
//	public void get_Course_list_on_1st_page()
//	{
//		ob.get_Course_list_on_1st_page();
//	}
//	@Test(priority=5)
//	public void get_Course_list_on_2nd_page() throws InterruptedException
//	{
//		ob.get_Course_list_on_2nd_page();
//	}
//	@Test(priority=6)
//	public void get_Course_list_on_3rd_page() throws InterruptedException
//	{
//		ob.get_Course_list_on_3rd_page();
//	}
//	@Test(priority=7)
//	public void get_Course_list_on_4th_page() throws InterruptedException
//	{
//		ob.get_Course_list_on_4th_page();
//	}
//	@Test(priority=8)
//	public void get_Course_list_on_5th_page() throws InterruptedException
//	{
//		ob.get_Course_list_on_5th_page();
//	}
//	@Test(priority=9)
//	public void get_Course_list_on_6th_page() throws InterruptedException
//	{
//		ob.get_Course_list_on_6th_page();
//	}
//	@Test(priority=10)
//	public void get_Course_list_on_7th_page() throws InterruptedException
//	{
//		ob.get_Course_list_on_7th_page();
//	}
//	@Test(priority=11)
//	public void get_Course_list_on_8th_page() throws InterruptedException
//	{
//		ob.get_Course_list_on_8th_page();
//	}
//	@Test(priority=12)
//	public void get_Course_list_on_9th_page() throws InterruptedException
//	{
//		ob.get_Course_list_on_9th_page();
//	}
	


}
