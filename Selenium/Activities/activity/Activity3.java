package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement phNumber = driver.findElement(By.id("number"));
        
        firstName.sendKeys("Ankush");
        lastName.sendKeys("Shetty");
        email.sendKeys("abc@gmail.com");
        phNumber.sendKeys("9881236753");
        
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        
        Thread.sleep(3000);
        driver.close();
        

	}

}
