package careers_360_page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.Baselibrary;

public class CTA_College_Dept_Enquire_Page extends Baselibrary {
	public CTA_College_Dept_Enquire_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='container']/ul/li[10]")
	private WebElement College_department_button;
	@FindBy(xpath = "//button[@class='btns btn_orange enquire btn']")
	private WebElement Enquire;
	@FindBy(xpath = "//div//iframe[@title='registrationModule']")
	private WebElement iframe;
	@FindBy(xpath = "//div[text()='Sign Up']")
	private WebElement Sign_up;

	public void clickon_College_department_button() {
		clickme(College_department_button);
	}

	public void click_On_Enquire() throws InterruptedException {
		clickme(Enquire);
		Thread.sleep(2000);
	}

	public void click_On_Frame() {
		driver.switchTo().frame(iframe);
	}

	public void get_Signup_Text() {
		String text = Sign_up.getText();
		System.out.println("Sign Up Title : " + text);
	}

	static String path = "/home/kapil/Desktop/AK/Careers_360_2nd_june/Test_data/360 c.xlsx";

	public static String getReadData(String path, int sheetno, int rowno, int colno) throws IOException {
		String value = "";
		double num;
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			if (colno == 2 || colno == 4 || colno == 5) {
				num = sheet.getRow(rowno).getCell(colno).getNumericCellValue();
				value = String.valueOf(num);
			} else {
				value = sheet.getRow(rowno).getCell(colno).getStringCellValue();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return value;

	}

	public void singin_details() throws IOException, AWTException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement name = driver.findElement(By.xpath("//*[@id='display_name']"));
		wait.until(ExpectedConditions.elementToBeClickable(name)).sendKeys(getReadData(path, 0, 1, 0));

		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		wait.until(ExpectedConditions.elementToBeClickable(email)).sendKeys(getReadData(path, 0, 1, 1));

		WebElement mob = driver.findElement(By.id("mobile_number"));
		wait.until(ExpectedConditions.elementToBeClickable(mob)).sendKeys(getReadData(path, 0, 1, 2));

		WebElement dropdown1 = driver.findElement(By.id("main-curr-edu-level"));
		String option1 = getReadData(path, 0, 1, 3);
		WebElement choice1 = driver.findElement(
				By.xpath("//div[@id='main-curr-edu-level']/div/div/div/ul/div/div/li/label[contains(text(),'" + option1
						+ "')]"));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown1)).click();
		wait.until(ExpectedConditions.elementToBeClickable(choice1)).click();

		WebElement dropdown2 = driver.findElement(By.xpath("//div[@id='main-education-stream']"));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown2)).click();

		String option2 = getReadData(path, 0, 1, 4);
		char[] index2 = option2.toCharArray();
		int indexing2 = 0;
		if (Character.isDigit(index2[0])) {
			indexing2 = Character.getNumericValue(index2[0]);
		}
		Robot robot = new Robot();
		for (int i = 0; i <= indexing2; i++) {
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.delay(250);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement dropdown3 = driver.findElement(By.id("main-user-target-year"));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown3)).click();
		String option3 = getReadData(path, 0, 1, 5);
		char[] index3 = option3.toCharArray();
		int indexing3 = 0;
		if (Character.isDigit(index3[0])) {
			indexing3 = Character.getNumericValue(index3[0]);
		}
		for (int i = 0; i <= indexing3; i++) {
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.delay(250);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement city = driver.findElement(By.xpath("//div//input[@name='location']"));
		wait.until(ExpectedConditions.elementToBeClickable(city)).sendKeys(getReadData(path, 0, 1, 6));
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement submit = driver.findElement(By.xpath("//div//button[@type='submit']"));
		wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
	}
}
