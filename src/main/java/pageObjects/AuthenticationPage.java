package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class AuthenticationPage  {
	 
	
	@FindBy(how = How.CSS, using="#email")
	private WebElement email;

	@FindBy(how = How.CSS, using="#passwd")
	private WebElement password;
	
	@FindBy(how = How.CSS, using="#SubmitLogin")
	private WebElement submit;
	
	
	public AuthenticationPage(WebDriver driver){
	     PageFactory.initElements(driver, this);
	 }
	
		public void login(String user, String Pass) {
			email.sendKeys(user);
			password.sendKeys(Pass);
			submit.click();
			
			
		}
	}

