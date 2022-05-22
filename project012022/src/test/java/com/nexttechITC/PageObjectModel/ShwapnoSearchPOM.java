package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShwapnoSearchPOM {

	WebDriver driver;
	public ShwapnoSearchPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
WebElement edit_serachbox;
public WebElement Search() {
	return edit_serachbox;
}
	@FindBy(xpath="//input[@class='mj_btnbg responsivesearch FormSectionDefaultButton']")
	 WebElement click_searchbutton;
	   public WebElement searchbutton(WebElement click_searchbutton){
	   return click_searchbutton;
	   
	
	
}
}
