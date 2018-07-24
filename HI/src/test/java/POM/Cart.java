package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

	@FindBy (xpath="//*[text()='Cart']")
	private WebElement cart;
	
	
	public Cart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


public void clickCart()
{
	cart.click();
	}
}
	