package com.ibm.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_6 {
	WebDriver driver;
	WebDriverWait wait;
	
  @BeforeMethod
  public void openBrowser() {
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/jobs/");
	  wait = new WebDriverWait(driver, 15);
  }
  @Test
  public void searchJob() throws InterruptedException {
	  driver.findElement(By.linkText("Jobs")).click();
	  wait.until(ExpectedConditions.titleIs("Jobs – Alchemy Jobs"));
	  
	  driver.findElement(By.id("search_keywords")).sendKeys("banking");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Search completed')]")));
	  driver.findElement(By.xpath("//ul[@class='job_listings']/li/a")).click();
	  
	  WebElement applyJobBtn = driver.findElement(By.xpath("//input[@class='application_button button']"));
	  wait.until(ExpectedConditions.visibilityOf(applyJobBtn));
	  applyJobBtn.click();
	  
	  System.out.println("Email address is : "+ driver.findElement(By.xpath("//div[@class='application_details']/p/a")).getText());
  }
  
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
}
