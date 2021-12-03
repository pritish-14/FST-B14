package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearchSteps {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on the google home page$")
	public void givenFunction() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 15);
		driver.get("https://www.google.com");
		
	}
	
	@When("^User types in cheese and hits enter$")
	public void whenFunction(){
		driver.findElement(By.name("q")).sendKeys("cheese",Keys.RETURN);
		
	}
	
	@Then("Show how many search results displays")
	public void thenFunction() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
		String resultStats = driver.findElement(By.id("result-stats")).getText();
		System.out.println("Number of results "+resultStats);
		
	}
	
	@And("Close the browser")
	public void andFunction() {
		driver.close();
	}

}
