package com.project.bank.system.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.bank.system.base.BaseSetup;

public class RegisterTest extends BaseSetup {
	@DataProvider
	public static Object[] registerData() {
		return new Object[][] { { "Jane", "Doe", "123 Main St", "Springfield", "IL", "62701", "5551234567",
				"123-45-67890", "janedoe_<timestamp>", "Passw0rd!", "Passw0rd!" } };
	}

	@Test(description = "TC-REG-01")
	public void registerPageLoad() {
		registerPage page = new registerPage(driver);
		page.navigateToRegisterPage();
	}

	@Test(description = "TC-REG-03 -> TC-REG-18", dataProvider = "registerData")
	public void registerTesting(String firstName, String lastName, String address, String city, String state,
			String zipCode, String phoneNumber, String ssn, String username, String password, String confirmPassword) {
		registerPage page = new registerPage(driver);
		page.register(firstName, lastName, address, city, state, zipCode, phoneNumber, ssn, username, password,
				confirmPassword);
	}
}
