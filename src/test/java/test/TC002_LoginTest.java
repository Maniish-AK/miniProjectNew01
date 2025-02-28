package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC002_LoginTest extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void setup() {
		sheetName="Login";
		
	}
	
	@Test(dataProvider = "readData")
	public void loginTest(String username, String password, String testname) {
		
		HomePage hp = new HomePage(driver);
		hp.isLoginButtonVisible()
		.clickLogin()
		.loginEnterUsername(username)
		.loginEnterPassword(password)
		.clickLoginButton()
		.validateLogin();
	}

}
