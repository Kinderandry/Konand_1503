package com.it.tests;

import com.it.App;
import com.it.messages.Message;
import com.it.messages.MessagesFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {
    App app = new App();
    User validUser = UserFactory.getValidUser();
    Message randomMessage = MessagesFactory.getRandomMessage(validUser.email);

    @AfterSuite
    public void afterSuite() {
        app.common.stopApp();
    }
}
