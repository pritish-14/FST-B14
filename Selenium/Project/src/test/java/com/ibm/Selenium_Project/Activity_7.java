package com.ibm.Selenium_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_7 {
	WebDriver driver;
	WebDriverWait wait;
	
  @BeforeClass
  public void openBrowser() {
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/jobs/");
	  wait = new WebDriverWait(driver, 25);
  }
  
  @Test
  public void postJob() {
	  driver.findElement(By.linkText("Post a Job")).click();
	  wait.until(ExpectedConditions.titleIs("Post a Job – Alchemy Jobs"));
	  
	  driver.findElement(By.id("create_account_email")).sendKeys("qwe122@hotmail.com");
	  driver.findElement(By.id("job_title")).sendKeys("Test_ab");
	  driver.findElement(By.id("job_location")).sendKeys("India");
	  driver.findElement(By.id("application")).sendKeys("https://alchemy.hguy.co/");
	  driver.findElement(By.id("company_name")).sendKeys("alchemy");
	  driver.findElement(By.id("company_website")).sendKeys("https://alchemy.hguy.co/");
	  driver.findElement(By.id("company_tagline")).sendKeys("Company tag line");
	  driver.switchTo().frame(driver.findElement(By.id("job_description_ifr")));
	  driver.findElement(By.id("tinymce")).sendKeys("sbdvwdvdytevdvscytq edyw");
	  driver.switchTo().defaultContent();
	  
	  driver.findElement(By.name("submit_job")).click();
	  
	  WebElement submitJobBtn = driver.findElement(By.id("job_preview_submit_button"));
	  wait.until(ExpectedConditions.visibilityOf(submitJobBtn));
	  submitJobBtn.click();  
  }
  
  @Test(dependsOnMethods = "postJob")
  public void searchJob() throws InterruptedException {
	  driver.findElement(By.linkText("Jobs")).click();
	  wait.until(ExpectedConditions.titleIs("Jobs – Alchemy Jobs"));
	  
	  driver.findElement(By.id("search_keywords")).sendKeys("Test_abd");
	  driver.findElement(By.xpath("//div[@class='search_submit']")).click();
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Search completed')]")));
	  List<WebElement> jobList = driver.findElements(By.xpath("//ul[@class='job_listings']/li/a/div/h3"));
	  for (WebElement job : jobList) {
		  String jobText = job.getText();
		  if(jobText.equals("Test_ab")) {
			  System.out.println("The job "+ jobText +" is found in the job list");
			  break;
		  }
	 }
	  
  }
  
  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }
}
