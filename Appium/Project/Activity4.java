package project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
		driver.get("https://www.training-support.net/selenium");
        
	}
	
	@Test
	public void toDo() throws InterruptedException {
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
		MobileElement todo = driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(8).scrollIntoView(textContains(\"To-Do List\"))"));
		todo.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.webkit.WebView/android.view.View/android.view.View[2]")));
		driver.findElementByXPath("//android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Adding new Task");
		driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
		wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.xpath("//android.view.View[4]/android.view.View[2]/android.view.View[2]"), 1));
		List<MobileElement> taskAdded = driver.findElementsByXPath("//android.view.View[4]/android.view.View[2]/android.view.View[2]");
		System.out.println("Total task : " + taskAdded.size());
		Thread.sleep(1000);
		driver.findElementByXPath("//android.view.View/android.view.View[4]/android.view.View[3]").click();
		
	}
}
