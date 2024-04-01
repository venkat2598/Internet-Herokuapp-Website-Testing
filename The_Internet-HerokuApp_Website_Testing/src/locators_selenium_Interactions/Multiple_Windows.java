package locators_selenium_Interactions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Multiple_Windows extends BaseClass {
	
	
	
	@Test
	public void MultipleWindowsLink() {

		driver.navigate().back();
		WebElement multiplewindowlink=driver.findElement(By.linkText("Multiple Windows"));
		multiplewindowlink.click();
	}

	@Test(dependsOnMethods = "MultipleWindowsLink")
	public void MultipleWindow() {
		String oldwindow=driver.getWindowHandle();
		System.out.println("Main Window Title : " +driver.getTitle());
		WebElement window=driver.findElement(By.linkText("Click Here"));
		window.click();
		
		Set<String> Allwindows=driver.getWindowHandles();
		for (String newwindow : Allwindows) {
		
			//checking the window if not oldwindow then move to new window
			if(!newwindow.equals(oldwindow)) {
				//move to new window
				driver.switchTo().window(newwindow);
				//getting new window title 
				System.out.println("New windows Title: " +driver.getTitle());
				WebElement msg=driver.findElement(By.tagName("h3"));
				System.out.println("After move new window inside Heading MSG : " + msg.getText());
				//close the new window
				driver.close();
			}
		}
		// redirect to the old window
		driver.switchTo().window(oldwindow);

	}

}
