package StepForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	
	WebDriver webDriver;
	
	@Before
	public void BrowserSetup() {
		System.out.println("Browser started");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		webDriver= new ChromeDriver();
		webDriver.manage().timeouts().pageLoadTimeout(28, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		System.out.println("Closing the drivers");
		webDriver.close();
		webDriver.quit();
	}
	
	@BeforeStep
	public  void beforeSteps() {
		System.out.println("Before Steps");
	}
	
	@AfterStep
	public  void AfterSteps() {
		System.out.println("After Steps");
	}
	
	@Given("User  on a login page")
	public void user_on_a_login_page() {
		System.out.println("user is on login page");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enters username and password");
	}

	@When("clicks on a login button")
	public void clicks_on_a_login_button() {
		System.out.println("clicks on a login button");
	}

	@Then("user is navigated to the Home page")
	public void user_is_navigated_to_the_Home_page() {
		System.out.println("user is navigated to the Home page");
	}

}
