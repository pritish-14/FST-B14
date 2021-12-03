package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
        driver.get("https://training-support.net/selenium/drag-drop");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
        
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement dropZone1 = driver.findElement(By.id("droppable"));
        WebElement dropZone2 = driver.findElement(By.id("dropzone2"));
        
        action.dragAndDrop(ball, dropZone1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone1, "background-color"));
        System.out.println("ENTERED DROPZONE 1");
        
        action.dragAndDrop(ball, dropZone2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone1, "background-color"));
        System.out.println("ENTERED DROPZONE 2");

        driver.close();

	}

}
