package com.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class InboxPage extends BasePage {
    @FindBy(xpath = "//div[@class='message_body']//pre")
    private WebElement messageText;

//	@FindBy(xpath = "//div[@class[contains(., 'row')]]//span[@class='sbj']")
//	private WebElement inboxMessage;


    public void openMessage(String messageSubject) {
        List<WebElement> messages = driver.findElements(By.xpath("//div[@class[contains(., 'row')]]//span[@class='sbj']"));
        for (WebElement message : messages) {
            String actualSubj = message.getText();
            if (actualSubj.equals(messageSubject)) {
                message.click();
                break;
            }
        }
    }

	public String getMessageText() {
		return messageText.getText();
	}
}
