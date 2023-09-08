package careers_360_page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class CTA_Get_Info_Page extends Baselibrary
{
	public CTA_Get_Info_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"courses_blk\"]/div[4]/div/div[1]/div/div[2]/div[4]/button[2]")
	private WebElement Get_Info;
//	@FindBy(xpath="//div//iframe[@title=\"registrationModule\"]")
//	private WebElement iframe;
//	@FindBy(xpath="//div[text()='Sign Up']")
//	private WebElement Sign_up;
//	@FindBy(xpath="//div//input[@name=\"display_name\"]")
//	private WebElement name;
//	@FindBy(xpath="//div//input[@id=\"email\"]")
//	private WebElement 	email;
//	@FindBy(xpath="//div//input[@name=\"mobile_number\"]")
//	private WebElement mobile_n;
//	@FindBy(xpath="//div[@id='main-curr-edu-level']")
//	private WebElement study_in;
//	@FindBy(xpath="//*[@id='mCSB_1_container']/li[2]/label")
//	private WebElement option;
//	@FindBy(xpath="//div[@id='main-education-stream']") 
//	private WebElement Education_in;
//	@FindBy(xpath="//*[@id='mCSB_5_container']/li[2]/label")
//	private WebElement option1;
//	@FindBy(xpath="//div[@id='main-user-target-year']")
//	private WebElement Ad_Target;
//	@FindBy(xpath="//*[@id='mCSB_13_container']/li[3]/label")
//	private WebElement option2;
//	@FindBy(xpath="//div//input[@name='location']")
//	private WebElement Current_city;
//	@FindBy(xpath="//div//button[@type=\"submit\"]")
//	private WebElement signup;
//	@FindBy(xpath="//form[@id=\"signup\"]/div")
//	private WebElement verifysingin;
	
	public void click_On_Get_Info() throws InterruptedException
	{
		clickme(Get_Info);
		Thread.sleep(2000);
	}
//	public void click_On_Frame()
//	{
//		driver.switchTo().frame(iframe);
//	}
//	public void get_Signup_Text()
//	{
//		String text=Sign_up.getText();
//		System.out.println("Sign Up Title : "+text);
//	}
//	public void click_On_Name() throws InterruptedException
//	{
//		
//		name.sendKeys("Avinash");
//		Thread.sleep(5000);
//		
//	}
//	public void click_On_Email() throws InterruptedException
//	{
//		email.sendKeys("avinash@gmail.com");
//		Thread.sleep(2000);
//	}
//	public void click_On_Mobile() throws InterruptedException
//	{
//		mobile_n.sendKeys("9091731745");
//		Thread.sleep(2000);
//	}
//	public void click_On_Study() throws InterruptedException
//	{
//		clickme(study_in);
//	}
//	public void click_On_Study_Option()
//	{
//		clickme(option);
//	}
//	public void click_On_Education() throws InterruptedException
//	{
//		clickme(Education_in);
//	}
//	public void click_On_Edu_Option()
//	{
//		clickme(option1);
//	}
//	public void get_Select_Year() throws InterruptedException
//	{
//		clickme(Ad_Target);
//	}
//	public void click_On_Yrs_Option()
//	{
//		clickme(option2);
//	}
//	public void click_On_City() throws InterruptedException, AWTException
//	{
//		Current_city.sendKeys("Mathura,Uttar Pradesh");
//			Robot robot = new Robot();
//			robot.keyPress(KeyEvent.VK_DOWN);
////			Thread.sleep(2000);
//			robot.keyRelease(KeyEvent.VK_DOWN);
////			Thread.sleep(2000);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);
//	}
//	
//	public void click_On_Signup() 
//	{
//		clickme(signup);
//	}
//	

}
