package src;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;


public class Video {
	WebDriver driver ;
  @Test
  public void f() {
	  WebElement video = driver.findElement(By.tagName("video"));

	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  //pause the video
	  js.executeScript("arguments[0].pause();", video);
	 //reload the video
	  js.executeScript("arguments[0].load();", video);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver() ; 
	  //driver.navigate().to("https://www.washingtonpost.com/") ;
	  
	  // 
	  driver.navigate().to("https://www.washingtonpost.com/video/world/low-expectations-for-doha-oil-meeting/2016/04/17/4958c6bc-031d-11e6-8bb1-f124a43f84dc_video.html") ;
	  driver.manage().window().maximize() ;
}

  @AfterMethod
  public void afterMethod() {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.quit() ;
  }

}
