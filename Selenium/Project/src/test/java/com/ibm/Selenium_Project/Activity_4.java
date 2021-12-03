package com.ibm.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_4 {
	WebDriver driver;
	
  @BeforeMethod
  public void openBrowser() {
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/jobs/");
  }
  @Test
  public void getSecondHeading() {
	  String secondHeading = driver.findElement(By.xpath("//h2")).getText();
	  Assert.assertEquals(secondHeading, "Quia quis non");
  }
  
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
}
