package project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "TrainingMobile");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);
        
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
        
	}
	
	@Test
	public void addNote() {
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button")));
		driver.findElementById("new_note_button").click();
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("editable_title")));
		driver.findElementById("editable_title").sendKeys("This is the title");
		driver.findElementById("edit_note_text").sendKeys("This is the note description");
		driver.findElementByAccessibilityId("Open navigation drawer").click();
		
		Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='This is the title']").isDisplayed());
		
	}
}
