package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public class OrderSummary{
	


	@FindBy(how = How.XPATH, using="//*[@id=\"cart_navigation\"]/button/span")
	private WebElement confirmOrder;
	
	
	
	public OrderSummary(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void completeOrder() {
		confirmOrder.click();
	}

}
