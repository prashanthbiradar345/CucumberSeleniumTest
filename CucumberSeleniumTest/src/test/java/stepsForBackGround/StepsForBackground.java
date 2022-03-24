package stepsForBackGround;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsForBackground {
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  System.out.println("user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");
	}

	@Then("user is navigated to the HomePage")
	public void user_is_navigated_to_the_HomePage() {
		System.out.println("user is navigated to the HomePage");
	}

	@When("user clicks on welcome link")
	public void user_clicks_on_welcome_link() {
		System.out.println("user clicks on welcome link");
	}

	@Then("Logout link is displayed")
	public void logout_link_is_displayed() {
		System.out.println("Logout link is displayed");
	}

	@When("user clicks on dashboard link")
	public void user_clicks_on_dashboard_link() {
		System.out.println("user clicks on dashboard linK");
	}

	@Then("quickbar toolbar is displayed")
	public void quickbar_toolbar_is_displayed() {
		System.out.println("quickbar toolbar is displayed");
	}
}
