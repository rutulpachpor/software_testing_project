package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesktopsPage extends BasePage {
	
	public DesktopsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@onclick=\"cart.add('47', '1');\"]")
	WebElement hplaptop;

	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addtoCart;
	
	@FindBy(xpath="//a[normalize-space()='iPhone']")
	WebElement elementiphone;
	
	@FindBy(xpath="//button[@class='btn btn-default']//i[@class='fa fa-heart']")
	WebElement iphoneWishlistBtn;
	
	
	public void clickHPlaptop() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(hplaptop));
	    hplaptop.click();
	}
	
	public void clickAddtoCart() {
		addtoCart.click();
	}
	
	public void clickIPhone() {
		elementiphone.click();
	}

	public void clickIphoneWishlistBtn() {
		iphoneWishlistBtn.click();
	}

}
