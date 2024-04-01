package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Context_Menu extends BaseClass {

	@Test
	public void MoveToContextMenuLink() {

		driver.navigate().back();
		WebElement ContextLink= driver.findElement(By.linkText("Context Menu"));
		ContextLink.click();
		
	}

	@Test(dependsOnMethods = "MoveToContextMenuLink")
	public void HandlingContextMenu() {
		
		WebElement RightClickInTheBox= driver.findElement(By.id("hot-spot"));
		
		Actions action = new  Actions(driver);
		action.contextClick(RightClickInTheBox).build().perform();
		
		driver.switchTo().alert().accept();
		
	}
	
	
}
