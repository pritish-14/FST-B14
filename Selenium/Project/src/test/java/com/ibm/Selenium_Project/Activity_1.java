package com.ibm.Selenium_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Activity_1 {
	WebDriver driver;
	
  @BeforeMethod
  public void openBrowser() {
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/jobs/");
  }
  @Test
  public void getTitle() {
	  String title = driver.getTitle();
//	  System.out.println(title);
	  Assert.assertEquals(title, "Alchemy Jobs – Job Board Application");
  }
  
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
}
