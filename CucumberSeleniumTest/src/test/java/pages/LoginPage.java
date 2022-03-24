package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver webDriver;
	
	By login_page_Txt_username= By.id("name");
	
	By login_page_txt_password= By.id("password");
	
	By login_page_Btn_login= By.id("login");
	
	By login_page_Btn_logout= By.id("logout");
			
	
	public LoginPage(WebDriver webDriver){
		this.webDriver= webDriver;
	}
	
	public void enteruser_name(String username1)
	{
		webDriver.findElement(login_page_Txt_username).sendKeys(username1);
	}
	
	public void enter_password(String password1)
	{
		webDriver.findElement(login_page_txt_password).sendKeys(password1);
	}

	public void click_login()
	{
		webDriver.findElement(login_page_Btn_login).click();
	}
	
	public void check_logout_is_displayed() {
		webDriver.findElement(login_page_Btn_logout).isDisplayed();
		webDriver.close();
		webDriver.quit();
	}
	
	public void loginValidUsers(String username, String password)
	{
		webDriver.findElement(login_page_Txt_username).sendKeys(username);
		webDriver.findElement(login_page_txt_password).sendKeys(password);
		webDriver.findElement(login_page_Btn_login).click();
	}
}
