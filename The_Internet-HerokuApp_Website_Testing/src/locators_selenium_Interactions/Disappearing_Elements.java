package locators_selenium_Interactions;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class Disappearing_Elements extends BaseClass{

	@Test
	public void DisappearingElementsLink() {

		driver.navigate().back();
		WebElement DisappearingElmtLink = driver.findElement(By.linkText("Disappearing Elements"));
		DisappearingElmtLink.click();

	}

	@Test
	public void HandlingDisappearingElements() {

		List<WebElement>listelement = driver.findElements(By.xpath("//h3/following::li"));
		boolean Findelement =false;
		 System.out.println(listelement.size());
		
				for (WebElement webElement : listelement) {
					String	elementText=webElement.getText();
					System.out.println(elementText);
					if(elementText.equals("Gallery")) {
						Findelement=true;
						break;
			}
					
			}
	
	if(Findelement) {
		System.out.println("Element is present in website ");
	}else System.out.println("Element is  not present in website");

}

}
