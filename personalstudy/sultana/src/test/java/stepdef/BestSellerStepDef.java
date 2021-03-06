package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.BestSellerPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BestSellerStepDef {
	
	WebDriver driver;
	
	
	@Given("Users have to access to Amajon page")
	public void users_have_to_access_to_amajon_page() {
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://www.amazon.com/");
	}

	@When("user will  clicks on Best Seller tab")
	public void user_will_clicks_on_best_seller_tab() {
		 BestSellerPOM objBS = new  BestSellerPOM (driver);
		 objBS.Search().click();
	}

	@Then("User will be directed to Best Seller page")
	public void user_will_be_directed_to_best_seller_page() {
	    
	}

}
