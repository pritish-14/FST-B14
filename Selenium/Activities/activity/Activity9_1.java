package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        
        WebElement dropEle = driver.findElement(By.xpath("//select[@id='single-select']"));
        Select select = new Select(dropEle);
        
        select.selectByVisibleText("Option 2");
        Thread.sleep(1000);
        select.selectByIndex(3);
        Thread.sleep(1000);
        select.selectByValue("4");
        Thread.sleep(1000);
        WebElement allEle = select.getWrappedElement();
        System.out.println("All the options in the lists are : "+ allEle.getText());
        
        driver.close();

	}

}
