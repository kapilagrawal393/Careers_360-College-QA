package careers_360_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;

public class University_Facilities_Page extends Baselibrary
{
	
	public University_Facilities_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li//a[text()='Facilities']")
	private WebElement facilities;
	@FindBy(xpath="//div[@class='banner_collge_name']")
	private WebElement facilities_Title;
	
	public void clickonfacilities()
	 {
		clickme(facilities);
	 }
	
	public void gettextof_IIT_Delhi_Facilities_Title()
	 {
		String text =facilities_Title.getText();
		System.out.println("Facilities_Title : "+text);
	 }
	
	public void verifying_Facilities_Images()
	{
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='facilities_list']/ul/li/div/span[1]"));
	for (WebElement dd:li)
	 {
//		System.out.println("Verifying the Facilities_Images");
		Assert.assertTrue(dd.isDisplayed());
	 }
	}
	
	public void verifying_Facilities_Name()
	{
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='facilities_list']/ul/li/div/span[2]"));
	for (WebElement dd:li)
	 {
//		System.out.println("Verifying the Facilities_Name");
		Assert.assertTrue(dd.isDisplayed());
//		System.out.println(dd.getText());
//		System.out.println(dd.isDisplayed());
	 }
	}
	
	public void verifying_Facilities_Description()
	{
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='facilities_list']/ul/li/div[2]"));
		for(WebElement dd:li)
		{
//			System.out.println("Verifying the Facilities_Description");
			Assert.assertTrue(dd.isDisplayed());
//			System.out.println(dd.getText());
//			System.out.println(dd.isDisplayed());	
		}
	}
	

	
	
	
	
	
	
	
	
	
	

}
