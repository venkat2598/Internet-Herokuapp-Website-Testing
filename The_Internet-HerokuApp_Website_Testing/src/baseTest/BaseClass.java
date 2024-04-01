package baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	FileInputStream input;
	public static	Properties prop;
	public static WebDriver driver;
	public static String URL;

	public Properties LoadProperty() {

		try {
			input = new FileInputStream("config.properties");
			prop=new Properties();
			prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

	@BeforeSuite
	public void LaunchBrowser() {

		LoadProperty();
		 URL = prop.getProperty("url");
		String DriverLocation=prop.getProperty("driverlocation");

		if(prop.getProperty("browser").equalsIgnoreCase("Firefox")) {
			System.setProperty("Webdriver.gecko.driver", DriverLocation);
			driver=new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("chroMe")) {
			System.setProperty("Webdriver.chrome.driver", DriverLocation);
			driver=new ChromeDriver();
		}
		
		driver.navigate().to(URL);

	
	}
	
	@AfterSuite
	public void TearDown() {
		driver.quit();
	}

}
