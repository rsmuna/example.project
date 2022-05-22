package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.amazonoptionpom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class amazonoptionfeature {
	
WebDriver driver;

@Given("^user visits amazon home page$")
public void user_visits_amazon_home_page() throws Throwable {
	//how to open the browser
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
//IMPLICIT WAIT SYN
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  //how to max the window to get all our web elements visible
	  //driver.manage().window().maximize();
	  driver.get("http://www.amajon.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);

	  
	  //hoe to open the URL
	  driver.get("https://www.amazon.com/");

}


@Given("^user will be search by \"([^\"]*)\"$")
public void user_will_be_search_by(String arg1) throws Throwable {
	amazonoptionpom AS = new amazonoptionpom (driver);
	AS.Search().sendKeys(arg1);
	WebDriverWait wait=new WebDriverWait(driver, 20);
	//Thread.sleep(5000);
	
	
}

@Then("^user will click on search button$")
public void user_will_click_on_search_button() throws Throwable {
	amazonoptionpom AS = new amazonoptionpom (driver);
	AS.searchbutton().click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	//Theard.sleep(10000);
	//driver.quit();
	
	
}


}
