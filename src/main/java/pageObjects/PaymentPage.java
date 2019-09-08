package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PaymentPage {
	
	
	@FindBy(how = How.XPATH, using="//a[@title='Pay by bank wire']")
	private WebElement paymentOption;
	
	
	public PaymentPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void selectPayment() {
		paymentOption.click();
	}

}
