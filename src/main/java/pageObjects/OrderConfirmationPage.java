package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class OrderConfirmationPage  {
	

	
	@FindBy(how = How.XPATH, using="//*[@id=\"center_column\"]/div/p/strong")
	private WebElement confirmOrderStatus;
	
	String expectedText = "Your order on My Store is complete.";
	
	public OrderConfirmationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void checkOrder() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals(expectedText, confirmOrderStatus.getText());
	}


}
