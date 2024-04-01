package locators_selenium_Interactions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Secure_File_Download{
	WebDriver driver;

	@Test
	public  void Setup_SecureFileDownload() {
		System.setProperty("webdriver.gecko.driver", "Driver_Exe_File\\geckodriver.exe");
		driver = new FirefoxDriver();
		String Url="https://admin:admin@the-internet.herokuapp.com/download_secure";
		driver.get(Url);
	}

	
	@Test(priority = 1)
	public void SecureFileDownload() {

		WebElement downloadfile=driver.findElement(By.linkText("webdriverIO.png"));
		downloadfile.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String location="C:\\Users\\user\\Downloads";
		File filelocation=new File(location);
		File[] allfiles= filelocation.listFiles();
		boolean filefound=false;
		
		for (File files : allfiles) {
			if(files.getName().equals("webdriverIO.png"))
			{
				filefound=true;
				break;
			}

		}
		if (filefound) {
			System.out.println("Secure file downloaded is present");
		}else {
			System.out.println("Secure file downloaded is not present");
		}
		
		
		driver.quit();
	}
	
}
