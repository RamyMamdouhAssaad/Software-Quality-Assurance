package washingtonposttest;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class JobAlert extends ConstantMethods{
	
	@Test
	public void JobAlertMain()
	{
		driver.findElement(By.xpath(".//*[@id='emailaddress']")).sendKeys("7amedo@gmail.com");
		driver.findElement(By.xpath(".//*[@id='keyword']")).sendKeys("Accountant");
		driver.findElement(By.xpath(".//*[@id='location']")).sendKeys("misrrfsdjg");
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='RadialLocation']")));
		dropdown.selectByVisibleText("Within 10 miles");
		   
		
	    driver.findElement(By.xpath(".//*[@id='main']/div/div/div[1]/div/div/div/form/div[4]/div/div/div[1]/div/fieldset/div/div[1]/label")).click();
		driver.findElement(By.xpath(".//*[@id='main']/div/div/div[1]/div/div/div/form/div[4]/div/div/div[2]/div/fieldset/div/div[1]/label")).click();
		driver.findElement(By.xpath(".//*[@id='main']/div/div/div[1]/div/div/div/form/div[5]/input")).click();
		   
		
		
		
		
		String errorMessage = driver.findElement(By.xpath(".//*[@id='message']")).getText();
		
		if(errorMessage.equals("There is a problem. Please check the details you have entered"))
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Wrong");
		}
		
		
	}
	
	@BeforeTest
	public void beforeMethod()
	{
		driver.navigate().to("https://jobs.washingtonpost.com/newalert/");
	}
	
	
}
