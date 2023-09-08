package careers_360_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import careers_360_page.University_Placement_Page;

public class University_Placement_Test extends Baselibrary
{
	University_Placement_Page ob;
	@Parameters("env")
	@BeforeTest
	
	public void get_url_Launch(String env)
	{
		geturllaunch(getreaddata(env));
		ob = new University_Placement_Page();
	}
	
	
	@Test(priority=1)
	public void get_Header_Title()
	{
		ob.get_Header_Title();
	}
	@Test(priority=2)
	public void clickon_Placement_Module()
	{
		ob.clickon_Placement_Module();
	}
//	@Test(priority=3)
//	public void clickon_Placement_Report()
//	{
//		ob.clickon_Placement_Report();
//	}
	@Test(priority=3)
	public void get_IIT_Delhi_Placements_Title()
	{
		ob.get_IIT_Delhi_Placements_Title();
	}
	@Test(priority=4)
	public void get_IIT_Delhi_Placements_Process_Title()
	{
		ob.get_IIT_Delhi_Placements_Process_Title();
	}
	@Test(priority=5)
	public void get_IIT_Delhi_Placement_Details_2021_Title()
	{
		ob.get_IIT_Delhi_Placement_Details_2021_Title();
	}
	@Test(priority=6)
	public void get_DegreeWise_IITDelhi_Placement_Statistics_Title()
	{
		ob.get_DegreeWise_IITDelhi_Placement_Statistics_Title();
	}
	@Test(priority=7)
	public void get_DegreeWise_IITDelhi_Placement_Statistics_Data()
	{
		ob.get_DegreeWise_IITDelhi_Placement_Statistics_Data();
	}
	@Test(priority=8)
	public void clickon_IITDelhi_PlacementData_MTech_Title()
	{
		ob.clickon_IITDelhi_PlacementData_MTech_Title();
	}
	@Test(priority=9)
	public void clickon_IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Title()
	{
		ob.clickon_IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Title();
	}
	@Test(priority=10)
	public void clickon_IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Data()
	{
		ob.clickon_IITDelhi_Placement_Data_MTech_in_Radio_Frequency_Design_Technology_Data();
	}
	@Test(priority=11)
	public void clickon_SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Title()
	{
		ob.clickon_SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Title();
	}
	@Test(priority=12)
	public void clickon_SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Data()
	{
		ob.clickon_SectorWise_IITDelhi_Placements_MTech_in_Radio_Frequency_Design_Technology_Data();
	}
	@Test(priority=13)
	public void clickon_SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Title()
	{
		ob.clickon_SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Title();
	}
	@Test(priority=14)
	public void clickon_SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Data()
	{
		ob.clickon_SectorWise_IITDelhi_PlacementData_MTech_Optoelectronics_Optical_Communication_Data();
	}
	@Test(priority=15)
	public void clickon_Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Title()
	{
		ob.clickon_Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Title();
	}
	@Test(priority=16)
	public void clickon_Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Data()
	{
		ob.clickon_Salary_Offered_IITDelhi_Placements_BhartiSchool_of_Telecom_Technology_Management_Data();
	}
	@Test(priority=17)
	public void clickon_IndustryWise_IITDelhi_Internship_Data_MDes_Title()
	{
		ob.clickon_IndustryWise_IITDelhi_Internship_Data_MDes_Title();
	}
	@Test(priority=18)
	public void clickon_IndustryWise_IITDelhi_Internship_Data_MDes_Data()
	{
		ob.clickon_IndustryWise_IITDelhi_Internship_Data_MDes_Data();
	}
	@Test(priority=19)
	public void clickon_IITDelhi_Top_Recruiters_Title()
	{
		ob.clickon_IITDelhi_Top_Recruiters_Title();	
	}
	@Test(priority=20)
	public void clickon_IITDelhi_Top_Recruiters_Data()
	{
		ob.clickon_IITDelhi_Top_Recruiters_Data();
	}
	@Test(priority=21)
	public void clickon_Statistics_for_Academic_Year_2020_Title()
	{
		ob.clickon_Statistics_for_Academic_Year_2020_Title();
	}
	@Test(priority=22)
	public void clickon_Statistics_for_Academic_Year_2020_Data()
	{
		
		ob.clickon_Statistics_for_Academic_Year_2020_Data();
	}
	
	
	
	
	
	
	
	
	
	
	

}
