package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC006_PurchaseAndLogout extends ProjectSpecificationMethods {
	
	
	@BeforeTest
	public void setup() {
		sheetName="Login";
		
	}
	
	@Test(dataProvider = "readData")
	public void purchaseAndLogout(String username, String password, String testname) {
		
		HomePage hp = new HomePage(driver);
		hp.clickLogin()
		.loginEnterUsername(username)
		.loginEnterPassword(password)
		.clickLoginButton()
		.validateLogin()
		.selectProduct1()
		.getProductTitle()
		.getProductPrice1()
		.addToCart()
		.clickCartMenu()
		.isCartEmpty()
		.clickPlaceOrderButton()
		.enterName()
		.enterCountry()
		.enterCity()
		.enterCard()
		.enterMonth()
		.enterYear()
		.clickPurchaseButton()
		.clickConfirmationOkButton();
		
	}

}
