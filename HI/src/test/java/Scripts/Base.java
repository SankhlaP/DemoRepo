package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base {

	WebDriver driver;
	public ExtentReports extent;
	ExtentTest test;
	@BeforeMethod
	public void preCondition()
	{
		extent =new ExtentReports("G:\\MyReport.html",true);
		 test = extent.startTest("verifyHomePage");
		System.setProperty("webdriver.chrome.driver", "G:\\derek\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		 test.log(LogStatus.INFO, "Browser started ");
		driver.get("https://www.amazon.in/");
	}
		
@AfterMethod
public void postCondition()
{
		extent.endTest(test);
		extent.flush();
	}
	

}