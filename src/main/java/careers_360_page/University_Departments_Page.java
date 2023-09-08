package careers_360_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class University_Departments_Page extends Baselibrary 
{
	public University_Departments_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='container']/ul/li[10]")
	private WebElement Colleges_Departments_Button;
	@FindBy(xpath="//div[@class='banner_collge_name']")
	private WebElement Affiliated_Colleges_List_Title;
	
	
	
	public void clickon_Colleges_Departments_Button()
	{
		clickme(Colleges_Departments_Button);
	}
	
	public void get_IIT_Delhi_Affiliated_Colleges_List_Title()
	{
		String text = Affiliated_Colleges_List_Title.getText();
		System.out.println("Affiliated_Colleges_List_Title: "+text);
	}
	
	public void clickon_Affiliated_Colleges() throws InterruptedException
	{
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='card_blk']/div/h4"));
		
		for(WebElement dd:li)
		{
			dd.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
	}
	public void get_Affiliated_Colleges_Listing()
	{
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='card_blk']/div/h4"));
		
		for(WebElement dd:li)
		{
		System.out.println("Affiliated_Colleges_List: "+dd.getText());
		System.out.println(dd.isDisplayed());
		}
	}
	
	

}
