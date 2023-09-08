package careers_360_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.University_Gallery_page;

public class University_Gallery_test extends Baselibrary
{
	University_Gallery_page ob;
	
	@Parameters("env")
	@BeforeTest
	

	public void geturllaunch3(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new University_Gallery_page();
	}
	
	
	@Test(priority=1)
	public void click_On_view_photo() throws InterruptedException
	{
		ob.click_On_view_photo();
	}
	
	@Test(priority=2)
	public void verifying_Show_all_media() throws InterruptedException
	{
		ob.verifying_Show_all_media();
	}
	@Test(priority=3)
    public void clickon_photos()
	{
		ob.clickon_photos();
	}
	@Test(priority=4)
    public void verifying_Show_only_Images() throws InterruptedException
	{
		ob.verifying_Show_only_Images();
	}
	@Test(priority=5)
    public void clickon_videos()
	{
		ob.clickon_videos();
	}
	@Test(priority=6)
    public void verifying_Show_only_videos() throws InterruptedException
	{
    	ob.verifying_Show_only_videos();
	}
//	@Test(priority=7)
//	public void verify_image_stability()
//	{
//		ob.verify_image_stability();
//	}

}
