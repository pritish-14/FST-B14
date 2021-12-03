package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
        
        action.sendKeys("A").build().perform();
        System.out.println("Pressed key is " + pressedKey.getText());
        
        action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        System.out.println("Pressed key is " + pressedKey.getText());
        
        driver.close();

	}

}
