package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
        driver.findElement(By.xpath("//button[@id='simple']")).click();
        System.out.println("Alert text is : " + driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        
        driver.close();

	}

}
