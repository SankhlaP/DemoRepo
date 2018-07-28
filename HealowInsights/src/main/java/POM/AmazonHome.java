package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {
	@FindBy (xpath="//a[contains(text(),'Your Amazon.in')]")
	private WebElement azIn;
	
	
	
	
	public AmazonHome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


public void clickAzIn()

{
	azIn.click();
}



}
	
	