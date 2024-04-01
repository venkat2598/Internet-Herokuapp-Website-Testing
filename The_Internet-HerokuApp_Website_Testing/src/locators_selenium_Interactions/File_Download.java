package locators_selenium_Interactions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class File_Download extends BaseClass {

	@Test
	public void Filedownloadlink() {


		driver.navigate().back();
		WebElement downloadlink=driver.findElement(By.linkText("File Download"));
		downloadlink.click();

	}

	@Test(dependsOnMethods = "Filedownloadlink")
	public void Downloadfile() {


		WebElement downloadfile=driver.findElement(By.linkText("LambdaTest.txt"));
		downloadfile.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		File filLocation= new File("C:\\Users\\user\\Downloads");
		File [] AllFiles=filLocation.listFiles();
		boolean filefound=false;
		for (File file : AllFiles) {
			if(file.getName().equals("LambdaTest.txt"))
			{
				filefound=true;
				break;
			}
		}if (filefound) {
			System.out.println("file downloaded is present");
		}else {
			System.out.println("file downloaded is not present");
		}


	}

}
