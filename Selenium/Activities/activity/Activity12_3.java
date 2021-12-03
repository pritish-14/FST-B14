package activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/popups");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
        Actions action = new Actions(driver);
        WebElement signIn = driver.findElement(By.xpath("//button[@class='ui huge inverted orange button']"));
        action.moveToElement(signIn).pause(Duration.ofSeconds(1)).build().perform();
        System.out.println(signIn.getAttribute("data-tooltip"));
        
        signIn.click();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        System.out.println(driver.findElement(By.id("action-confirmation")).getText());
        
        driver.close();

	}

}
