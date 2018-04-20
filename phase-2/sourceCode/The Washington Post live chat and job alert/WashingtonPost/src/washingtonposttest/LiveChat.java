package washingtonposttest;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LiveChat extends ConstantMethods{

	
	@Test
	public void LiveChatMain()
	{
		driver.findElement(By.xpath(".//*[@id='vf-wrapper']/div[6]/div[1]/div[1]/div[1]/a/div/div")).click();
		driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("Oscars");
		driver.findElement(By.xpath(".//*[@id='text']")).sendKeys("what about your first oscar?");
		driver.findElement(By.xpath(".//*[@id='vf-wrapper']/div[6]/div[1]/div[1]/div[2]/form/button")).click();
		String successMessage = driver.findElement(By.xpath(".//*[@id='vf-wrapper']/div[6]/div[1]/div[1]/div[1]/a/div/span/span[1]")).getText(); 
		
		if(successMessage.equals("Thank you for your question!"))
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
		driver.navigate().to("https://live.washingtonpost.com/ask-tom-042016.html");
	}
	
	
}
