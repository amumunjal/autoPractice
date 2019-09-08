package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class LandingPage  {
	
	 
 
	
	@FindBy(how = How.CSS, using="#homefeatured a.product-name[title='Faded Short Sleeve T-shirts']")
	private WebElement FadedTshirt;
	
	@FindBy(how = How.CSS, using="#homefeatured a.product-name[title='Blouse']")
	private WebElement blouseProduct;
	
	
	public LandingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
	
	public void clickfirstProduct() {
		FadedTshirt.click();
	}
	
	public void clickSecondProduct() {
		blouseProduct.click();
	}
		
	}


