package Scripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import POM.Cart;


public class ValidateC extends Base {
	
	@Test
	public void validateClickCart()
	{
		Cart a=new Cart(driver);
		a.clickCart();
		
		test.log(LogStatus.INFO, "cart selected ");
	}

}