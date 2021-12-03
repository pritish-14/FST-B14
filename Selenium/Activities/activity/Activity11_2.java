package activity;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
        WebElement confirm = driver.findElement(By.xpath("//button[@id='confirm']"));
        confirm.click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text is : " + alert.getText());
        alert.accept();
        
        confirm.click();
        System.out.println("Alert text is : " + alert.getText());
        alert.dismiss();
        
        driver.close();

	}

}
