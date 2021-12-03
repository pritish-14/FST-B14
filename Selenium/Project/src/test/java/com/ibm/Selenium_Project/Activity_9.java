package com.ibm.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_9 {
	WebDriver driver;
	WebDriverWait wait;
	
  @BeforeClass
  public void openBrowser() {
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	  wait = new WebDriverWait(driver, 10	);
  }
  
  @Test
  public void login() {
	  driver.findElement(By.id("user_login")).sendKeys("root");
	  driver.findElement(By.id("user_pass")).sendKeys(" pa$$w0rd");
	  driver.findElement(By.id("wp-submit")).click();
	  
	  wait.until(ExpectedConditions.titleIs("Dashboard ‹ Alchemy Jobs — WordPress"));
	  Assert.assertEquals(driver.getTitle(), "Dashboard ‹ Alchemy Jobs — WordPress");
  }
  
  @Test
  public void postJob() {
	  driver.findElement(By.xpath("//div[text()='Job Listings']")).click();
	  driver.findElement(By.className("page-title-action")).click();
	  
	  wait.until(ExpectedConditions.titleIs("Add Job ‹ Alchemy Jobs — WordPress"));
	  
	  driver.findElement(By.id("post-title-0")).sendKeys("qwert_job");
	  driver.findElement(By.id("_application")).sendKeys("qwerty@hotmail.com");
	  driver.findElement(By.id("_company_website")).sendKeys("https://alchemy.hguy.co/");
	  driver.findElement(By.id("_job_expires")).sendKeys("March 24, 2022");
	  driver.findElement(By.id("_job_location")).sendKeys("India");
	  driver.findElement(By.id("_company_name")).sendKeys("alchemy");
	  driver.findElement(By.id("_company_tagline")).sendKeys("company tag line");
	  
	  driver.findElement(By.xpath("//button[text()='Publish…']")).click();
	  driver.findElement(By.xpath("//button[text()='Publish']")).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='components-button is-secondary']")));
	  driver.findElement(By.xpath("//a[@class='components-button is-secondary']")).click();
	  
	  wait.until(ExpectedConditions.titleContains("– Alchemy Jobs"));
	  
	 boolean jobPosted = driver.findElement(By.xpath("//input[@class='application_button button']")).isDisplayed();
	 if(jobPosted = true)
		 System.out.println("The job is posted successfully");
	  
  }
  
  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }
}
