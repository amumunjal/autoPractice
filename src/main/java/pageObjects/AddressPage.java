package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	 
	
	 public AddressPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button/span") 
	 private WebElement btn_Continue;
	 
	 public void clickOnPlaceOrder() {
		 btn_Continue.click();
		 }
}

