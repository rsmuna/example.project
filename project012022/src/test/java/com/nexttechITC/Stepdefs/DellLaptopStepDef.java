package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.DellLaptopPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellLaptopStepDef {
	
	WebDriver driver;
	
	
	@Given("^user Visits Dell HomePage$")
	public void user_Visits_Dell_HomePage() throws Throwable {
	   //how to open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
   
    //soft wait
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    //how to maximize the browser
    driver.manage().window().maximize();
    
    //how to open url driver.get method
    driver.get("https://www.dell.com/en-us");
    	
    // Thread.sleep(10000);
    
    
	
	}

	@When("^user go to Products dropdown menu and able to see Laptops$")
	public void user_go_to_Products_dropdown_menu_and_able_to_see_Laptops() throws Throwable {
	    
		//write code here that turns the phrase above into concreate actions
		
		Actions act = new Actions (driver);
		DellLaptopPOM obj = new DellLaptopPOM(driver);
		act.moveToElement(obj.Products()).build().perform();
	}

	@When("^user go to Laptops and able to see For Home$")
	public void user_go_to_Laptops_and_able_to_see_For_Home() throws Throwable {
		//write code here that turns the phrase above into concreate actions
		
		Actions act = new Actions(driver);
		DellLaptopPOM obj = new  DellLaptopPOM (driver);
	    act.moveToElement(obj.Laptops()).build().perform();
	    obj.Laptops().click();
	    WebDriverWait Wait = new WebDriverWait(driver,30);
		
	}

	@Then("^user will click to For Home option$")
	public void user_will_click_to_For_Home_option() throws Throwable {
	    
	}


}
