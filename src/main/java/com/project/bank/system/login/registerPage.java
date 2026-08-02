package com.project.bank.system.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerPage {
	private WebDriver driver;

	By registerLink = By.linkText("Register");
	By firstName = By.id("customer.firstName");
	By lastName = By.id("customer.lastName");
	By street = By.id("customer.address.street");
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
	public void enterStreet(String streetText) {
		driver.findElement(street).sendKeys(streetText);
	}
	public void enterCity(String cityText) {
		driver.findElement(city).sendKeys(cityText);
	}
}
