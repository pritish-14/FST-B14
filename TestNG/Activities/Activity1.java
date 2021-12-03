package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	WebDriver driver;
  @Test
  public void verifyTitle() {
	  String title = driver.getTitle();
	  System.out.println("The title of the page is : "+title);
	  Assert.assertEquals(title, "Training Support");
	  
	  driver.findElement(By.id("about-link")).click();
	  
	  String newTitle = driver.getTitle();
	  System.out.println("New page title is : "+ newTitle);
	  Assert.assertEquals(newTitle, "About Training Support");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
