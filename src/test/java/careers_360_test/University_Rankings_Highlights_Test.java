package careers_360_test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.University_Ranking_Highlights_Page;

public class University_Rankings_Highlights_Test extends Baselibrary
{
	University_Ranking_Highlights_Page ob;
	@Parameters("env")
	@BeforeTest
	
	public void clickongeturl_ITT_Delhi(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new University_Ranking_Highlights_Page();
	}
	
	
	@Test(priority=1)
	public void scrollToChart()
	{
		ob.scrollToChart();
	}
	@Test(priority=2)
	public void clickOnDepartments() throws InterruptedException
	{
		ob.clickOnDepartments();
	}
}
