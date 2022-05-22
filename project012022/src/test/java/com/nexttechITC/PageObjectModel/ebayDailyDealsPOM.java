package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ebayDailyDealsPOM {
	
	@FindBy(xpath="//a[@href='https://www.ebay.com/deals']")
			WebElement DailyDeals;
	
	public WebElement DailyDeals() {
		return DailyDeals;
	}
	public ebayDailyDealsPOM (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

}
