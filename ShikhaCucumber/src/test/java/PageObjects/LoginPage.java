package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver =rdriver;
		PageFactory.initElements(rdriver,this);}
	
	@FindBy(id="identifierId")
	WebElement email;

	
	public void setEmail(String email1)
	{
	email.sendKeys(email1);
	}

	
	
}
