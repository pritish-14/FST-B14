package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
        WebElement idLink = driver.findElement(By.id("about-link"));
        System.out.println("Text in element is : " + idLink.getText());
        
        WebElement classLink = driver.findElement(By.className("ui inverted huge green button"));
        System.out.println("Text in element is : " + classLink.getText());
        
        WebElement linkText = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element is : " + linkText.getText());
        
        WebElement cssSelector = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element is : " + cssSelector.getText());
        
        
        driver.close();

	}

}
