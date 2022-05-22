package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DellActionStepDef {
WebDriver driver;

	@Given("user visits Dell homepage")
	public void user_visits_dell_homepage() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//soft wait
		//driver.manage().timeouts().implicitlywait(20,TimeUnit.SECONDS);
		//how to maximize the browser
		driver.manage().window().maximize();
		//how to open url driver.get method
		driver.get("https://www.dell.com/en-us");
		//Thread.sleep(10000);
		
		
	}

	@When("user go to Solutions dropdown menu and able to see View All Solutions")
	public void user_go_to_solutions_dropdown_menu_and_able_to_see_view_all_solutions() {
	 
	}

	@Then("user redirects to solution portfolio")
	public void user_redirects_to_solution_portfolio() {
	   
	}
	
	
	
	
	
	
	
	
	
	
}
