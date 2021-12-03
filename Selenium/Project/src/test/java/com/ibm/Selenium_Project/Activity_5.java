package com.ibm.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_5 {
	WebDriver driver;
	WebDriverWait wait;
	
  @BeforeMethod
  public void openBrowser() {
	driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/jobs/");
	wait = new WebDriverWait(driver, 15);
  }
	
  @Test
  public void jobPage() {
	  driver.findElement(By.linkText("Jobs")).click();
	  wait.until(ExpectedConditions.titleIs("Jobs – Alchemy Jobs"));
	  String title = driver.getTitle();
//	  System.out.println(title);
	  Assert.assertEquals(title, "Jobs – Alchemy Jobs");
  }
  
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
}
