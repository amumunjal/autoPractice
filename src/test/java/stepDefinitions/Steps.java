package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddressPage;
import pageObjects.AuthenticationPage;
import pageObjects.LandingPage;
import pageObjects.OrderConfirmationPage;
import pageObjects.OrderSummary;
import pageObjects.PaymentPage;
import pageObjects.ProductPage;
import pageObjects.ShippingPage;
import pageObjects.SummaryPage;

public class Steps {
	WebDriver driver;
	
	
	
	 
	
	@Given("^user is on the shopping portal$")
	public void user_is_on_the_shopping_portal() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//java//resources//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://www.automationpractice.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
	}

	@When("^user selects the product$")
	public void user_selects_the_product()  {
		LandingPage l = new LandingPage(driver);
		l.clickfirstProduct();
	    
	}

	@When("^user add the product to cart$")
	public void user_add_the_product_to_cart() throws Throwable {
		ProductPage P = new ProductPage(driver);
		P.addProduct();
		
	}

	@When("^user clicks the proceed checkout button$")
	public void user_clicks_the_proceed_checkout_button() throws Throwable {
		ProductPage P = new ProductPage(driver);
		P.clickProceed();
		driver.navigate().back();
		Thread.sleep(3000);
		
	}


	@Then("^user selects the new product$")
	public void user_selects_the_new_product() throws Throwable {
		LandingPage l = new LandingPage(driver);
		l.clickSecondProduct();
	    
	}

	@Then("^user adds other product to cart$")
	public void user_adds_other_product_to_cart() throws Throwable {
		ProductPage P = new ProductPage(driver);
		P.addProduct();
	    
	}

	@Then("^user proceeds with checkout action$")
	public void user_proceeds_with_checkout_action() throws Throwable {
		ProductPage P = new ProductPage(driver);
		P.continueCheckout();
	   
	}

	@Then("^user proceeds from summary page$")
	public void user_proceeds_from_summary_page() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		
		 SummaryPage S = new SummaryPage(driver);
		 S.proceedAction();
	   
	}
	@Then("^User logs into the application with valid credentials$")
	public void user_logs_into_the_application_with_valid_credentials() throws Throwable {
		AuthenticationPage A = new AuthenticationPage(driver);
		A.login("bn@bn.com", "test123");
	    
	}

	@Then("^user performs checkout operation from address page$")
	public void user_performs_checkout_operation_from_address_page() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 AddressPage AD = new AddressPage(driver);
		 AD.clickOnPlaceOrder();
	  
	}

	@Then("^user accepts the terms AND performs checkout from shipping page$")
	public void user_accepts_the_terms_AND_performs_checkout_from_shipping_page() throws Throwable {
       ShippingPage SP =  new ShippingPage(driver); 
       SP.proceedFromShippingPage();
	}

	@Then("^user selects the payment method$")
	public void user_selects_the_payment_method() throws Throwable {
		PaymentPage payment = new PaymentPage(driver);
		payment.selectPayment();
	
	}

	@Then("^user confirms the order from payment page$")
	public void user_confirms_the_order_from_payment_page() throws Throwable {
		OrderSummary OS = new OrderSummary(driver);
		OS.completeOrder();

	}

	@Then("^validate the order confirmation\\.$")
	public void validate_the_order_confirmation() throws Throwable {
    OrderConfirmationPage OP = new OrderConfirmationPage(driver); 
    OP.checkOrder();

	}


}
