package com.ibm.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_2 {
	WebDriver driver;
	
  @BeforeMethod
  public void openBrowser() {
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/jobs/");
  }
  
  @Test
  public void getHeading() {
	  String heading = driver.findElement(By.className("entry-title")).getText();
//	  System.out.println(heading);
	  Assert.assertEquals(heading, "Welcome to Alchemy Jobs");
  }
  
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
}
