package careers_360_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class University_Gallery_page extends Baselibrary
{
	public University_Gallery_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='view_photo']")
	private WebElement view_photo;
	
	public void click_On_view_photo() throws InterruptedException
	{
		clickme(view_photo);
	}

	public void verifying_Show_all_media() throws InterruptedException
		{
		List<WebElement> li =driver.findElements(By.xpath("//div[@class='sub_category']/span"));
		

		for(WebElement dd:li)
		  {
			dd.click();
			Thread.sleep(2000);			
		  }
		}
		
	public void clickon_photos()
		{
			WebElement photos = driver.findElement(By.xpath("//div//span[@id='photo']"));
			clickme(photos);
		}
		
	public void verifying_Show_only_Images() throws InterruptedException
		{
		List<WebElement> li =driver.findElements(By.xpath("//div[@class='sub_category']/span"));
		

		for(WebElement dd:li)
		  {
			dd.click();
			Thread.sleep(2000);			
		  }
		}
		
	public void clickon_videos()
		{
			WebElement videos = driver.findElement(By.xpath("//div//span[@id='video']"));
			clickme(videos);
		}
		
	public void verifying_Show_only_videos() throws InterruptedException
		{
		List<WebElement> li =driver.findElements(By.xpath("//div[@class='sub_category']/span"));
		

		for(WebElement dd:li)
		  {
			dd.click();
			Thread.sleep(2000);			
		  }
		}
//	public void verify_image_stability()
//	{
//		try {
//            driver.get("https://example.com"); // Replace with the URL of your webpage
//
//            // Find the image element you want to validate
//            WebElement imageElement = driver.findElement(By.cssSelector("img[src='path/to/image.png']"));
//
//            // Get the initial position of the image element
//            Point initialPosition = imageElement.getLocation();
//
//            // Perform actions that may cause the page to change (e.g., scrolling, resizing, etc.)
//
//            // Get the position of the image element after performing the actions
//            Point finalPosition = imageElement.getLocation();
//
//            // Compare the initial and final positions to check if the image is fixed
//            boolean isImageFixed = initialPosition.equals(finalPosition);
//
//            // Output the result
//            if (isImageFixed) {
//                System.out.println("The image is fixed at its place.");
//            } else {
//                System.out.println("The image has moved from its initial position.");
//            }
//
//        } 
//		finally 
//		{
//            driver.quit();
//        }
//	}


	
	
}
