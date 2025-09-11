package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CheckOutPage;
import pageObjects.DesktopsPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC003_OrderProductTest extends BaseClass{
	
	@Test(groups= {"Master"})
	public void orderProductTest() throws IOException, InterruptedException {
		
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		CheckOutPage cpg = new CheckOutPage(driver);
		DesktopsPage dpg = new DesktopsPage(driver);
				
		hp.clickMyAccount();
		hp.clickLogin();

		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("pwd"));
		lp.clickLogin();
		
		hp.clickDesktop();
		hp.clickShowAllDesktop();
		Thread.sleep(5000);
		
		dpg.clickHPlaptop();
		dpg.clickAddtoCart();
		driver.navigate().back();
		dpg.clickIPhone();
		dpg.clickIphoneWishlistBtn();
		logger.info("Product added");
		
//		hp.clickTotalWishList();
//		hp.clickContinue();
		
		hp.clickItems();
		hp.clickViewCart();
		logger.info("Go to Cart");
		String title = driver.getTitle();
		if(title.equals("Shopping Cart")) {
			Assert.assertTrue(true);
			logger.info("Title Shopping Cart displayed");
		}
		else {
			captureScreen("TC003_OrderProductTest");
			Assert.assertTrue(false);
			logger.info("Title Shopping Cart is not displayed");
		}
		
		hp.clickCheckOut();
		
		if(driver.getTitle().equals("Checkout")) {
			Assert.assertTrue(true);
			logger.info("Successfully landed on Checkout page");
		}
		else {
			captureScreen("TC003_OrderProductTest");
			Assert.assertTrue(false);
			logger.info("Failed to land on Checkout page");
		}
		
		Thread.sleep(3000);
		cpg.clickuseNewBillingRadioBtn();
		
		logger.info("Filling Billing address details");
		
		cpg.setFirstName("Rutul");
		cpg.setLastName("P");
		cpg.enterCompany("Google");
		cpg.enterAddress("Maharashtra");
		cpg.enterCity("Nagpur");
		cpg.enterPostCode("440023");
		cpg.selectCountry();
		cpg.selectState();
		cpg.clickcontinueBtn1();
		Thread.sleep(3000);
		
		cpg.clickuseNewAddressRadioBtn();
		logger.info("Filling Delivery address details");
		
		cpg.setDFirstName("Rutul");
		cpg.setDLastName("Pachpor");
		cpg.enterDAddress("Maharashtra");
		cpg.enterDCity("Nagpur");
		cpg.selectDCountry();
		cpg.selectDState();
		cpg.clickcontinueBtn2();
		
		cpg.clickcontinueBtn3();
		cpg.selecttermsAndConditionsCheckBox();
		cpg.clickcontinueBtn4();
		cpg.clickconfirmOrder();
		
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("Your order has been placed!")) {
			
			Assert.assertTrue(true);
			logger.info("Product Ordered  test passed");
		}
		else {
			captureScreen("TC003_OrderProductTest");
			Assert.assertTrue(false);
			logger.info("Product not Ordered  test failed");
		}
		
		
	}

}
