package locators_selenium_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Nested_Frames extends BaseClass{

	@Test
	public void NestedFramesLink() {
		driver.navigate().to(URL);
		WebElement NFrameLink= driver.findElement(By.linkText("Nested Frames"));
		NFrameLink.click();
	}

	@Test(dependsOnMethods = "NestedFramesLink")
	public void NFrames() {

		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		
		WebElement NFrameLeft= driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
		System.out.println(NFrameLeft.getText());
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		WebElement NFramemiddle= driver.findElement(By.xpath("//div[@id='content']"));
		System.out.println(NFramemiddle.getText());
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		WebElement NFrameright= driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
		System.out.println(NFrameright.getText());
	
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		WebElement NFrameBottom= driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
		System.out.println(NFrameBottom.getText());
		
		
		
		
	}
	
}
