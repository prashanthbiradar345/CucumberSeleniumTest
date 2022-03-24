package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver webDriver= null;
	
	@SuppressWarnings("deprecation")
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step: Browser is open");
		
		String projectPath = System.getProperty("user.dir"); //this is used to get the current Project directory structure
		System.out.println("Current Project Path:"+ projectPath);
// Specify via full path else specify via relative path as above to rn your project in any system anywhere
//		System.setProperty("webdriver.chrome.driver","D:/Eclipse studies/Testing Project/CucumberSeleniumTest/src/test/resources/drivers/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");

		webDriver= new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@Given("user is on google search Page")
	public void user_is_on_google_search_Page() {
		System.out.println("user is on google search Page");
		
		webDriver.navigate().to("https://google.com");
		
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("user enters a text in search box");
		
		webDriver.findElement(By.name("q")).sendKeys("automation step by step");
	}

	@When("hits enter")
	public void hits_enter() {
		System.out.println("hits enter");
		
		webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to the search results")
	public void user_is_navigated_to_the_search_results() {
		System.out.println("user is navigated to the search results");
		
		webDriver.getPageSource().contains("Online Courses");
		
		webDriver.close();
		webDriver.quit();
	}

}
