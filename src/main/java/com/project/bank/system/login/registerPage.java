package com.project.bank.system.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerPage {
	private WebDriver driver;

	By registerLink = By.linkText("Register");
	By firstName = By.id("customer.firstName");
	By lastName = By.id("customer.lastName");
	By address = By.id("customer.address.street");
	By city = By.id("customer.address.city");
	By state = By.id("customer.address.state");
	By zipCode = By.id("customer.address.zipCode");
	By phoneNumber = By.id("customer.phoneNumber");
	By ssn = By.id("customer.ssn");
	By userName = By.id("customer.username");
	By password = By.id("customer.password");
	By confirmPassword = By.id("repeatedPassword");
	By registerButton = By.xpath("//input[@value='Register']");

	public registerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName(String firstNameText) {
		driver.findElement(firstName).sendKeys(firstNameText);
	}

	public void enterLastName(String lastNameText) {
		driver.findElement(lastName).sendKeys(lastNameText);
	}

	public void enterAddress(String addressText) {
		driver.findElement(address).sendKeys(addressText);
	}

	public void enterCity(String cityText) {
		driver.findElement(city).sendKeys(cityText);
	}

	public void enterState(String stateText) {
		driver.findElement(state).sendKeys(stateText);
	}

	public void enterZipCode(String zipCodeText) {
		driver.findElement(zipCode).sendKeys(zipCodeText);
	}

	public void enterPhoneNumber(String phoneNumberText) {
		driver.findElement(phoneNumber).sendKeys(phoneNumberText);
	}

	public void enterSSN(String ssnText) {
		driver.findElement(ssn).sendKeys(ssnText);
	}

	public void enterUserName(String userNameText) {
		driver.findElement(userName).sendKeys(userNameText);
	}

	public void enterPassword(String passwordText) {
		driver.findElement(password).sendKeys(passwordText);
	}

	public void enterConfirmPassword(String confirmPasswordText) {
		driver.findElement(state).sendKeys(confirmPasswordText);
	}

	public void register(String firstName, String lastName, String address, String city, String state, String zipCode,
			String phoneNumber, String ssn, String userName, String password, String confirmPassword) {
		enterFirstName(firstName);
		enterLastName(lastName);
		enterAddress(address);
		enterCity(city);
		enterState(state);
		enterZipCode(zipCode);
		enterPhoneNumber(phoneNumber);
		enterSSN(ssn);
		enterUserName(userName);
		enterPassword(password);
		enterConfirmPassword(confirmPassword);
	}
}
