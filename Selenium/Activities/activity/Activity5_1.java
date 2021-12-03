package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
        WebElement checkboxinput = driver.findElement(By.xpath("//input[@class='willDisappear']"));
        System.out.println("Is checkbox input displayed : " + checkboxinput.isDisplayed());
        
        driver.findElement(By.id("toggleCheckbox")).click();
        
        System.out.println("Is checkbox input displayed : " + checkboxinput.isDisplayed());
        
        driver.close();

	}

}
