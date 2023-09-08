package careers_360_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class University_Review_Page extends Baselibrary {
	public University_Review_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='container']/ul/li[6]")
	private WebElement Review_button;
	@FindBy(xpath = "//div[@class='banner_collge_name']")
	private WebElement IIT_Delhi_Reviews_Title;
	@FindBy(xpath = "//h2[text()='Rating Summary']")
	private WebElement Rating_Summary_Title;
	@FindBy(xpath = "//div[@class='rating_num']")
	private WebElement Review_reviews;
	
	public void clickon_review() 
	{
		clickme(Review_button);
	}

	public void IIT_Delhi_Reviews_Title() 
	{
		String text = IIT_Delhi_Reviews_Title.getText();
		System.out.println("IIT_Delhi_Reviews_Title : " + text);
	}

	public void Rating_Summary_Title() 
	{
		String text1 = Rating_Summary_Title.getText();
		System.out.println("Rating_Summary_Title : " + text1);
	}

	public void Review_Count() throws InterruptedException 
	{
		String text2 = Review_reviews.getText();
		System.out.println("Review_Count : " + text2);
	}

	public void clickon_Infrastructure() throws InterruptedException 
	{
		WebElement Infrastructure = driver.findElement(By.xpath("//div[@class='cloud_tag']/div/span[2]/a"));
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("arguments[0].click();", Infrastructure);
		clickme(Infrastructure);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void clickon_Academics() throws InterruptedException 
	{
		WebElement Academics = driver.findElement(By.xpath("//div[@class='cloud_tag']/div/span[3]/a"));
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("arguments[0].click();", Academics);		
		clickme(Academics);
		driver.navigate().back();
	}

	public void clickon_placement() throws InterruptedException 
	{
		WebElement Placement = driver.findElement(By.xpath("//div[@class='cloud_tag']/div/span[4]/a"));
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("arguments[0].click();", Placement);
		clickme(Placement);
		driver.navigate().back();
	}

	public void clickon_Value_for_money() throws InterruptedException 
	{
		WebElement Value_for_money = driver.findElement(By.xpath("//div[@class='cloud_tag']/div/span[5]/a"));
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("arguments[0].click();", Value_for_money);
		clickme(Value_for_money);
		driver.navigate().back();
	}

	public void clickon_Campus_life() throws InterruptedException 
	{
		WebElement Campus_life = driver.findElement(By.xpath("//div[@class=\"cloud_tag\"]/div/span[6]/a"));
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("arguments[0].click();", Campus_life);
		clickme(Campus_life);
		driver.navigate().back();
	}
	
}
