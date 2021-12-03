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

public class Activity5 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;
	
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
		driver.get("https://www.training-support.net/selenium");
        wait = new WebDriverWait(driver, 10);
		
        
	}
	
	@Test(priority = 1)
	public void loginTest() {
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
		MobileElement loginForm = driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollForward(10).scrollIntoView(textContains(\"Login Form\"))"));
		loginForm.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.webkit.WebView/android.view.View/android.view.View[2]")));
		driver.findElementByXPath("//android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("admin");
		driver.findElementByXPath("//android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("password");
		driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.webkit.WebView/android.view.View/android.view.View[@text='Welcome Back, admin']")));
		String confirmMessage = driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[@text='Welcome Back, admin']").getText();
		Assert.assertEquals(confirmMessage, "Welcome Back, admin");
	}
	
	@Test(priority = 2)
	public void loginTest1() {		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.webkit.WebView/android.view.View/android.view.View[2]")));
		driver.findElementByXPath("//android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("adminnn1");
		driver.findElementByXPath("//android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("pasqssword");
		driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.webkit.WebView/android.view.View/android.view.View[@text='Invalid Credentials']")));
		String confirmMessage = driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[@text='Invalid Credentials']").getText();
		Assert.assertEquals(confirmMessage, "Invalid Credentials");
	}
	
	@AfterClass
    public void afterClass() {
        driver.quit();
    }
}
