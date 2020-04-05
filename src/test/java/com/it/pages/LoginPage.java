package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
	@FindBy(xpath = "//input[@name='login']")
	private WebElement inpLogin;

	@FindBy(xpath = "//input[@name='pass']")
	private WebElement inpPassword;

	@FindBy(xpath="//form[@name='lform']//input[@type='submit']")
	private WebElement btnLogin;

	protected void login(String login, String password) throws InterruptedException {
		driver.scrollDown();
		Thread.sleep(1000);
		driver.scrollToElement(inpLogin);
		inpLogin.sendKeys(login);
		inpPassword.sendKeys(password);
		btnLogin.click();
	}

}
