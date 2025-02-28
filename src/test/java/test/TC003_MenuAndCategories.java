package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC003_MenuAndCategories extends ProjectSpecificationMethods{
	
	@BeforeTest
	public void setup() {
		sheetName="Login";
		
	}
	
	@Test(dataProvider = "readData")
	public void menuAndCategoriesTest(String username, String password, String testname) {
		
		HomePage hp = new HomePage(driver);
		hp.clickLogin()
		.loginEnterUsername(username)
		.loginEnterPassword(password)
		.clickLoginButton()
		.validateLogin()
		.isHomeMenuVisible()
		.isContactMenuVisible()
		.isAboutusMenuVisible()
		.isCartMenuVisible()
		.isLogoutMenuVisible()
		.isPhonesCategoryVisible()
		.isLaptopsCategoryVisible()
		.isMonitorsCategoryVisible()
		.isLogoVisible();
	}

}
