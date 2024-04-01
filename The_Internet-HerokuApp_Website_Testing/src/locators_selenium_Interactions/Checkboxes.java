package locators_selenium_Interactions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Checkboxes extends BaseClass {

	
	@Test
	public void MoveToCheckboxesLink() {
		
		driver.navigate().to(URL);;
		WebElement CheckboxesLink=driver.findElement(By.linkText("Checkboxes"));
		CheckboxesLink.click();
		
	}
	
	@Test(dependsOnMethods = "MoveToCheckboxesLink")
	public void Check_boxes() {
		WebElement checkbox1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		checkbox1.click();
	}
	
	
}
