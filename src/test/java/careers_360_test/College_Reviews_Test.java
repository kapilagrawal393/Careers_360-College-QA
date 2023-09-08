package careers_360_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.College_Reviews_Page;

public class College_Reviews_Test extends Baselibrary {
	College_Reviews_Page ob;

	@Parameters("env")
	@BeforeTest

	public void getUrlLaunch1(String env) {
		geturllaunch(getreaddata(env));
		ob = new College_Reviews_Page();
	}

	@Test(priority = 1)
	public void clickOnReviewSubmodule() {
		ob.clickOnReviewSubmodule();
	}
	
	@Test(priority = 2)
	public void verifyPrecenseOfCareers360Logo() {
		ob.verifyPrecenseOfCareers360Logo();
	}

	@Test(priority = 3)
	public void verifyPrecenseOfCareers360LogoColor() {
		ob.verifyPrecenseOfCareers360LogoColor();
	}

	@Test(priority = 4)
	public void clickableCareers360Logo() {
		ob.clickableCareers360Logo();
	}

	@Test(priority = 5)
	public void verifyVisibleOfBrowseByStream() {
		ob.verifyVisibleOfBrowseByStream();
	}

	@Test(priority = 6)
	public void verifySearchingIcon() {
		ob.verifySearchingIcon();
	}

	@Test(priority = 7)
	public void closeBySearchingIconPopup() throws InterruptedException {
		ob.closeBySearchingIconPopup();
	}
	
	@Test(priority = 8)
	public void verifyPrecenseOfShareIcon() throws InterruptedException {
		ob.verifyPrecenseOfShareIcon();
	}

	@Test(priority = 9)
	public void verifyPrecenseOfwhatsappAskIcon() {

	}

	@Test(priority = 10)
	public void closeByWhatsappIconPopup() throws InterruptedException {
		ob.closeByWhatsappIconPopup();
	}

	@Test(priority = 11)
	public void closeByShareIconPopup() {
		ob.closeByShareIconPopup();
	}

	@Test(priority = 12)
	public void verifyPrecenseOfLoginButton() throws InterruptedException {
		ob.verifyPrecenseOfLoginButton();
	}

	@Test(priority = 13)
	public void verifyPrecenseOfPremiumButton() throws InterruptedException {
		ob.verifyPrecenseOfPremiumButton();
	}

	@Test(priority = 14)
	public void verifyPrecenseOfUniversityLogo() throws InterruptedException {
		ob.verifyPrecenseOfUniversityLogo();
	}

	@Test(priority = 15)
	public void clickOnHome() {
		ob.clickOnHome();
	}

	@Test(priority = 16)
	public void clickonUniversityInIndia() {
		ob.clickonUniversityInIndia();
	}

	@Test(priority = 17)
	public void clickonUniversityInCity() {
		ob.clickonUniversityInCity();
	}

	@Test(priority = 18)
	public void getCollegeTitle() {
		ob.getCollegeTitle();
	}

	@Test(priority = 19)
	public void clickOnCity() {
		ob.clickOnCity();
	}

	@Test(priority = 20)
	public void clickOnState() throws InterruptedException {
		ob.clickOnState();
	}

	@Test(priority = 21)
	public void clickOnRatingSummary() throws InterruptedException {
		ob.clickOnRatingSummary();
	}

	@Test(priority = 22)
	public void clickOnQandA() throws InterruptedException {
		ob.clickOnQandA();
	}
	
//	@Test(priority=23)
//	public void clickOnIframe() throws InterruptedException
//	{
//		ob.clickOnIframe();
//	}


	@Test(priority = 23)
	public void clickOnEnquire() {
		ob.clickOnEnquire();
	}

	@Test(priority = 24)
	public void closeOnEnquirePopup() {
		ob.closeOnEnquirePopup();
	}

	@Test(priority = 25)
	public void clickOnBrochure() {
		ob.clickOnBrochure();
	}
	
	@Test(priority = 26)
	public void closeOnBrochurePopup() throws InterruptedException {
		ob.closeOnBrochurePopup();
	}

	@Test(priority = 27)
	public void clickOnWriteAReview() throws InterruptedException {
		ob.clickOnWriteAReview();
	}
}
