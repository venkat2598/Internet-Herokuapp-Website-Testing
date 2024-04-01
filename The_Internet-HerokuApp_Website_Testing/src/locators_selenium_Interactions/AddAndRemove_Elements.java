package locators_selenium_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class AddAndRemove_Elements extends BaseClass {

	@Test
	public void MoveTOAdd_RemoveLink() {
		WebElement link = driver.findElement(By.linkText("Add/Remove Elements"));
		link.click();
	}

	@Test(dependsOnMethods = "MoveTOAdd_RemoveLink")
	public void Add_RemoveElements() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement AddElmtBtn= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
		AddElmtBtn.click();
		AddElmtBtn.click();

		WebElement removeElmtBtn=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
		removeElmtBtn.click();

	}


}
