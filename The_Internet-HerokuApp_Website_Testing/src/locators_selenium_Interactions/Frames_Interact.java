package locators_selenium_Interactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Frames_Interact  extends BaseClass {

	@Test
	public void FramesLink() {

		driver.navigate().to(URL);
		WebElement framelink=driver.findElement(By.linkText("Frames"));
		framelink.click();
	}

	@Test(dependsOnMethods = "FramesLink")
	public void NestedFrames() {
		WebElement NFrameLink= driver.findElement(By.xpath("//*[contains(text(),'Nested Frames')]"));
		NFrameLink.click();
	}
	
	@Test(dependsOnMethods = "NestedFrames")
	public void NFrames() {
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		WebElement NFrameLeft= driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
		System.out.println(NFrameLeft.getText());
	}

	@Test(dependsOnMethods = "NFrames")
	public void MoveToIframe() {
		driver.navigate().back();
		WebElement iframe=driver.findElement(By.linkText("iFrame"));
		iframe.click();

	}
	
	@Test(dependsOnMethods = "MoveToIframe")
	public void IFramesInteract(){
		
		
		driver.switchTo().frame(0);
		WebElement getinsideboxmsg=driver.findElement(By.xpath("//body[@id='tinymce']/p")); 
		String msg=getinsideboxmsg.getText(); 
		System.out.println(msg);
	}
}

