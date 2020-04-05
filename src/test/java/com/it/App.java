package com.it;

import com.it.helpers.*;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashboardHelper dashboard;
    public NewMessageHelper newMessage;
    public ToolbarMenuHelper toolbarMenu;
    public InboxHelper inbox;

    public App() {
        common = new CommonHelper();
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        newMessage = new NewMessageHelper();
        toolbarMenu = new ToolbarMenuHelper();
        inbox = new InboxHelper();
    }
}
