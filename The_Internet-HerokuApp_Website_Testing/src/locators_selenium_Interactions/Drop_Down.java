package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Drop_Down extends BaseClass{

	@Test
	public void DropdownLink() {
		
		driver.navigate().back();
		WebElement dropdownLink=driver.findElement(By.linkText("Dropdown"));
		dropdownLink.click();
	}
	
	
	@Test(dependsOnMethods = "DropdownLink")
	public void Dropdown() {
		
		WebElement dropdown=driver.findElement(By.id("dropdown"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
	}
}
