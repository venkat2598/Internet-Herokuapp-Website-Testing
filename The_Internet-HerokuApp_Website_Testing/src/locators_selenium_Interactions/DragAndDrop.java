package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class DragAndDrop extends BaseClass {

	@Test
	public void Drag_DropLink() {

		driver.navigate().back();
		WebElement DDLink=	driver.findElement(By.linkText("Drag and Drop"));
		DDLink.click();
	}

	@Test(dependsOnMethods = "Drag_DropLink")
	public void DragAndDrops() {
		
		WebElement from =driver.findElement(By.id("column-a"));
		WebElement to= driver.findElement(By.id("column-b"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		String textTo = to.getText();
		System.out.println(textTo);
		if(textTo.equals("Dropped!")) {  
		System.out.println("PASS: File is dropped to target as expected");
		}else {
		System.out.println("FAIL: File couldn't be dropped to target as expected");
		}

	}
}

