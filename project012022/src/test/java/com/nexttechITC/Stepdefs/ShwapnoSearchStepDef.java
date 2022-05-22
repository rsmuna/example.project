package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.ShwapnoSearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ShwapnoSearchStepDef {
	WebDriver driver;
	
	
	@Given("^user visit shwapno home page$")
	public void user_visit_shwapno_home_page() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");  
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.shwapno.com/;");
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	
	
	
	}

	@Given("^user will able to search by \"([^\"]*)\"$")
	public void user_will_able_to_search_by(String arg1) throws Throwable {
	 
		ShwapnoSearchPOM sps = new ShwapnoSearchPOM (driver);
		sps.Search().sendKeys(arg1);
		
	}

	@Then("^user clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
		ShwapnoSearchPOM sps = new ShwapnoSearchPOM (driver);
		sps.Search().click();
	}


}
