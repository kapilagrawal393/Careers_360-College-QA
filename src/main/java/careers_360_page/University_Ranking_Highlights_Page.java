package careers_360_page;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class University_Ranking_Highlights_Page extends Baselibrary
{
	public University_Ranking_Highlights_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "common-signin-close")
	private WebElement skip;
	@FindBy(xpath="//div[@class='tupple ranking']")
	private WebElement view;
	@FindBy(xpath="//div[@class='tab_label']")
	private List<WebElement> departments;
	@FindBy(xpath="//li[@class='nav-item']/button[@id='controlled-tab-example-tab-0']")
	private WebElement engineering;
	@FindBy(xpath="//div[@id='controlled-tab-example-tabpane-0']/div/div/div/div[3]/div")
	private List<WebElement> engineeringtabs;
	@FindBy(xpath="//li[@class='nav-item']/button[@id='controlled-tab-example-tab-1']")
	private WebElement management;
	@FindBy(xpath="//div[@id='controlled-tab-example-tabpane-1']/div/div/div/div[3]/div")
	private List<WebElement> managementtabs;
	@FindBy(xpath="//li[@class='nav-item']/button[@id='controlled-tab-example-tab-2']")
	private WebElement overall;
	@FindBy(xpath="//div[@id='controlled-tab-example-tabpane-2']/div/div/div/div[3]/div")
	private List<WebElement> overalltabs;
	@FindBy(xpath="//div[@class='tupple ranking']/div[2]/div/div/div/div/div[3]/div")
	private List<WebElement> tabs;
	

	public void scrollToChart()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", view);
	}
	public void clickOnDepartments() throws InterruptedException
	{
		
		if(engineering.isDisplayed())
		{
			clickme(engineering);
			for(WebElement dd:engineeringtabs)
			{
				clickme(dd);
				Thread.sleep(2000);
			}
		}
		if(management.isDisplayed())
		{
			clickme(management);
			for(WebElement dd:managementtabs)
			{
				clickme(dd);
				Thread.sleep(2000);
			}
		}
		if(overall.isDisplayed())
		{
			clickme(overall);
			for(WebElement dd:overalltabs)
			{
				clickme(dd);
				Thread.sleep(2000);
			}
		}
	}

}
