package com.it.helpers;

import com.it.pages.LoginPage;
import com.it.users.User;

public class LoginHelper extends LoginPage {

    public void login(User user) throws InterruptedException {
        log.info(String.format("Login user username - %s, password - %s%n", user.username, user.password));
        login(user.username, user.password);
    }
}
