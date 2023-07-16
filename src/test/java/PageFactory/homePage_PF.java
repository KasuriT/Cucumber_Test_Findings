package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage_PF {
	
	@FindBy(id = "logout")
	WebElement btn_logout;
	
	WebDriver driver;
	public homePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void checkLogoutIsDDisplayed() {
		btn_logout.isDisplayed();
	
		

		
	}

	
		
	}


