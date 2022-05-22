package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.AmazonBestSellerPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonBestSeller {
	
	WebDriver driver;
	
	@Given("^user visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
		
		//to open browser
   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	//to open URL
	 driver.get("https://www.amazon.com/");
	}

	@When("^user clicks on Best seller$")
	public void user_clicks_on_Best_seller() throws Throwable {
	    
	}

	@Then("^user should be able to redirect to the Best Seller Page;$")
	public void user_should_be_able_to_redirect_to_the_Best_Seller_Page() throws Throwable {
		
		 
		 
	}


}
