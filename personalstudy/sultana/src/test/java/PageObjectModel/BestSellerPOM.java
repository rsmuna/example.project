package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellerPOM {
	WebDriver driver;
	public  BestSellerPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']");
	@FindBy(name="field-keywords")
	WebElement edit_searchbox;
	public WebElement Search() {
		return edit_searchbox;
		
	}
	
}
