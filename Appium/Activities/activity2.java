package activity;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class activity2 {
AppiumDriver<MobileElement> driver = null;
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "TrainingMobile");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        
	}
	
	@Test
	public void test() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.training-support.net/");
		String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
		System.out.println("Title on Homepage: " + pageTitle);
		
		driver.findElementByXPath("//android.view.View[@content-desc='About Us']").click();
		String newPageTitle = driver.findElementByXPath("android.view.View[@text='About Us']").getText();
		System.out.println("Title on AboutPage: " + newPageTitle);
		
		Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
	}
	
	@AfterClass
    public void tearDown() {
        driver.quit();
    }
}
