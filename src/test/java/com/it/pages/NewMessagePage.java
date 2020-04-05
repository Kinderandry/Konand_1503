package com.it.pages;

import com.it.messages.Message;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewMessagePage extends BasePage {
	@FindBy(xpath = "//textarea[@name='to']")
	private WebElement inpAddress;

    @FindBy(xpath = "//input[@name='subject']")
    private WebElement inpSubject;

    @FindBy(xpath = "//div[@class='text_editor_browser']//textarea[@name='body']")
    private WebElement inpMessage;

	@FindBy(xpath = "//p[@class='send_container']//input[@name='send']")
	private WebElement btnSend;

    public void sendMessage(Message message) {
        inpAddress.sendKeys(message.address);
        inpSubject.sendKeys(message.subject);
        inpMessage.sendKeys(message.body);
        btnSend.click();
    }
}
