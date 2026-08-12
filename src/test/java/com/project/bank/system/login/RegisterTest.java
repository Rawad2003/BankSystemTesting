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

	@Test(dataProvider = "registerData")
	public void registerTesting(String username, String password) {
		registerPage page = new registerPage(driver);
	}
}
