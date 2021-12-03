package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/iframes");
        
        System.out.println("Title of the page is "+ driver.getTitle());
        
        driver.switchTo().frame(0);
        WebElement frameHeading1 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frameHeading1.getText());
        
        WebElement frame1Btn = driver.findElement(By.id("actionButton"));
        System.out.println("Color of the button is : "+ frame1Btn.getCssValue("color"));
        System.out.println("Text of the button is : "+ frame1Btn.getText());
        
        frame1Btn.click();
        System.out.println("Color of the button is : "+ frame1Btn.getCssValue("color"));
        System.out.println("Text of the button is : "+ frame1Btn.getText());
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        
        WebElement frameHeading2 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frameHeading2.getText());
        
        WebElement frame2Btn = driver.findElement(By.cssSelector("button"));
        System.out.println("Color of the button2 is : "+ frame2Btn.getCssValue("color"));
        System.out.println("Text of the button2 is : "+ frame2Btn.getText());
     
        frame2Btn.click();
        
        System.out.println("Color of the button2 is : "+ frame2Btn.getCssValue("color"));
        System.out.println("Text of the button2 is : "+ frame2Btn.getText());

	}

}
