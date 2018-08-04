package Scripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import POM.AmazonHome;

public class ValidateCart extends BaseClass {
	
	@Test
	public void validateClickCart()
	{
		AmazonHome a=new AmazonHome(driver);
		
		
		a.clickAzIn();
		

		test.log(LogStatus.INFO, "amazon in  selected ");
	}

}
