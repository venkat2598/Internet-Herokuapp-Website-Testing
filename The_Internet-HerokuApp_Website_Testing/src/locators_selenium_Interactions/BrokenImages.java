package locators_selenium_Interactions;

import java.awt.Image;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class BrokenImages extends  BaseClass {

	@Test
	public void MoveToBrokenImage() {

		driver.navigate().back();
		WebElement Imagelink=driver.findElement(By.linkText("Broken Images"));
		Imagelink.click();

	}

	@Test(dependsOnMethods = "MoveToBrokenImage")
	public void Broken_Images() {
	
		List <WebElement> image= driver.findElements(By.xpath("//div[@class='example']/img"));
		for (WebElement img : image) {
	
				if(img.getAttribute("naturalWidth").equals("0")) {
			
				System.out.println(img.getAttribute("outerHTML") + "image is broken");
				}
			else
				System.out.println(img.getAttribute("outerHTML") + "image is not broken");
			
		}	
	}

}

