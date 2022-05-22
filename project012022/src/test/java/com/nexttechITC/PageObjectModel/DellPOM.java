package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellPOM {

	WebDriver driver;
	
	public DellPOM(WebDriver driver) {
	     this.driver=driver;
	    
	     PageFactory.initElements(driver, this);
	    }
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")
	
	  WebElement act_Solutions;
	  public WebElement Solutions() { 
	   return act_Solutions;
	   }
	 
	  //@FindBy(xpath="/html/body/main/header/div[3]/nav/ul/li[2]/ul/li[1]/a")
	    //@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/a")
	  //@FindBy(xpath="//a[text()='View All Solutions']")
	  @FindBy(xpath="//span[text()='Solutions']")
	 
	  WebElement click_AllSolutions;
	    public WebElement AllSolutions() { 
	    return click_AllSolutions;
	    }
		public WebElement hover_solution_button() {
			// TODO Auto-generated method stub
			return hover_solution_button();
		}
		public WebElement click_all_solutions() {
			// TODO Auto-generated method stub
			return click_all_solutions();
		}
	    
	    

}

	
	
	
	
	
	
	
	
	
	



