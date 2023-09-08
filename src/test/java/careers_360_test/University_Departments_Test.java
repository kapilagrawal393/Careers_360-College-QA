package careers_360_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.University_Departments_Page;

public class University_Departments_Test extends Baselibrary
{
	University_Departments_Page ob;
	@Parameters("env")
	@BeforeTest
	
	public void geturllaunch12(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new University_Departments_Page();
	}
	
	@Test(priority=1)
	public void clickon_Colleges_Departments_Button()
	{
		ob.clickon_Colleges_Departments_Button();
	}
	@Test(priority=2)
	public void get_IIT_Delhi_Affiliated_Colleges_List_Title()
	{
		ob.get_IIT_Delhi_Affiliated_Colleges_List_Title();
	}
	@Test(priority=3)
	public void clickon_Affiliated_Colleges() throws InterruptedException
	{
		ob.clickon_Affiliated_Colleges();
	}
	@Test(priority=4)
	public void get_Affiliated_Colleges_Listing()
	{
		ob.get_Affiliated_Colleges_Listing();
	}
	
	
	

}
