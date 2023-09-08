package Kapil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baselibrary.Baselibrary;

public class static_dropdown extends Baselibrary
{
	
	//Staic dropdown
		// INR , AED,USD
		public static void main(String[] args) {
			
		
		WebElement staticDropdown = driver.findElement(By.xpath("ct100"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		}

}
