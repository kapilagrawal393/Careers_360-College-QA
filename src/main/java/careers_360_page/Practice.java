package careers_360_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice 
{

		public static WebDriver driver;
		public static void main(String[] args) 
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@id=\"common-signin-close\"]")).click();

			
			driver.get("https://www.careers360.com/university/indian-institute-of-technology-delhi");
			
			Eyes eyes = new Eyes();
			eyes.setApiKey("YOUR_APPLITOOLS_API_KEY");
			
			try
			{
				eyes.open(driver, "My Application", "Home Page Test");
//				driver.get("https://www.cortical.io/freetools/extract-keywords/");
				eyes.checkWindow("Home Page");
				eyes.close();
			}
			finally 
			{
	            eyes.abortIfNotClosed();
//	            driver.quit();
	        }
			
		}
}

//		import com.applitools.eyes.selenium.Eyes;
//		import org.openqa.selenium.WebDriver;
//		import org.openqa.selenium.chrome.ChromeDriver;
//		import org.openqa.selenium.By;
//		
//		public class VisualTestExample {
//		    public static void main(String[] args) {
//		        // Set up WebDriver
//		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//		        WebDriver driver = new ChromeDriver();
//		
//		        // Set up Applitools Eyes
//		        Eyes eyes = new Eyes();
//		        eyes.setApiKey("YOUR_APPLITOOLS_API_KEY");
//		
//		        try {
//		            // Start the test
//		            eyes.open(driver, "My Application", "Home Page Test");
//		
//		            // Navigate to the web page
//		            driver.get("https://www.example.com");
//		
//		            // Visual checkpoint
//		            eyes.checkWindow("Home Page");
//		
//		            // Close the test
//		            eyes.close();
//		        } finally {
//		            // Quit WebDriver and ensure the results are processed
//		            eyes.abortIfNotClosed();
//		            driver.quit();
//		        }
//		    }
//		}


		

