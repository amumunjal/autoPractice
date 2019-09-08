package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ProductPage {
	
	
	
	@FindBy(how = How.XPATH, using="//*[@id=\"add_to_cart\"]/button/span")
	
	private WebElement addCartButton;
	
	@FindBy(how = How.XPATH, using="//div[@class='button-container']/span/span")
	private WebElement continueButton;
	
	@FindBy(how = How.XPATH, using="//a[@title='Proceed to checkout']/span")
	private WebElement continueCheckout;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"header_logo\"]/a/img)")
	private WebElement logo;
	
	public ProductPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void addProduct() {
		addCartButton.click();
	}
        
	
	public void clickProceed() throws InterruptedException {
		continueButton.click();
		Thread.sleep(5000);
	}
	
	public void continueCheckout()  {
		continueCheckout.click();

	}
}

