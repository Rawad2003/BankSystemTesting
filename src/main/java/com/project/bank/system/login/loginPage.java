package com.project.bank.system.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	private WebDriver driver;
	By userName = By.name("username");
	By password = By.name("password");
	By loginButton = By.xpath("//input[contains(@value,'Log')]");

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String usernameText) {
		driver.findElement(userName).sendKeys(usernameText);
	}

	public void enterPassword(String passwordText) {
		driver.findElement(password).sendKeys(passwordText);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

	public void login(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickLogin();
	}
}
