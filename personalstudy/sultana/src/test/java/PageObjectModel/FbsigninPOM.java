package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbsigninPOM {
	
	WebDriver driver;


	public FbsigninPOM(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement FB_firstName;

	public WebElement FirstName () {
		return  FB_firstName;
	}
	@FindBy(xpath="//input[@name='lastname']")
	WebElement FB_lastname;
	
	public WebElement LastName() {
		return FB_lastname;
		}
	@FindBy(xpath="//input[@name='reg_email__']")
WebElement FB_email;
	public WebElement email() {
		return FB_email;
}
     @FindBy(xpath="//input[@type='password']")
  WebElement FB_password;
	
      public WebElement password() {
	    return FB_password;
}
      @FindBy(xpath="//[@id='month']")
        public WebElement click_month;
        
      
@FindBy(id="day")
	public WebElement click_day;

    	  @FindBy(id="year")
    	  public WebElement click_year;


		
    	  
    	  
      }

	 
 





