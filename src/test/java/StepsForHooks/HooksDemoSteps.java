package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	WebDriver driver = null;
	
	@Before(order=1)
	public void browserSetup(){
		
		System.out.println("I am inside the browser setup");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Before(order=2)
	public void setup2() {
		System.out.println("I am inside the Steps 2--");
	}
	
	@After(order=1)
	public void teardown() {
		System.out.println("I am inside tiredown");
		driver.close();
		driver.quit();
	}
	@After(order=2)
	public void teardown2() {
		System.out.println("I am inside tiredown 2..");
	}
	@BeforeStep
	public void beforeSteps() {
		System.out.println("I am inside the before steps");
	}
	public void afterSteps() {
		System.out.println("I am inside the after steps");
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	}


}
