package Search;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Search {
	
	private WebDriver driver;

	
	@Before
	public void beforeMethod() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.washingtonpost.com/");
		driver.manage().window().maximize() ; 
	}

	
	@Test
	public void main() throws Exception {
		
		driver.findElement(By.xpath(" .//*[@id='search-btn'] ")).click();
		driver.findElement(By.id("search-field")).sendKeys("obama");
		driver.findElement(By.xpath(" .//*[@id='search-btn'] ")).click();
		
		
		WebElement element = driver.findElement(By.xpath("html/body/div[4]/div[3]/div/ul/li[2]/input"));
		String text = element.getText();
		System.out.println(text);
		Assert.assertEquals("Obama", "text");
		
	}
	@After
	public void aftertest() throws Exception{
		driver.quit();
	}
}
