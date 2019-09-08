package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ShippingPage{
	
    

	@FindBy(how = How.XPATH, using="//input[@name='cgv']")
	private WebElement selectTerms;
	
	@FindBy(how = How.XPATH, using="//button[@name='processCarrier']")
	private WebElement checkoutBtn;
	
	
	public ShippingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void proceedFromShippingPage() {
		selectTerms.click();
		checkoutBtn.click();
	}
}
