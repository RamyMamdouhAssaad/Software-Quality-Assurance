package greyTesting;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.Assert;

	@Listeners(value=SignMeUp.class)

public class SignMeUp extends Assert implements IInvokedMethodListener{
	public static WebDriver driver = new FirefoxDriver();
	//public static WebDriver chromeDriver = new ChromeDriver();	
	@Test
	public void run(){
		
		assertTrue(true);
		//this buttons for click on Sign In then inside the page Click Create New Account
		driver.findElement(By.xpath(".//*[@id='sign-in-link']/span")).click();
		driver.findElement(By.xpath(".//*[@id='qa-link-register']")).click();
		//input UserName and Password 			
		driver.findElement(By.xpath(".//*[@id='qa-longRegEmailTf']")).sendKeys("mina112@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='qa-longRegPwdTf']")).sendKeys("bue1234567");
		driver.findElement(By.xpath(".//*[@id='qa-longRegConfirmPwdTf']")).sendKeys("bue1234567");
		Select Gender = new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegGenderSelect']")));
		Gender.selectByVisibleText("Male");
		
		Select selectJobIndustry = new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegJobIndustrySelect']")));
		selectJobIndustry.selectByVisibleText("Education");
		
		Select companySize = new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegCoSizeSelect']")));
		companySize.selectByVisibleText("1 - 49");
		
		Select Country = new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegCountrySelect']")));
		Country.selectByVisibleText("United States");
		
		driver.findElement(By.xpath(".//*[@id='qa-longRegZipcodeTf']")).sendKeys("01001");
		
		Select primaryResponsibility= new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegJobRespSelect']")));
		primaryResponsibility.selectByVisibleText("Other");
		
		Select yearOfBirth= new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegYobSelect']")));
		yearOfBirth.selectByVisibleText("1991");
		
		Select jobTitle= new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegJobTitleSelect']")));
		jobTitle.selectByVisibleText("Student/Intern");

		driver.findElement(By.xpath(".//*[@id='qa-longRegTosCb']")).click();
		driver.findElement(By.xpath(".//*[@id='qa-longRegCreateAcctSubmit']")).click();
	}
	@BeforeTest
	public void beforetest()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.washingtonpost.com/");
		
	}
	@AfterTest
	public void terminate() throws Exception{
		driver.quit();
	}
	
	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.out.println("MethodName "+ "\t"+arg0.getTestMethod().getMethodName() +"\t" + "Class"+ arg1.getTestClass().getName());
	}
	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.out.println("MethodName"+"\t"+arg0.getTestMethod().getMethodName()+"\t"+ "Class"+ arg1.getTestClass().getName());	
	}

}


	
