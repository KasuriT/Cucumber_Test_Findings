//package TestDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import io.cucumber.java.en.*;
//
//public class loginDemoSteps {
//	
//	WebDriver driver = null;
//	
//	@Given("Open the new Browser")
//	public void open_the_new_browser() {
//		System.out.println("Inside Steps: Open the new Browser");
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is "+projectPath);
//		
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		driver= new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); 
//		
//		driver.manage().window().maximize();
//	}
//
//	@And("User is on Web login page")
//	public void user_is_on_web_login_page() {
//		System.out.println("Inside Steps: User is on Web login page");
//		driver.navigate().to("https://example.testproject.io/web/");
//	    
//	}
//
//	@When("^Enter (.*) and (.*)$")
//	public void enter_username_and_password(String username, String password) throws InterruptedException {
//		System.out.println("Inside Steps: Enter username and password");
//	    driver.findElement(By.id("name")).sendKeys(username);
//	    driver.findElement(By.id("password")).sendKeys(password);
//	    
//	    Thread.sleep(2000);
//	}
//
//	@And("Hit Enter button")
//	public void hit_enter_button() throws InterruptedException {
//		System.out.println("Inside Steps: Hit Enter button");
//	    driver.findElement(By.id("login")).click();
//	    
//	    Thread.sleep(2000);
//	}
//
//	@Then("User navigated to the home page")
//	public void user_navigated_to_the_home_page() {
//		System.out.println("Inside Steps: User navigated to the home page");
//	    driver.findElement(By.id("logout")).isDisplayed();
//	    
//	    driver.close();
//	    driver.quit();
//}
//
//
//
//}
