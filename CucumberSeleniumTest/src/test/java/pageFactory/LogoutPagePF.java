package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPagePF {
	
	WebDriver webDriver;
	
	public LogoutPagePF(WebDriver driver)
	{
		this.webDriver=driver;
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id="logout")
	WebElement btn_logout;
	
	public void clicklogout() {
		// TODO Auto-generated method stub
		btn_logout.isDisplayed();
		webDriver.close();
		webDriver.quit();
	}
}
