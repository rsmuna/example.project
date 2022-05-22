package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonBestSellerPom {

	WebDriver driver;
	
	public AmazonBestSellerPom(WebDriver driver) {
		
		this.driver = driver;
	
		PageFactory.initElements(driver, this);
		
	}
	
}
