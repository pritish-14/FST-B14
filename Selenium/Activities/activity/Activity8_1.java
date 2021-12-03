package activity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
        
        System.out.println("Number of rows in the table : " + rows.size());
        System.out.println("Number of columns in the table : " + columns.size());
        
        WebElement thirdRow = driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
        System.out.println("Third row cell values are : "+ thirdRow.getText());
        
        WebElement secRowSecCol = driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
        System.out.println("Second row second column cell value : "+secRowSecCol.getText());
        
        driver.close();

	}

}
