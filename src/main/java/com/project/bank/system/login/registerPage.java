package com.project.bank.system.login;

import org.openqa.selenium.By;

public class registerPage {
	By registerLink = By.linkText("Register");
	By firstName = By.id("customer.firstName");
	By lastName = By.id("customer.lastName");
	By street = By.id("customer.address.street");
	By city = By.id("customer.address.city");
}
