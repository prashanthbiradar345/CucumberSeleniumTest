package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPage_PF;
import pageFactory.LogoutPagePF;

public class LoginDemo_PF {
	
	WebDriver webDriver= null;
	LoginPage_PF login;
	LogoutPagePF logout;
	
	
	@Given("Browser is opened")
	public void browser_is_opened() {
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

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step2: user is on login page");
		webDriver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("user enters username and password");
		login= new LoginPage_PF(webDriver);
		
		login.enter_username(username);
		login.enter_password(password);
		
		Thread.sleep(2000);
	}

	@Then("user clicks on login")
	public void user_clicks_on_login() {
		
		login.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

		logout= new LogoutPagePF(webDriver);
		logout.clicklogout();
	}

}

