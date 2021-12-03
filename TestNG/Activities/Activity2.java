package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
	
  @Test
  public void f1() {
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Target Practice ");
  }
  
  @Test
  public void f2() {
	  WebElement blackBtn = driver.findElement(By.className("ui black button"));
	  Assert.assertEquals(blackBtn.getText(), "Green");
  }
  
  @Test(enabled=false)
  public void f3() {
	  System.out.println("This is skipped");
  }
  
  @Test
  public void f4() {
	  throw new SkipException("Skipping test case");
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
