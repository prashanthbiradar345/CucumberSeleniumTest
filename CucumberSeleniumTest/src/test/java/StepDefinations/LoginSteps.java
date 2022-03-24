package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User  on a login page")
	public void user_on_a_login_page() {
		System.out.println("User  on a login page");
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
