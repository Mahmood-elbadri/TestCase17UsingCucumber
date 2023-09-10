package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {
	WebDriver driver;
	@FindBy(id = "cart_info_table")private WebElement table;
	@FindBy(xpath = "//i[@class='fa fa-times']")private WebElement xBtn;
	@FindBy(xpath = "//img[@alt='Product Image']")private List<WebElement> numberOfProducts;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isTableVisible() {
		return(table.isDisplayed());
	}
	public void clickXBtn() {
		xBtn.click();
	}
	public int getNumberOfProducts() {
		return numberOfProducts.size();
	}
	

}
