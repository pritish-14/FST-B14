package activity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        
        WebElement dropEle = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select select = new Select(dropEle);
        
        if(select.isMultiple()) {
        	
        	select.selectByVisibleText("Javascript");
            select.selectByValue("node");
            for(int i=4;i<7;i++) {
            	select.selectByIndex(i);
            }
            
            select.deselectByValue("node");
            
            select.deselectByIndex(7);
            
            System.out.println("First selected option is : "+ select.getFirstSelectedOption().getText());

            List<WebElement> selectedOptions = select.getAllSelectedOptions();

            for(WebElement selectedOption : selectedOptions) {
                System.out.println("Selected option: " + selectedOption.getText());
            }
            
            select.deselectAll();
            
        }
        
        driver.close();
	}

}
