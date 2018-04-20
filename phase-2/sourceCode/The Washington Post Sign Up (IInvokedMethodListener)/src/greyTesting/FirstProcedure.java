
package greyTesting;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class FirstProcedure {

	public static WebDriver driver = new FirefoxDriver();
	
	@BeforeSuite
	public void setup() throws Exception{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.washingtonpost.com/");
	}
	
	@AfterSuite
	public void terminate() throws Exception{
		driver.quit();
	}

}
