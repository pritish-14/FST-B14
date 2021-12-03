package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.get("https://training-support.net/selenium/ajax");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
        WebElement changeContent = driver.findElement(By.xpath("//button[@class='ui violet button']"));
        changeContent.click();
        
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
        
       String ajaxText = driver.findElement(By.id("ajax-content")).getText();
       System.out.println("The content is : " + ajaxText);
       
       wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
       String changedText = driver.findElement(By.id("ajax-content")).getText();
       System.out.println("The content changed is : " + changedText);
       
       driver.close();

	}

}
