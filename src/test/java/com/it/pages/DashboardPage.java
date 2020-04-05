package com.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement linkUserEmail;

	@FindBy(xpath = "//p[@class='make_message']")
	private WebElement btnMakeMessage;

    public String getUserEmail() {
        driver.wait.until(ExpectedConditions.visibilityOf(linkUserEmail));
        return linkUserEmail.getText();
    }

    public void makeMessage() {
        btnMakeMessage.click();
    }
}
