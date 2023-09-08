package careers_360_page;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.stream.JsonReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy 
{
	
	    private WebDriver driver;

	    
	    public void setUp(String url) 
	    {
	    	WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@id=\"common-signin-close\"]")).click();
	    }

//	    @Test
//	    public void testCollegeLinks() {
//	        String[] urls = {
//	            "https://www.careers360.com/university/indian-institute-of-technology-delhi",
//	            "https://www.careers360.com/university/indian-institute-of-technology-kanpur",
//	            "https://www.careers360.com/university/indian-institute-of-technology-bombay"
//	            // Add more URLs as needed
//	        };
//
//	        for (String url : urls) {
//	            driver.get(url);
//	            // Perform verifications or validations on the page
//	            WebElement titleElement = driver.findElement(By.tagName("title"));
//	            String pageTitle = titleElement.getAttribute("textContent");
//	            
//	            // Define your expected title for each URL
//	            String expectedTitle = "Expected Page Title";
//	            
//	            // Assertion: Verify the title
//	            Assert.assertEquals(pageTitle, expectedTitle, "Page title does not match the expected title.");
//	        }
//	    }
//
//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }
	
//	    @Test
//	    public void clickonreadMoredata()
//	    {
//	    	WebElement readMores = driver.findElement(By.xpath("//*[@id=\"about_blk\"]/div[2]/span"));
//			readMores.click();
//	    }
	    	
	  
	   
//	    @Test
//	    public void LinkReader()
//	    {
//	        
//	            try
//	            {
//	                ObjectMapper objectMapper = new ObjectMapper();
//	                URL jsonUrl = Dummy.class.getResource("https://www.careers360.com/university/indian-institute-of-technology-delhi"); // Path to your JSON file
//	                
//	                List<String> links = objectMapper.readValue(jsonUrl, List.class);
//
//	                for (String link : links) 
//	                {
//	                    System.out.println("Link: " + link);
//	                    // Perform further processing for each link
//	                }
//	            } 
//	            catch (IOException e) 
//	            {
//	                e.printStackTrace();
//	            }
//	    }
	    
//	    import com.fasterxml.jackson.core.type.TypeReference;
//	    import com.fasterxml.jackson.databind.ObjectMapper;
//	    import org.apache.commons.io.FileUtils; // Make sure you have the necessary dependency
//
//	    import java.io.File;
//	    import java.io.IOException;
//	    import java.nio.charset.StandardCharsets;
//	    import java.util.HashMap;
//	    import java.util.List;

	   
	    	
	        public List<HashMap<String, String>> getReadJsonData(String jsonFilePath) throws IOException {
	            // Read JSON file to string
	            String jsonContent = FileUtils.readFileToString(new File(jsonFilePath), StandardCharsets.UTF_8);

	            // Convert string to List of HashMaps using Jackson ObjectMapper
	            ObjectMapper mapper = new ObjectMapper();
	            List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
	            });

	            return data;
	        }

	        public static void main(String[] args) {
	        	Dummy jsonReader = new Dummy();
	            String jsonFilePath = "/home/kapil/Desktop/AK/Careers_360_2nd_june/Test_data/url.json"; // Provide the actual file path
	            try {
	                List<HashMap<String, String>> jsonData = jsonReader.getReadJsonData(jsonFilePath);
	                for (HashMap<String, String> item : jsonData) {
	                    // Process each HashMap item
	                    for (String key : item.keySet()) {
	                        String value = item.get(key);
	                        System.out.println(key + ": " + value);
	                    }
	                }
	            } 
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }

	    



		




