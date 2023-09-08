package careers_360_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baselibrary.Baselibrary;

public class University_Fees_Structure_Page extends Baselibrary
{
		public University_Fees_Structure_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='container']/ul/li[2]")
	private WebElement Courses_Fees;
	@FindBy(xpath="//div[@class='banner_collge_name']")
	private WebElement title;
	@FindBy(xpath="//div[@class='left_column col-lg-9']")
	private WebElement view;
	
	
	public void clickon_Course_Fees_Submodule()
	{
		clickme(Courses_Fees);
	}
	public void get_Course_Fees_Title()
	{
		String text=title.getText();
		System.out.println("Course_Fees_Title : "+ text);
	}
	public void scrollToChart()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", view);
	}
	public void get_details() throws InterruptedException
	{
		WebElement coursecount=driver.findElement(By.xpath("//div[@class='course_count']"));
		String text=coursecount.getText();
		System.out.println(text);
		char[] txt=text.toCharArray();
		int mul=1;
		int count=0;
		for(int i=txt.length-1;i>=0;i--)
		{
			if(Character.isDigit(txt[i]))
					{
						int temp=Character.getNumericValue(txt[i]);
						int num=temp*mul;
						mul=mul*10;
						count=count+num;
					}
		}
		System.out.println(count);
		int divide=count/20;
		int clicktimes=divide+1;
		System.out.println("No. of pages: "+clicktimes);
		
		List<WebElement> nextbtn = driver.findElements(By.xpath("//div[@class='college_pagination']/ul/li/a"));		
		
		
//		Point point=nextbtn.getLocation();
//		int xcord=point.getX();
//	    int ycord=point.getY();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		for(int page=2;page<=clicktimes;page++)
		{
			WebElement nextpage=driver.findElement(By.xpath("//div[@class='college_pagination']/ul/li/a[contains(text(),'"+page+"')]"));
			Thread.sleep(2000);
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", nextpage);
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,100)");
//			Thread.sleep(2000);
//			wait.until(ExpectedConditions.elementToBeClickable(nextpage)).click();
			js.executeScript("arguments[0].click();", nextpage);
			System.out.println(nextbtn);
		
		}
	}	
}
	

	
//	public void get_Course_list_on_1st_page()
//	{
//		List<WebElement> li = driver.findElements(By.xpath("//div[@class=\"detail\"]"));
//		for(WebElement dd:li)
//		{
////			dd.click();
//			System.out.println(dd.getText());
//		}
//		int sz = li.size();
//		System.out.println("Total course_list on 1st page: "+sz);
//		List<WebElement>li=driver.findElements(By.xpath("//div[@class=\"card_blk\"]"));
//		int sz =li.size();
//		System.out.println("Total Course_list_on_1st_page: "+sz);
//		for(int i=0;i<sz;i++)
//		{
//			System.out.println(li.get(i).getAttribute("div"));
//			System.out.println(li.get(i).getText());
//		}
//	}
////	WebElement ele = driver.findElement(By.xpath("(//div//ul//li//a[@class='pagination_list'])[1]"));
//
//	public void get_Course_list_on_2nd_page() throws InterruptedException
//	{
//		WebElement ele = driver.findElement(By.xpath("//a[@class='pagination_list_last']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();", ele);
//
// 		 Thread.sleep(2000);
// 		 List <WebElement>li = driver.findElements(By.xpath("//div[@class='card_blk']")) ;
// 		int sz =li.size();
//		System.out.println("Total Course_list_on_2nd_page: "+sz);
//		for(int i=0;i<sz;i++)
//		{
////			System.out.println(li.get(i).getAttribute("div"));
//			System.out.println(li.get(i).getText());
//		}
//	}	
//	public void get_Course_list_on_3rd_page() throws InterruptedException
//	{
//		WebElement ele = driver.findElement(By.xpath("//a[@class='pagination_list_last']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele);
//
//		 Thread.sleep(2000);
//		 List <WebElement> li = driver.findElements(By.xpath("//div[@class='card_blk']")) ;
//		 int sz =li.size();
//			System.out.println("Total Course_list_on_3rd_page: "+sz);
//			for(int i=0;i<sz;i++)
//			{
////				System.out.println(li.get(i).getAttribute("div"));
//				System.out.println(li.get(i).getText());
//			}
//	}
//	
//	public void get_Course_list_on_4th_page() throws InterruptedException
//	{
//		WebElement ele = driver.findElement(By.xpath("//a[@class='pagination_list_last']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele);
//
//		 Thread.sleep(2000);
//		 List <WebElement> li = driver.findElements(By.xpath("//div[@class='card_blk']")) ;
//		 int sz =li.size();
//			System.out.println("Total Course_list_on_4th_page: "+sz);
//			for(int i=0;i<sz;i++)
//			{
////				System.out.println(li.get(i).getAttribute("div"));
//				System.out.println(li.get(i).getText());
//			}
//	}
//	public void get_Course_list_on_5th_page() throws InterruptedException
//	{
//		WebElement ele = driver.findElement(By.xpath("//a[@class='pagination_list_last']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele);
//
//		 Thread.sleep(2000);
//		 List <WebElement> li = driver.findElements(By.xpath("//div[@class='card_blk']")) ;
//		 int sz =li.size();
//			System.out.println("Total Course_list_on_5th_page: "+sz);
//			for(int i=0;i<sz;i++)
//			{
////				System.out.println(li.get(i).getAttribute("div"));
//				System.out.println(li.get(i).getText());
//			}
//	}
//	public void get_Course_list_on_6th_page() throws InterruptedException
//	{
//		WebElement ele = driver.findElement(By.xpath("//a[@class='pagination_list_last']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele);
//
//		 Thread.sleep(2000);
//		 List <WebElement> li = driver.findElements(By.xpath("//div[@class='card_blk']")) ;
//		 int sz =li.size();
//			System.out.println("Total Course_list_on_6th_page: "+sz);
//			for(int i=0;i<sz;i++)
//			{
////				System.out.println(li.get(i).getAttribute("div"));
//				System.out.println(li.get(i).getText());
//			}
//	}
//	public void get_Course_list_on_7th_page() throws InterruptedException
//	{
//		WebElement ele = driver.findElement(By.xpath("//a[@class='pagination_list_last']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele);
//
//		 Thread.sleep(2000);
//		 List <WebElement> li = driver.findElements(By.xpath("//div[@class='card_blk']")) ;
//		 int sz =li.size();
//			System.out.println("Total Course_list_on_7th_page: "+sz);
//			for(int i=0;i<sz;i++)
//			{
////				System.out.println(li.get(i).getAttribute("div"));
//				System.out.println(li.get(i).getText());
//			}
//	}
//	public void get_Course_list_on_8th_page() throws InterruptedException
//	{
//		WebElement ele = driver.findElement(By.xpath("//a[@class='pagination_list_last']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele);
//
//		 Thread.sleep(2000);
//		 List <WebElement> li = driver.findElements(By.xpath("//div[@class='card_blk']")) ;
//		 int sz =li.size();
//			System.out.println("Total Course_list_on_8th_page: "+sz);
//			for(int i=0;i<sz;i++)
//			{
////				System.out.println(li.get(i).getAttribute("div"));
//				System.out.println(li.get(i).getText());
//			}
//	}
//	public void get_Course_list_on_9th_page() throws InterruptedException
//	{
//		WebElement ele = driver.findElement(By.xpath("//a[@class='pagination_list_last']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele);
//
//		 Thread.sleep(2000);
//		 List <WebElement> li = driver.findElements(By.xpath("//div[@class='card_blk']")) ;
//		 int sz =li.size();
//			System.out.println("Total Course_list_on_9th_page: "+sz);
//			for(int i=0;i<sz;i++)
//			{
///			System.out.println(li.get(i).getAttribute("div"));
//				System.out.println(li.get(i).getText());
//			}
//	}

//}


 








