package com.project.bank.system.homepage;

import org.openqa.selenium.By;

public class homePage {
	By ParaBankLogo = By.xpath("//img[@alt='ParaBank']");
	By userName = By.name("username");
	By password = By.name("password");
	By loginButton = By.xpath("//input[contains(@value,'Log')]");
	By forgotLoginInfo = By.linkText("Forgot login info?");
	By registerLink = By.linkText("Register");
}
