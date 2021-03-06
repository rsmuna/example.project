package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.FbsigninPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBsigninStepDef {
	WebDriver driver;
	
	@Given("user visiting facebook url")
	public void user_visiting_facebook_url() {
	//System.out.println("welcome Given");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	}

	@When("user enter {string} and {string} and valid {string} and {string}")
	public void user_enter_and_and_valid_and(String Firstname, String Lastname, String email, String password) {
		//System.out.println("welcome  When");   
		FbsigninPOM FB = new FbsigninPOM(driver);
		FB.FirstName().sendKeys(Firstname);
		FB.LastName().sendKeys(Lastname);
		FB.email().sendKeys(email);
		FB.password().sendKeys(password);
	}

	@Then("user select dropdown Month and dropdown Day and dropdown Year")
	public void user_select_dropdown_month_and_dropdown_day_and_dropdown_year() {
		//System.out.println("welcome Then"); 
		FbsigninPOM sel = new FbsigninPOM(driver);
		
		
		Select dropdown =new Select (sel.click_month);
		dropdown.selectByIndex(5);
		
		Select dropdown1=new Select (sel.click_day);
		dropdown1.selectByValue("6");
		
		Select dropdown2 = new Select(sel.click_year);
		dropdown2.selectByVisibleText("1999");
		
		
		
	}

}
