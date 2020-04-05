package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToolbarMenuPage extends BasePage{
	@FindBy(xpath = "(//div[@class='section_nav']//li)[2]")
	private WebElement btnMessages;

	public void getMessages() {
		btnMessages.click();
	}
}
