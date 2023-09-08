package careers_360_page;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Baselibrary;

public class University_Cut_offs_Page extends Baselibrary {
	public University_Cut_offs_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li//a[text()='Cut-offs']")
	private WebElement Cut_offs;
	@FindBy(css = ".col-sm-5 a")
	private List<WebElement> trades;
	@FindBy(xpath="")
	private WebElement predict;

	public void clickOnCutoffs() {
		clickme(Cut_offs);
	}

	public void scrollToChart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
	}

	public void getTradesRespCodes() throws MalformedURLException, IOException 
	{
		SoftAssert sf = new SoftAssert();
		for (WebElement trade : trades) 
		{
			String url = trade.getAttribute("href");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,100)");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
//			int resCodeTime = conn.getReadTimeout(); 
			sf.assertTrue(respCode == 200, "The course with text: " + trade.getText() + " is not accessible");
//			sf.assertTrue(resCodeTime == 4000 , "The course with text2: " + trade.getText() + " is not accessible");
		}
		sf.assertAll();
	}
		public void clickOnPredict()
		{
			predict.click();
		}
		
	
}
