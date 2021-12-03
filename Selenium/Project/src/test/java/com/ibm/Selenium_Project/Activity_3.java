package com.ibm.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_3 {
	WebDriver driver;
	
  @BeforeMethod
  public void openBrowser() {
	driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/jobs/");
  }
	
	
  @Test
  public void getUrl() {
	  WebElement image = driver.findElement(By.xpath("//img"));
	  System.out.println("The URL of the header image is : " + image.getAttribute("src"));
  }
  
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
}
