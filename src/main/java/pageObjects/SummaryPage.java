package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SummaryPage {
	

	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']/span")
	private WebElement proceedButton;

	
	public SummaryPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void proceedAction() {
		proceedButton.click();
	}

}
