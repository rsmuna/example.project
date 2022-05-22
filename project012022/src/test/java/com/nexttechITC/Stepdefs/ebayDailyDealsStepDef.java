package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.ebayDailyDealsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ebayDailyDealsStepDef {

WebDriver driver;	
	
	@Given("^User have access to ebay page$")
	public void user_have_access_to_ebay_page() throws Throwable {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver(); 
		driver.get("https://www.ebay.com/");
	}

	@When("^user click on Daily Deals tab$")
	public void user_click_on_Daily_Deals_tab() throws Throwable {
		
		ebayDailyDealsPOM DD = new ebayDailyDealsPOM (driver);
		
		DD.DailyDeals().click();
		}
	  
	

	@Then("^User will directed to Daily Deals page$")
	public void user_will_directed_to_Daily_Deals_page() throws Throwable {
	   
	}



}
