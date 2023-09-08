package careers_360_page;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import baselibrary.Baselibrary;

public class University_header_page extends Baselibrary {

	public University_header_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ol[@class='breadcrumb']/li[1]")
	private WebElement Home;
	@FindBy(xpath = "//ol[@class='breadcrumb']/li[2]")
	private WebElement university_in_india;
	@FindBy(xpath = "//ol[@class='breadcrumb']/li[3]")
	private WebElement university_in_city;
	@FindBy(xpath = "//div[@class='banner_collge_name']")
	private WebElement College_Title;
	@FindBy(xpath = "//div[@class='banner_collge_info']/div[1]/span/a[1]")
	private WebElement City;
	@FindBy(xpath = "//div[@class='banner_collge_info']/div[1]/span/a[2]")
	private WebElement State;
	@FindBy(xpath = "//div[@class='banner_collge_info']/div[2]/span[1]/a")
	private WebElement rating_summary_by_student;
	@FindBy(xpath = "//div[@class='banner_collge_info']/div[2]/span[2]/a")
	private WebElement Que_Ans_by_stud;
	@FindBy(xpath = "//button[@class='btns btn_orange enquire btn']")
	private WebElement Enquire;
	@FindBy(xpath = "//button[@data-testid='close-button']")
	private WebElement close_signin_popup;
	@FindBy(xpath = "//button[@class=' btn_orange_outline btn']")
	private WebElement brochure;
	@FindBy(xpath = "//div[@class='show_desktop']")
	private WebElement Compare;
	@FindBy(xpath = "//a[@data-action='share/whatsapp/share']")
	private WebElement Ask_CTA;
	@FindBy(xpath = "//div[@class='right_header_menu']/ul/li[2]")
	private WebElement Share_Icon;
	@FindBy(css = ".login")
	private WebElement Login_CTA;
	@FindBy(xpath = "//button[text()='Premium']")
	private WebElement Premium;
	@FindBy(xpath = "//h2")
	private List<WebElement> trades;

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getReadJsonData(
				System.getProperty("user.dir") + "/home/kapil/Desktop/AK/Careers_360_2nd_june/Test_data/url.json");
		return new Object[][] { { data.get(0) } };
	}

	public void Verifying_University_Title() {
		System.out.println("Verifying University Title.............");
		String ExpectedTitle = "IIT Delhi: Admission, Fees, Courses, Placements, Cutoff, Ranking";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle, "Title Matched");
		
	}

	public void Verifying_Precense_of_Careers360_Logo() {
		System.out.println("Verifying the presence of Careers360 Logo");
		WebElement icon = driver.findElement(By.xpath("//header//div[@class='flex_col']"));
		clickme(icon);
		driver.navigate().back();
		Assert.assertTrue(icon.isDisplayed());
	}

	public void verifyVisibleOfBrowseByStream() {
		WebElement icon = driver.findElement(By.cssSelector(".dropdown_maga_menu_full"));
		clickme(icon);
		Assert.assertTrue(icon.isDisplayed());
	}

	public void verifySearchBar() {
		System.out.println("Verifying the searching button");
		WebElement searchIcon = driver.findElement(By.cssSelector(".searchBox"));
		clickme(searchIcon);
		WebElement cutSearchIcon = driver.findElement(By.cssSelector(".popClose"));
		clickme(cutSearchIcon);
		Assert.assertTrue(searchIcon.isDisplayed());

	}

	public void Verifying_Searching_Icon() {
		System.out.println("Verifying the searching button");
		WebElement searchIcon = driver.findElement(By.className("header_searchIcon"));
		Assert.assertTrue(searchIcon.isDisplayed());
	}

	public void Verifying_Precense_of_University_Logo() {
		System.out.println("Verifying the presence of University Logo");
		WebElement icon = driver.findElement(By.xpath("//div[@class='college_logo']"));
		Assert.assertTrue(icon.isDisplayed());
	}

	public void click_On_Home() {
		clickme(Home);
		driver.navigate().back();
		Assert.assertTrue(Home.isDisplayed());
	}

	public void clickon_University_In_India() {
		clickme(university_in_india);
		driver.navigate().back();
		Assert.assertTrue(university_in_india.isDisplayed());
	}

	public void clickon_University_In_City() {
		clickme(university_in_city);
		driver.navigate().back();
		Assert.assertTrue(university_in_city.isDisplayed());
	}

	public void Verify_College_Title() {
		System.out.println("Verify College Title...............");
		String ExpectedTitle = "IIT Delhi: Admission, Courses, Fees, Placements";
		WebElement College = driver.findElement(By.cssSelector(".banner_collge_name"));
		String ActualTitle = College.getText();
		Assert.assertEquals(ExpectedTitle, ActualTitle, "Title Matched");
	}

	public void click_On_City() {
		clickme(City);
		driver.navigate().back();
		Assert.assertTrue(City.isDisplayed());
	}

	public void click_On_State() throws InterruptedException {
		State.click();
		driver.navigate().back();
		Thread.sleep(3000);
		Assert.assertTrue(State.isDisplayed());
	}

	public void clickon_ratingsummary() throws InterruptedException {
		rating_summary_by_student.click();
		driver.navigate().back();
		Assert.assertTrue(rating_summary_by_student.isDisplayed());
		Thread.sleep(3000);
	}

	public void clickon_QandA() throws InterruptedException {
		Que_Ans_by_stud.click();
		driver.navigate().back();
		Assert.assertTrue(Que_Ans_by_stud.isDisplayed());
		Thread.sleep(3000);
	}

	public void clickOnCTA() throws InterruptedException {
		clickme(Ask_CTA);
		Assert.assertTrue(Ask_CTA.isDisplayed());
		clickme(close_signin_popup);
		Thread.sleep(2000);
		clickme(Share_Icon);
		Assert.assertTrue(Share_Icon.isDisplayed());
		clickme(close_signin_popup);
		Thread.sleep(2000);
		clickme(Login_CTA);
		Assert.assertTrue(Login_CTA.isDisplayed());
		clickme(close_signin_popup);
		Thread.sleep(2000);
		clickme(Premium);
		Assert.assertTrue(Premium.isDisplayed());
		clickme(close_signin_popup);
		Thread.sleep(2000);
		clickme(Enquire);
		Assert.assertTrue(Enquire.isDisplayed());
		clickme(close_signin_popup);
		Thread.sleep(2000);
		clickme(brochure);
		Assert.assertTrue(brochure.isDisplayed());
		clickme(close_signin_popup);
		Thread.sleep(2000);
		clickme(Compare);
		driver.navigate().back();
		Assert.assertTrue(Compare.isDisplayed());
	}
	
	public void clickOnSubTupple() throws InterruptedException
	{
		List<WebElement> Tupples = driver.findElements(By.xpath("//div[@class='subNav ']/div/ul/li"));
		
		for(WebElement Tupple:Tupples)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",  Tupple);	
			Thread.sleep(2000);
		}
	}
	public void getH2Title() throws InterruptedException {
		String htmlContent = driver.getPageSource();
		org.jsoup.nodes.Document doc = Jsoup.parse(htmlContent);

		Elements h2Elements = doc.select("h2");

		for (Element h2Element : h2Elements) {
//			String fullHtml = h2Element.outerHtml();
//			System.out.println("Full HTML: " + fullHtml);

			String actualText = h2Element.text();
//			System.out.println(actualText);
			Assert.assertNotNull(actualText, "Title should not be null");
			Assert.assertFalse(actualText.isEmpty(), "Title should not be empty");
			Assert.assertTrue(actualText.length() > 0, "Title should have length > 0");
//			System.out.println(h2Element.getElementsContainingOwnText(htmlContent));		
		}

	}
	
	public void getH3Title() throws InterruptedException {
		String htmlContent = driver.getPageSource();
		org.jsoup.nodes.Document doc = Jsoup.parse(htmlContent);

		Elements h3Elements = doc.select("h3");

		for (Element h3Element : h3Elements) {
//			String fullHtml = h3Element.outerHtml();
//			System.out.println("Full HTML: " + fullHtml);

			String actualText = h3Element.text();
			System.out.println(actualText);
			Assert.assertNotNull(actualText, "Title should not be null");
			Assert.assertFalse(actualText.isEmpty(), "Title should not be empty");
			Assert.assertTrue(actualText.length() > 0, "Title should have length > 0");
			System.out.println(h3Element.getElementsContainingOwnText(htmlContent));	
						
		}

	}
	


}



