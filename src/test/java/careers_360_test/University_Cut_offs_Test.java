package careers_360_test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.University_Cut_offs_Page;

public class University_Cut_offs_Test extends Baselibrary {
	University_Cut_offs_Page ob;

	@Parameters("env")
	@BeforeTest

	public void getlaunchurl9(String env) {
		geturllaunch(getreaddata(env));
		ob = new University_Cut_offs_Page();
	}

	@Test(priority = 1)
	public void clickOnCutoffs() {
		ob.clickOnCutoffs();
	}

	@Test(priority = 2)
	public void scrollToChart() {
		ob.scrollToChart();
	}

	@Test(priority = 3)
	public void getTradesRespCodes() throws InterruptedException, MalformedURLException, IOException {
		ob.getTradesRespCodes();
	}
	
//	@Test(priority=4)
//	public void clickOnPredict()
//	{
//		ob.clickOnPredict();
//	}

}
