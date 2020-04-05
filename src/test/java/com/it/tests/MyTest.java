package com.it.tests;

import com.it.messages.Message;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test1() throws InterruptedException {
        app.login.login(validUser);
        Thread.sleep(1000);
        Assert.assertEquals(app.dashboard.getUserEmail(), validUser.email);
        Thread.sleep(1000);

        app.dashboard.makeMessage();
        Thread.sleep(1000);
        Message randomMessage = this.randomMessage;
        app.newMessage.sendMessage(randomMessage);
        Thread.sleep(1000);
        app.toolbarMenu.getMessages();
        app.inbox.openMessage(randomMessage.subject);
        Thread.sleep(2000);
        String actualMessage = app.inbox.getMessageText();
        Assert.assertTrue(actualMessage.contains(randomMessage.body));
    }
}
