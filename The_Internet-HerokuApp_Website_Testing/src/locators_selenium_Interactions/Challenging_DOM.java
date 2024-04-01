package locators_selenium_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Challenging_DOM extends BaseClass {

	@Test
	public void MoveToChallengingDOMLinnk() {

		driver.navigate().back();
		WebElement domlink =	driver.findElement(By.linkText("Challenging DOM"));
		domlink.click();
	}

	@Test(dependsOnMethods = "MoveToChallengingDOMLinnk")
	public void DomElementIdentify() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement btn1 = driver.findElement(By.xpath("//div[@class='large-2 columns']/a[1]"));
		btn1.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement btn2 = driver.findElement(By.xpath("//div[@class='large-2 columns']/a[2]"));
		btn2.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement btn3 = driver.findElement(By.xpath("//div[@class='large-2 columns']/a[3]"));
		btn3.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement  row5Editbtn= driver.findElement(By.xpath("//td[text()='Apeirian4']/following::a[text()='edit'][1]"));
		row5Editbtn.click();
		
		WebElement  row9Deletetbtn = driver.findElement(By.xpath("//td[text()='Apeirian8']/following::a[text()='delete'][1]"));
		row9Deletetbtn.click();
		
	}

}
