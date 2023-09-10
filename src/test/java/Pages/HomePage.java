package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath = "//img[@alt='Website for automation practice']") private WebElement homePageLogo;
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[8]/div/div[1]/div[1]/a") private WebElement firstProductAddToCart;
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u") private WebElement cartBtn;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean isHomePageVisible() {
		return(homePageLogo.isDisplayed());
	}
	public void addFirstProductToCart(){
		firstProductAddToCart.click();
		cartBtn.click();
	}
	
}
