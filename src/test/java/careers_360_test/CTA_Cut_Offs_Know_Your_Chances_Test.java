package careers_360_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import baselibrary.Baselibrary;
import careers_360_page.CTA_Cut_Offs_Know_Your_Chances_Page;

public class CTA_Cut_Offs_Know_Your_Chances_Test extends Baselibrary
{
	CTA_Cut_Offs_Know_Your_Chances_Page ob;
	@Parameters("env")
	@BeforeTest
	
	public void geturllaunch1(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new CTA_Cut_Offs_Know_Your_Chances_Page();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
