package project;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "TrainingMobile");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);
        
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
        
	}
	
	@Test
	public void activityList1() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
		driver.findElementById("tasks_fab").click();
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
		driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
		driver.findElementById("add_task_done").click();	
	}
	
	@Test
	public void activityList2() {
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
		driver.findElementById("tasks_fab").click();
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
		driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
		driver.findElementById("add_task_done").click();	
	}
	
	@Test
	public void activityList3() {
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
		driver.findElementById("tasks_fab").click();
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
		driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
		driver.findElementById("add_task_done").click();	
	}
	
	@Test
	public void confirmActivity() {
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("tabs")));
		
		MobileElement listTab = driver.findElementById("tabs");
		Assert.assertTrue(listTab.isDisplayed());
		
		Assert.assertTrue(driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"]").isDisplayed());
		Assert.assertTrue(driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"]").isDisplayed());
		Assert.assertTrue(driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]").isDisplayed());
	}
	
	@AfterClass
    public void afterClass() {
        driver.quit();
    }
}
