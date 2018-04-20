package Search;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;




public class Search2 {
	
	
	
	@Test
	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.washingtonpost.com/") ;
		
		driver.manage().window().maximize() ; 
	
		driver.findElement(By.xpath(" .//*[@id='search-btn'] ")).click();
		
		driver.findElement(By.id("search-field")).sendKeys("egypt");
		driver.findElement(By.xpath(" .//*[@id='search-btn'] ")).click();
		driver.close();
		
	    


	}

}