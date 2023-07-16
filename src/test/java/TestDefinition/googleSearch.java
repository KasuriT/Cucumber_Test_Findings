//package TestDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class googleSearch {
//	
//	WebDriver driver = null;
//
//	@Given("Browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Steps: Browser is open");
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
//	    
//	}
//
//	@And("User is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("User is on google search page");
//		driver.navigate().to("https://google.com");
//	    
//	}
//
//	@When("User enters text in search box")
//	public void user_enters_text_in_search_box() throws InterruptedException {
//		System.out.println("User enters text in search box");
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		Thread.sleep(2000);
//	   
//	}
//
//	@And("hit enter")
//	public void hit_enter() throws InterruptedException {
//		System.out.println("hit enter");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	    Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to the search result")
//	public void user_is_navigated_to_the_search_result() {
//		System.out.println("user is navigated to the search result");
//	   
//		driver.getPageSource().contains("Online Courses");
//		
//		driver.close();
//		driver.quit();
//	}
//
//}
