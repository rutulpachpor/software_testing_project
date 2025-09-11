package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//span[normalize-space()='My Account']") 
WebElement lnkMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;

@FindBy(linkText = "Login")   
WebElement linkLogin;

@FindBy(xpath="//a[@class='dropdown-toggle' and text()='Desktops']")
WebElement desktopBtn;

@FindBy(xpath="//a[normalize-space()='Show AllDesktops']")
WebElement showAllDesktopBtn;

@FindBy(xpath="//span[normalize-space()='Wish List (1)']")
WebElement totalWishList;

@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/a")
WebElement submit;

@FindBy(xpath="//*[@id=\"cart\"]/button")
WebElement items;

@FindBy(xpath="//strong[normalize-space()='View Cart']")
WebElement viewCart;

@FindBy(xpath="//a[@class='btn btn-primary']")
WebElement checkOut;

public void clickMyAccount()
{
	lnkMyaccount.click();
}

public void clickRegister()
{
	lnkRegister.click();
}

public void clickLogin()
{
	linkLogin.click();
}

public void clickDesktop()
{
	desktopBtn.click();
}

public void clickShowAllDesktop() 
{
	showAllDesktopBtn.click();
}

public void clickTotalWishList() {
	totalWishList.click();
}

public void clickContinue() {
	submit.click();
}

public void clickItems() {
	items.click();
}

public void clickViewCart() {
	viewCart.click();
}

public void clickCheckOut() {
	checkOut.click();
}


}
