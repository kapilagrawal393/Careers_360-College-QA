package careers_360_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class University_Placement_Page extends Baselibrary
{
	public University_Placement_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class=\"banner_collge_name\"]")
	private WebElement Header_Title;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div[2]/div/ul/li[5]/a")
	private WebElement placement_button;
//	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[1]/div[2]/div/div[2]/div/div[2]/button")
//	private WebElement get_placement_report;
	@FindBy(xpath="//div[@class='tupple placements']/h2")
	private WebElement IIT_Delhi_Placements;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[1]/div/h2[1]")
	private WebElement IIT_Delhi_Placement_Process;
	@FindBy(xpath="//h2[text()='IIT Delhi Placement Details 2021']")
	private WebElement IIT_Delhi_Placement_Details_2021;
	@FindBy(xpath="//h3[text()='Degree-Wise IIT Delhi Placement Statistics (2019-21)']")
	private WebElement DegreeWise_IITDelhi_Placement_Statistics_Title;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[1]/div/div[2]")
	private WebElement DegreeWise_IITDelhi_Placement_Statistics_Text;
	@FindBy(xpath="//h3[text()='IIT Delhi Placement Data - M.Tech in Radio Frequency Design and Technology (2019-21)']")
	private WebElement IITDelhi_PlacementData_MTech_Title;
	@FindBy(xpath="//h3[text()='IIT Delhi Placement Data - M.Tech in Radio Frequency Design and Technology (2019-21)']")
	private WebElement IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Title;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[1]/div/div[3]")
	private WebElement IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Text;
	@FindBy(xpath="//h3[text()='Sector-Wise IIT Delhi Placements - M.Tech in Radio Frequency Design and Technology (2019-21)']")
	private WebElement SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Title;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[1]/div/div[4]")
	private WebElement SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Text;
	@FindBy(xpath="//div//h3[text()='IIT Delhi Placement Data - Department of Management Studies (2019-21)']")
	private WebElement IITDelhiPlacement_Data_Department_of_Management_Studies_Title;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[1]/div/div[5]")
	private WebElement IITDelhiPlacement_Data_Department_of_Management_Studies_Text;
	@FindBy(xpath="//div//h3[text()='Sector-Wise IIT Delhi Placement - Department of Management Studies (2019-21)']")
	private WebElement SectorWise_IITDelhiPlacement_Department_of_Management_Studies_Title;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[1]/div/div[6]")
	private WebElement SectorWise_IITDelhiPlacement_Department_of_Management_Studies_Text;
	@FindBy(xpath="//div//h3[text()='Sector-Wise IIT Delhi Placement Data - M.Tech Optoelectronics and Optical Communication (2019-21)']")
	private WebElement SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Title; 
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[1]/div/div[7]")
	private WebElement SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Text;
	@FindBy(xpath="//div//h3[text()='Salary Offered IIT Delhi Placements - Bharti School of Telecom Technology and Management (2019-21)']")
	private WebElement Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Title;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[1]/div/div[8]")
	private WebElement Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Text;
	@FindBy(xpath="//div//h3[text()='Industry-Wise IIT Delhi Internship Data - M.Des (2019-21)']")
	private WebElement IndustryWise_IITDelhi_Internship_Data_MDes_Title;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[1]/div/div[9]")
	private WebElement IndustryWise_IITDelhi_Internship_Data_MDes_Text;
	@FindBy(xpath="//div//h3[text()='IIT Delhi Top Recruiters']")
	private WebElement IITDelhi_Top_Recruiters_Title;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[1]/div/table")
	private WebElement IITDelhi_Top_Recruiters_Text;
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[3]/h3")
	private WebElement Statistics_for_Academic_Year_2020_Title; 
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[2]/div/div/div[1]/div[1]/div[3]/div")
	private WebElement Statistics_for_Academic_Year_2020_Text;
	
	public void get_Header_Title()
	{
		String text = Header_Title.getText();
		System.out.println("Header_Title: "+text);
	}
	public void clickon_Placement_Module()
	{
		clickme(placement_button);
	}
//	public void clickon_Placement_Report()
//	{
//		clickme(get_placement_report);
//	}
	public void get_IIT_Delhi_Placements_Title()
	{
		String text = IIT_Delhi_Placements.getText();
		System.out.println("IIT_Delhi_Placements_Title: "+text);
	}
	public void get_IIT_Delhi_Placements_Process_Title()
	{
		String text = IIT_Delhi_Placement_Process.getText();
		System.out.println("IIT_Delhi_Placements_Process_Title: "+text);
	}
	public void get_IIT_Delhi_Placement_Details_2021_Title()
	{
		String text = IIT_Delhi_Placement_Details_2021.getText();
		System.out.println("IIT_Delhi_Placement_Details_2021_Title: "+text);
	}
	public void get_DegreeWise_IITDelhi_Placement_Statistics_Title()
	{
		String text = DegreeWise_IITDelhi_Placement_Statistics_Title.getText();
		System.out.println("DegreeWise_IITDelhi_Placement_Statistics_Title: "+text);
	}
	public void get_DegreeWise_IITDelhi_Placement_Statistics_Data()
	{
		String text = DegreeWise_IITDelhi_Placement_Statistics_Text.getText();
		System.out.println("DegreeWise_IITDelhi_Placement_Statistics_Data: "+text);
	}
	public void clickon_IITDelhi_PlacementData_MTech_Title()
	{
		String text = IITDelhi_PlacementData_MTech_Title.getText();
		System.out.println("IITDelhi_PlacementData_MTech_Title: "+text);
	}
	public void clickon_IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Title()
	{
		String text = IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Title.getText();
		System.out.println("IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Title: "+text);
	}
	public void clickon_IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Data()
	{
		String text = IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Text.getText();
		System.out.println("IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Text: "+text);
	}
	public void clickon_SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Title()
	{
		String text = SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Title.getText();
		System.out.println("SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Title: "+text);
	}
	public void clickon_SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Data()
	{
		String text = SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Text.getText();
		System.out.println("SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Text: "+text);
	}
	public void clickon_SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Title()
	{
		String text = SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Title.getText();
		System.out.println("SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Title: "+text);
	}
	public void clickon_SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Data()
	{
		String text = SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Text.getText();
		System.out.println("SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Text: "+text);
	}
	public void clickon_Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Title()
	{
		String text = Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Title.getText();
		System.out.println("Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Title: "+text);
	}
	public void clickon_Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Data()
	{
		String text = Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Text.getText();
		System.out.println("Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Text: "+text);
	}
	public void clickon_IndustryWise_IITDelhi_Internship_Data_MDes_Title()
	{
		String text = IndustryWise_IITDelhi_Internship_Data_MDes_Title.getText();
		System.out.println("IndustryWise_IITDelhi_Internship_Data_MDes_Title: "+text);
	}
	public void clickon_IndustryWise_IITDelhi_Internship_Data_MDes_Data()
	{
		String text = IndustryWise_IITDelhi_Internship_Data_MDes_Text.getText();
		System.out.println("IndustryWise_IITDelhi_Internship_Data_MDes_Text: "+text);
	}
	public void clickon_IITDelhi_Top_Recruiters_Title()
	{
		String text = IITDelhi_Top_Recruiters_Title.getText();
		System.out.println("IITDelhi_Top_Recruiters_Title: "+text);
	}
	public void clickon_IITDelhi_Top_Recruiters_Data()
	{
		String text = IITDelhi_Top_Recruiters_Text.getText();
		System.out.println("IITDelhi_Top_Recruiters_Text: "+text);
	}
	public void clickon_Statistics_for_Academic_Year_2020_Title()
	{
		String text = Statistics_for_Academic_Year_2020_Title.getText();
		System.out.println("Statistics_for_Academic_Year_2020_Title: "+text);
	}
	public void clickon_Statistics_for_Academic_Year_2020_Data()
	{
		String text = Statistics_for_Academic_Year_2020_Text.getText();
		System.out.println("Statistics_for_Academic_Year_2020_Text: "+text);
	}

}
