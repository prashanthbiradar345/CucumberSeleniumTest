package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver webDriver;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.webDriver=driver;
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id="name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login")
	WebElement btn_login;
	
	public void enter_username(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enter_password(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	
}
