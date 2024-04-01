package locators_selenium_Interactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class File_Upload extends BaseClass{

	@Test
	public void FileUploadLink() {

		driver.navigate().back();
	
		WebElement Link=driver.findElement(By.linkText("File Upload"));
		Link.click();
	}

	@Test(dependsOnMethods = "FileUploadLink")
	public void FileUpload() {

		WebElement chooseBtn= driver.findElement(By.xpath("//input[@type='file' and @name='file']"));
		chooseBtn.sendKeys("C:\\Users\\user\\Downloads\\American-Airlines-Admirals-Club.jpeg");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement uploadbtn= driver.findElement(By.id("file-submit"));
		uploadbtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement uploadstatus=driver.findElement(By.tagName("h3"));
		System.out.println(uploadstatus.getText());
		WebElement uploadedfile=driver.findElement(By.id("uploaded-files"));
		String name=uploadedfile.getText();
		System.out.println(name);

	}


}
