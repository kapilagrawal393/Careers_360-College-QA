package careers_360_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.University_Facilities_Page;

public class University_Facilities_Test extends Baselibrary
{
	University_Facilities_Page ob;
	@Parameters("env")
	@BeforeTest
	
	public void getlaunchurl_10(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new University_Facilities_Page();
	}
	
	@Test(priority=1)
	public void clickonfacilities()
	{
		ob.clickonfacilities();
	}
	@Test(priority=2)
	public void gettextof_IIT_Delhi_Facilities_Title()
	{
		ob.gettextof_IIT_Delhi_Facilities_Title();
	}
	@Test(priority=3)
	public void verifying_Facilities_Images()
	{
		ob.verifying_Facilities_Images();
	}
	@Test(priority=4)
	public void verifying_Facilities_Name()
	{
		ob.verifying_Facilities_Name();
	}
	@Test(priority=5)
	public void verifying_Facilities_Description()
	{
		ob.verifying_Facilities_Description();
	}


}
