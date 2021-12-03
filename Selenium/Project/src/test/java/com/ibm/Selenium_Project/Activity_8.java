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

public class Activity_8 {
	WebDriver driver;
	WebDriverWait wait;
	
  @BeforeMethod
  public void openBrowser() {
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	  wait = new WebDriverWait(driver, 15);
  }
  @Test
  public void login() {
	  driver.findElement(By.id("user_login")).sendKeys("root");
	  driver.findElement(By.id("user_pass")).sendKeys(" pa$$w0rd");
	  driver.findElement(By.id("wp-submit")).click();
	  
	  wait.until(ExpectedConditions.titleIs("Dashboard ‹ Alchemy Jobs — WordPress"));
	  Assert.assertEquals(driver.getTitle(), "Dashboard ‹ Alchemy Jobs — WordPress");
  }
  
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
}
