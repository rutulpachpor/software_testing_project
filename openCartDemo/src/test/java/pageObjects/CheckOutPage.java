package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends BasePage {
	
	
	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='button-payment-address']")
	WebElement continueBtn1;
	
	@FindBy(xpath="//input[@id='button-shipping-address']")
	WebElement continueBtn2;
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	WebElement continueBtn3;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement termsAndConditionsCheckBox;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	WebElement continueBtn4;
	
	@FindBy(xpath="//input[@id='button-confirm']")
	WebElement confirmOrder;
	
//	New Billing Address
	
	@FindBy(xpath="//input[@value='new']")
	WebElement useNewBillingRadioBtn;
	
	@FindBy(xpath="//input[@id='input-payment-firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-payment-lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-payment-company']")
	WebElement company;
	
	@FindBy(xpath="//input[@id='input-payment-address-1']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='input-payment-city']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='input-payment-postcode']")
	WebElement postcode;
	
	@FindBy(xpath="//select[@id='input-payment-country']")
	WebElement country;
	
	@FindBy(xpath="//select[@id='input-payment-zone']")
	WebElement state;

//	New Delivery Address
	@FindBy(xpath="//input[@name='shipping_address' and @value='new' ]")
	WebElement useNewAddressRadioBtn;
	
	@FindBy(xpath="//input[@id='input-shipping-firstname']")
	WebElement dfirstName;
	
	@FindBy(xpath="//input[@id='input-shipping-lastname']")
	WebElement dlastName;
	
	@FindBy(xpath="//input[@id='input-shipping-address-1']")
	WebElement daddress;
	
	@FindBy(xpath="//input[@id='input-shipping-city']")
	WebElement dcity;
	
	@FindBy(xpath="//select[@id='input-shipping-country']")
	WebElement dcountry;
	
	@FindBy(xpath="//select[@id='input-shipping-zone']")
	WebElement dstate;
	
	public void clickuseNewBillingRadioBtn() {
		useNewBillingRadioBtn.click();
	}
	
	public void setFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void enterCompany(String compname) {
		company.sendKeys(compname);
	}
	
	public void enterAddress(String addr) {
		address.sendKeys(addr);
	}
	
	public void enterCity(String cityname) {
		city.sendKeys(cityname);
	}
	
	public void enterPostCode(String strpostcode) {
		postcode.clear();
		postcode.sendKeys(strpostcode);
	}
	
	public void selectCountry() {
		Select select = new Select(country);
		select.selectByVisibleText("India");
	}
	
	public void selectState() {
		Select select = new Select(state);
		select.selectByVisibleText("Maharashtra");
	}
	
	public void clickcontinueBtn1() {
		continueBtn1.click();
	}
	
	public void clickuseNewAddressRadioBtn() {
		useNewAddressRadioBtn.click();
	}
	
	public void setDFirstName(String fname) {
		dfirstName.sendKeys(fname);
	}
	
	public void setDLastName(String lname) {
		dlastName.sendKeys(lname);
	}
	
	public void enterDAddress(String addr) {
		daddress.sendKeys(addr);
	}
	
	public void enterDCity(String cityname) {
		dcity.sendKeys(cityname);
	}
	
	public void selectDCountry() {
		Select select = new Select(dcountry);
		select.selectByVisibleText("India");
	}
	
	public void selectDState() {
		Select select = new Select(dstate);
		select.selectByVisibleText("Maharashtra");
	}
	
	public void clickcontinueBtn2() {
		continueBtn2.click();
	}
	
	public void clickcontinueBtn3() {
		continueBtn3.click();
	}
	
	public void selecttermsAndConditionsCheckBox() {
		termsAndConditionsCheckBox.click();
	}
	
	public void clickcontinueBtn4() {
		continueBtn4.click();
	}
	
	public void clickconfirmOrder() {
		confirmOrder.click();
	}
	

}
