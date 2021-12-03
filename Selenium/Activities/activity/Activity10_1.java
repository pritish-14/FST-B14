package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));
        cube.click();
        WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Left click "+ cubeVal.getText());

        action.doubleClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Double click "+cubeVal.getText());
        
        action.contextClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Right click "+cubeVal.getText());
        
        driver.close();
        

	}

}
