package com.project.bank.system.login;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.bank.system.base.BaseSetup;

public class LoginTest extends BaseSetup {
	@DataProvider
	public static Object[] loginData() {
		return new Object[][] { { "Rawad", "pass123" } };
	}

	@Test
	public void loginTesting() {
		loginPage page = new loginPage(driver);
		page.login("Rawad", "pass123");
		Assert.assertTrue(driver.getTitle().contains("ParaBank"));
	}

}
