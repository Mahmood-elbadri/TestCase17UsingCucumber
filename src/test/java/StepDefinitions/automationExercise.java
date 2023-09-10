package StepDefinitions;

import Pages.CartPage;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class automationExercise {
	WebDriver driver;
	HomePage home;
	CartPage cart;
	SoftAssert soft;

	 
	@SuppressWarnings("deprecation")
	@Given("Launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		home = new HomePage(driver);
		cart = new CartPage(driver);
		soft = new SoftAssert();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	 
	@Given("Navigate to url http automationexercise.com")
	public void navigate_to_url_http_automationexercise_com() {
		driver.navigate().to("https://automationexercise.com/");
	}

	 
	@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
		home.isHomePageVisible();
	}

	 
	@When("Add products to cart")
	public void add_products_to_cart(){
		home.addFirstProductToCart();
	}

	 
	@Then("Verify that cart page is displayed")
	public void verify_that_cart_page_is_displayed() {
		soft.assertTrue(cart.isTableVisible());
		soft.assertAll();
	}

	 
	@Then("Click X button corresponding to particular product")
	public void click_x_button_corresponding_to_particular_product() {
		cart.clickXBtn();
	}

	 
	@Then("Verify that product is removed from the cart")
	public void verify_that_product_is_removed_from_the_cart() {
		soft.assertEquals(0, cart.getNumberOfProducts());
		driver.quit();
	}

}
