package locators_selenium_Interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Hovers extends BaseClass {

	@Test
	public void  HoversLink() {
		driver.navigate().to(URL);
		WebElement Hoverlink=driver.findElement(By.linkText("Hovers"));
		Hoverlink.click();
	}

	@Test(dependsOnMethods = "HoversLink")
	public void HoversInteract() {

		Actions action = new Actions(driver);	
		
		List<WebElement> Userlist=driver.findElements(By.xpath("//div[@class='figure']"));
		List<WebElement> UserText=	driver.findElements(By.xpath("//div[@class='figure']//h5"));
	
		for (WebElement users : Userlist) {
			action.moveToElement(users).build().perform();
			for (WebElement text : UserText) {
				System.out.println(text.getText());
			}
			
		}
	}

}
