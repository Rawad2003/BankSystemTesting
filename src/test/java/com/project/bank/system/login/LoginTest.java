package com.project.bank.system.login;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.bank.system.base.BaseSetup;

public class LoginTest extends BaseSetup {
	@DataProvider
	public static Object[] loginData() {
		return new Object[][] { { "john/", "demo" } };
	}

	@Test(dataProvider = "loginData")
	public void loginTesting(String username, String password) {
		loginPage page = new loginPage(driver);
		page.login(username, password);
	}

}
