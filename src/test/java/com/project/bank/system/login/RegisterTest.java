package com.project.bank.system.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.bank.system.base.BaseSetup;

public class RegisterTest extends BaseSetup {
	@DataProvider
	public static Object[] registerData() {
		return new Object[][] { { "john/", "demo" } };
	}

	@Test(dataProvider = "registerData")
	public void loginTesting(String username, String password) {
		registerPage page = new registerPage(driver);
	}
}
