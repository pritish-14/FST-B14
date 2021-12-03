package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
       WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
       WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
       WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
       WebElement phNumber = driver.findElement(By.xpath("//input[@id='number']"));
       
       firstName.sendKeys("Ankush");
       lastName.sendKeys("Shetty");
       email.sendKeys("abc@gmail.com");
       phNumber.sendKeys("9887265347");
       
       driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");
       driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
       

	}

}
