package greyTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class SignMeUp extends FirstProcedure {
	@Test
	public void run(){
		
		//this buttons for click on Sign In then inside the page Click Create New Account
		driver.findElement(By.xpath(".//*[@id='sign-in-link']/span")).click();
		driver.findElement(By.xpath(".//*[@id='qa-link-register']")).click();
		//input UserName and Password 			
		driver.findElement(By.xpath(".//*[@id='qa-longRegEmailTf']")).sendKeys("mina132@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='qa-longRegPwdTf']")).sendKeys("bue1234567");
		driver.findElement(By.xpath(".//*[@id='qa-longRegConfirmPwdTf']")).sendKeys("bue1234567");
		
		Select Gender = new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegGenderSelect']")));
		Gender.selectByVisibleText("Male");
		
		Select selectJobIndustry = new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegJobIndustrySelect']")));
		selectJobIndustry.selectByVisibleText("Education");
		
		Select companySize = new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegCoSizeSelect']")));
		companySize.selectByVisibleText("100 - 249");
		
		Select Country = new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegCountrySelect']")));
		Country.selectByVisibleText("United States");
		
		driver.findElement(By.xpath(".//*[@id='qa-longRegZipcodeTf']")).sendKeys("01001");
		//from this check what is may be error because the program does not input this field
		// the code is correct just check if there is x-path 
		Select primaryResponsibility= new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegJobRespSelect']")));
		primaryResponsibility.selectByVisibleText("Other");
		
		Select yearOfBirth= new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegYobSelect']")));
		yearOfBirth.selectByVisibleText("1991");
		
		Select jobTitle= new Select(driver.findElement(By.xpath(".//*[@id='qa-longRegJobTitleSelect']")));
		jobTitle.selectByVisibleText("Student/Intern");

		driver.findElement(By.xpath(".//*[@id='qa-longRegTosCb']")).click();
		driver.findElement(By.xpath(".//*[@id='qa-longRegCreateAcctSubmit']")).click();

	}
}