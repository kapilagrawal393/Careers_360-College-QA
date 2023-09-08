package baselibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import application_utility.Application_utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import properties_utility.Properties_util;

public class Baselibrary implements Properties_util, Application_utility {

	public static WebDriver driver;
	String config = "/home/kapil/Desktop/AK/Careers_360_2nd_june/Test_data/config.properties";

//		@Parameters("browser")
//		@BeforeTest

	String browser ;
	public void geturllaunch(String url) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

//			WebDriverManager.edgedriver().setup();
//			EdgeOptions options = new EdgeOptions();
//			options.addArguments("--disable-notifications");
//			driver = new EdgeDriver(options);

//			WebDriverManager.firefoxdriver().setup();
//			FirefoxOptions options = new FirefoxOptions();
//			options.addArguments("--disable-notifications");
//			driver = new FirefoxDriver(options);

//			WebDriverManager.safaridriver().setup();
//			SafariOptions options = new SafariOptions();
//			options.addArguments("--disable-notifications");
//			driver = new SafariDriver();
		
// browser = System.getProperty("browser")!= null ? System.getProperty("browser"):getreaddata("browser");

//			if (browser.equalsIgnoreCase("chrome"))
//			{
//				WebDriverManager.chromedriver().setup();
//				driver = new ChromeDriver();
//				System.out.println("Chrome is launched");
//			}
//			else if(browser.equalsIgnoreCase("firefox"))
//			{
//				WebDriverManager.firefoxdriver().setup();
//				driver = new FirefoxDriver();
//				System.out.println("Firefox is launched");
//			}
//			else if (browser.equalsIgnoreCase("edge"))
//			{
//				WebDriverManager.edgedriver().setup();
//				driver = new EdgeDriver();
//				System.out.println("edge is launched");
//			}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id=\"common-signin-close\"]")).click();

	 }

//		@Test

//		public void geturllaunchc()
//		{
//			driver.get("https://www.careers360.com/university/indian-institute-of-technology-delhi");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//button[@id=\"common-signin-close\"]")).click();
//		}

//		@AfterTest
//		
//		public void teardown()
//		{
//			driver.quit();
//		}
	public String getreaddata(String env) {
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(config);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(env);
		} catch (Exception e) {
			System.out.println("Error data");
		}
		return value;
	}

	public void clickme(WebElement ele)

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

	}

	public void selectbyvalue(String value, WebElement ele) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);

	}

	public void clickme1(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
	}

	public String getexcelreaddata(String path, int sheetno, int rowno, int colno) throws IOException {
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			value = sheet.getRow(rowno).getCell(colno).getStringCellValue();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return value;
	}

	public List<HashMap<String, String>> getReadJsonData(String jsonFilePath) throws IOException {
		// read json file to string
		String jsonContent = FileUtils.readFileToString(new File(jsonFilePath), StandardCharsets.UTF_8);
		// convert string to HashMap using jackson databind
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent,
				new TypeReference<List<HashMap<String, String>>>() {
				});
		return data;
	}

}

//		    public static void main(String[] args) {
//		        JsonReader jsonReader = new JsonReader();
//		        String jsonFilePath = "path/to/your/json/file.json"; // Provide the actual file path
//		        try {
//		            List<HashMap<String, String>> jsonData = jsonReader.getReadJsonData(jsonFilePath);
//		            for (HashMap<String, String> item : jsonData) {
//		                // Process each HashMap item
//		                for (String key : item.keySet()) {
//		                    String value = item.get(key);
//		                    System.out.println(key + ": " + value);
//		                }
//		            }
//		        } catch (IOException e) {
//		            e.printStackTrace();
//		        }
//		    }
//		}
