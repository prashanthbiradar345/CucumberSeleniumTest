package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginDemo_POM {
	
//	WebDriver webDriver= null;
//	LoginPage loginPage=null;
//	
//	@Given("Browser is opened state")
//	public void browser_is_opened() {
//		System.out.println("Inside Step: Browser is open");
//		
//		String projectPath = System.getProperty("user.dir"); //this is used to get the current Project directory structure
//		System.out.println("Current Project Path:"+ projectPath);
//// Specify via full path else specify via relative path as above to rn your project in any system anywhere
////		System.setProperty("webdriver.chrome.driver","D:/Eclipse studies/Testing Project/CucumberSeleniumTest/src/test/resources/drivers/chromedriver.exe");
//		
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//
//		webDriver= new ChromeDriver();
//		webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@Given("user is on login page Pom")
//	public void user_is_on_login_page() {
//		System.out.println("Inside Step2: user is on login page");
//		webDriver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enter the (.*) and (.*)$")
//	public void user_enters_username_and_password(String username1, String password1) throws InterruptedException {
//		System.out.println("user enters username and password");
//		
//		loginPage= new LoginPage(webDriver);
//		loginPage.enteruser_name(username1);
//		loginPage.enter_password(password1);
//		Thread.sleep(2000);
//	}
//
//	@Then("user clicks on login button")
//	public void user_clicks_on_login() {
//		
//		loginPage.click_login();
////		webDriver.findElement(By.id("login")).click();
//	}
//
//	@Then("user is navigated to  home page")
//	public void user_is_navigated_to_the_home_page() {
//
////		webDriver.findElement(By.id("logout")).isDisplayed();
//		loginPage.check_logout_is_displayed();
//	}

}
