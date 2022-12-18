package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver=null;
	public LoginPage lp;
	
	@Given("user is launching crome browser")
	public void user_is_launching_crome_browser() {
	  System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	  driver=new ChromeDriver();
		lp=new LoginPage(driver);
	  
	}

	@When("user navigates URL {string}")
	public void user_navigates_url(String url) {
	  driver.get(url);
	}

	@When("Provide email {string}")
	public void provide_email(String string) {
	    lp.setEmail(string);
	}
	
}
