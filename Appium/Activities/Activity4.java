package activity;

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

public class Activity4 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "TrainingMobile");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset", true);
        
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
        
	}
	
	@Test
	public void createContact() {
		driver.findElementById("floating_action_button").click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@text='First name']")));
		driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Aaditya");
		driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("Varma");
		driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("999148292");
		driver.findElementById("editor_menu_save_button").click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));
		 
        // Assertion
        MobileElement mobileCard = driver.findElementById("toolbar_parent");
        Assert.assertTrue(mobileCard.isDisplayed());
        
        String contactName = driver.findElementById("large_title").getText();
        Assert.assertEquals(contactName, "Aaditya Varma");
	}
	
	@AfterClass
    public void afterClass() {
        driver.quit();
    }
}
