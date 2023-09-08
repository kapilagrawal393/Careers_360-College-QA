package careers_360_page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;
import net.bytebuddy.asm.Advice.Argument;

public class College_Reviews_Page extends Baselibrary {

	public College_Reviews_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ol[@class='breadcrumb']/li[1]")
	private WebElement Home;
	@FindBy(xpath = "//ol[@class='breadcrumb']/li[2]/a")
	private WebElement university_in_india;
	@FindBy(xpath = "//ol[@class='breadcrumb']/li[3]/a")
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
	@FindBy(xpath="//button[@data-testid='close-button']")
	private WebElement close_signin_popup;
	@FindBy(xpath="//div[@class='show_desktop']/a")
	private WebElement WriteReview;

	public void clickOnReviewSubmodule() {
		WebElement review = driver.findElement(By.xpath("//div[@class='container']/ul/li[6]"));
		clickme(review);
	}

	public void verifyPrecenseOfCareers360Logo() {
		System.out.println("Verify the presence of Careers360 Logo");
		WebElement icon = driver.findElement(By.xpath("//header//div[@class='flex_col']/a/img"));
		Assert.assertTrue(icon.isDisplayed());
	}

	public void verifyPrecenseOfCareers360LogoColor() {
		System.out.println("Verifying the presence of Careers360 Logo Color");
		String colr = driver.findElement(By.xpath("//header//div[@class='flex_col']/a/img")).getCssValue("color");
		// getting background color attribute with getCssValue()
		String bckgclr = driver.findElement(By.xpath("//header//div[@class='flex_col']/a/img"))
				.getCssValue("background-color");
		System.out.println(colr);
		System.out.println(bckgclr);
	}

	public void clickableCareers360Logo() {
		WebElement icon = driver.findElement(By.xpath("//header//div[@class='flex_col']/a/img"));
		clickme(icon);
		driver.navigate().back();
	}

	public void verifyVisibleOfBrowseByStream() {
		WebElement icon = driver.findElement(By.xpath("//div[@class='dropdown_maga_menu_full']"));
		clickme(icon);
		Assert.assertTrue(icon.isDisplayed());
	}

	public void verifySearchingIcon() {
		System.out.println("Verifying the searching button");
		WebElement searchIcon = driver.findElement(By.className("header_searchIcon"));
		Assert.assertTrue(searchIcon.isDisplayed());
		clickme(searchIcon);
	}

	public void closeBySearchingIconPopup() throws InterruptedException {
		WebElement closepop = driver.findElement(By.xpath("//span[@class='popClose']"));
		clickme(closepop);
	}

	public void verifyPrecenseOfwhatsappAskIcon() throws InterruptedException {
		System.out.println("Verify the presence of whatsapp Icon");
		WebElement icon = driver.findElement(By.xpath("//a[@data-action='share/whatsapp/share']"));
		Assert.assertTrue(icon.isDisplayed());
		clickme(icon);
	}

	public void closeByWhatsappIconPopup() throws InterruptedException {
		WebElement closeicon = driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']"));
		closeicon.click();
	}

	public void verifyPrecenseOfShareIcon() throws InterruptedException {
		System.out.println("Verify the presence of Share Icon");
		WebElement icon = driver.findElement(By.xpath("//a[@href='#']"));
		Assert.assertTrue(icon.isDisplayed());
		clickme(icon);
	}

	public void closeByShareIconPopup() {
		WebElement closeicon = driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']"));
		clickme(closeicon);
	}

	public void verifyPrecenseOfLoginButton() throws InterruptedException {

		WebElement icon = driver.findElement(By.xpath("//div[@class='login']"));
		Assert.assertTrue(icon.isDisplayed());
		clickme(icon);
		WebElement closeIcon = driver.findElement(By.xpath("//button[@data-testid='close-button']"));
		clickme(closeIcon);
	}

	public void verifyPrecenseOfPremiumButton() throws InterruptedException {

		WebElement icon = driver.findElement(By.xpath("//button[text()='Premium']"));
		Assert.assertTrue(icon.isDisplayed());
		clickme(icon);
		WebElement closeIcon = driver.findElement(By.xpath("//button[@class='react-responsive-modal-closeButton']"));
		clickme(closeIcon);
	}

	public void verifyPrecenseOfUniversityLogo() throws InterruptedException {
		System.out.println("Verifying the presence of University Logo");
		WebElement icon = driver.findElement(By.xpath("//div[@class='college_logo']"));
		Assert.assertTrue(icon.isDisplayed());
	}

	public void clickOnHome() {
		clickme(Home);
		driver.navigate().back();
		Assert.assertTrue(Home.isDisplayed());
	}

	public void clickonUniversityInIndia() {
		clickme(university_in_india);
		driver.navigate().back();
		Assert.assertTrue(university_in_india.isDisplayed());
	}

	public void clickonUniversityInCity() {
		clickme(university_in_city);
		driver.navigate().back();
		Assert.assertTrue(university_in_city.isDisplayed());
	}

	public void getCollegeTitle() {
		String text = College_Title.getText();
		System.out.println("College Title : " + text);
	}

	public void clickOnCity() {
		clickme(City);
		driver.navigate().back();
		Assert.assertTrue(City.isDisplayed());
	}

	public void clickOnState() throws InterruptedException {
		State.click();
		driver.navigate().back();
		Assert.assertTrue(State.isDisplayed());
	}

	public void clickOnRatingSummary() throws InterruptedException {
		rating_summary_by_student.click();
		driver.navigate().back();
		Assert.assertTrue(rating_summary_by_student.isDisplayed());
	}

	public void clickOnQandA() throws InterruptedException {
		Que_Ans_by_stud.click();
		driver.navigate().back();
		Assert.assertTrue(Que_Ans_by_stud.isDisplayed());
		Thread.sleep(2000);
	}
	
//	public void clickOnIframe() throws InterruptedException
//	{
//		WebElement iframe = driver.findElement(By.id("addbuddy_h"));
//		driver.switchTo().frame(iframe);
//		Thread.sleep(2000);
//	}

	public void clickOnEnquire() {
		WebElement Enquire = driver.findElement(By.xpath("//button[@class='btns btn_orange enquire btn']"));
		clickme(Enquire);
		Assert.assertTrue(Enquire.isDisplayed());
	}

	public void closeOnEnquirePopup() { 
		JavascriptExecutor jsExecuttor = (JavascriptExecutor)driver;
		jsExecuttor.executeScript("arguments[0].click",close_signin_popup);
//		WebElement close_signin_popup = driver.findElement(By.xpath("//button[@data-testid='close-button']"));
//		clickme(close_signin_popup);
//		Assert.assertTrue(close_signin_popup.isDisplayed());
	}

	public void clickOnBrochure() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor
//		WebElement brochure = driver.findElement(By.xpath("//button[@class=' btn_orange_outline btn']"));
//		clickme(brochure);
//		Assert.assertTrue(brochure.isDisplayed());
	}

	public void closeOnBrochurePopup() throws InterruptedException {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", close_signin_popup);
//		WebElement close_signin_popup = driver.findElement(By.xpath("//button[@data-testid='close-button']"));
//		close_signin_popup.click();;
//		Assert.assertTrue(close_signin_popup.isDisplayed());
		Thread.sleep(3000);
	}

	public void clickOnWriteAReview() throws InterruptedException {
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", WriteReview);
//		WebElement  WriteReview = driver.findElement(By.xpath("//div[@class='show_desktop']/a"));
//		WriteReview.click();;
//		Assert.assertTrue(WriteReview.isDisplayed());
	}
	
}
