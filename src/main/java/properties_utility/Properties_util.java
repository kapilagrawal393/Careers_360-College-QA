package properties_utility;

public interface Properties_util 
{
	public String getreaddata(String env);
//	public String getexcelreaddata(String path, int sheetno, int rowno, int colno);
}


	//package career360_pages;
	//
	//import java.io.IOException;
	//import java.net.HttpURLConnection;
	//import java.net.MalformedURLException;
	//import java.net.URL;
	//import java.util.List;
	//
	//import org.openqa.selenium.JavascriptExecutor;
	//import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.support.FindBy;
	//import org.openqa.selenium.support.PageFactory;
	//import org.openqa.selenium.support.ui.ExpectedConditions;
	//import org.openqa.selenium.support.ui.WebDriverWait;
	//import org.testng.asserts.SoftAssert;
	//
	//import baselibrary.BaseLibrary;
	//
	//public class CutOffPage extends BaseLibrary
	//{
	//	JavascriptExecutor js=(JavascriptExecutor) driver;
	//	WebDriverWait wait=new WebDriverWait(driver,10);
	//	public CutOffPage()
	//	{
	//		PageFactory.initElements(driver, this);
	//	}
	//	@FindBy(id = "common-signin-close")
	//	private WebElement skip;
	//	@FindBy(xpath = "//li/a[text()='Cut-offs']")
	//	private WebElement cutoff;
	//	@FindBy(css = ".col-sm-5 a")
	//	private List<WebElement> trades;
	//	
	//	
	//	public void clickOnSkip()
	//	{
	//		wait.until(ExpectedConditions.elementToBeClickable(skip)).click();
	//	}
	//	public void clickOnCutOff()
	//	{
	//		wait.until(ExpectedConditions.elementToBeClickable(cutoff)).click();
	//	}
	//	public void scroll()
	//	{
	//		js.executeScript("window.scrollBy(0,700)");
	//	}
	//	public void getTradesRespCodes() throws MalformedURLException, IOException
	//	{
	//		SoftAssert sf=new SoftAssert();
	//		for(WebElement trade:trades)
	//		{
	//			String url=trade.getAttribute("href");
	//			js.executeScript("window.scrollBy(0,100)");
	//			HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
	//			conn.setRequestMethod("HEAD");
	//			conn.connect();
	//			int respCode=conn.getResponseCode();
	//			sf.assertTrue(respCode<400, "The course with text: "+trade.getText()+" is not accessible");
	//		}
	//		sf.assertAll();
	//	}
	//}
	
	//package career360_tests;
	//
	//import java.io.IOException;
	//import java.net.MalformedURLException;
	//
	//import org.openqa.selenium.support.ui.ExpectedConditions;
	//import org.testng.annotations.BeforeTest;
	//import org.testng.annotations.Test;
	//
	//import baselibrary.BaseLibrary;
	//import career360_pages.CutOffPage;
	//
	//public class CutOffTest extends BaseLibrary
	//{
	//	CutOffPage ob;
	//	@BeforeTest
	//	public void getLaunchUrl_360()
	//	{
	//		getLaunchUrl("https://www.careers360.com/university/indian-institute-of-technology-delhi");
	//		ob=new CutOffPage();
	//	}
	//	@Test(priority=1)
	//	public void clickOnSkip()
	//	{
	//		ob.clickOnSkip();
	//	}
	//	@Test(priority=2)
	//	public void clickOnCutOff()
	//	{
	//		ob.clickOnCutOff();;
	//	}
	//	@Test(priority=3)
	//	public void scroll()
	//	{
	//		ob.scroll();
	//	}
	//	@Test(priority=4)
	//	public void getTradesRespCodes() throws MalformedURLException, IOException
	//	{
	//		ob.getTradesRespCodes();
	//	}
	//	
	//}



