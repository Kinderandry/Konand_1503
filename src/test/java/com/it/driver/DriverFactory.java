package com.it.driver;

import com.it.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static final String USERNAME = "kinderandry1";
    public static final String AUTOMATE_KEY = "JYvgypmNH4smG3brGtHy";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver getDriver() throws MalformedURLException {
        WebDriver driver;
        String driverName = System.getProperty("driver");

        if ("gecko".equals(driverName)) {
            System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ("bstack".equals(driverName)) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "80.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "7");
            caps.setCapability("resolution", "1366x768");
            caps.setCapability("name", "Bstack-[Java] Sample Test");
            driver = new RemoteWebDriver(new URL(URL), caps);
        } else {
            ChromeOptions options = new ChromeOptions();
            options.addExtensions(new File("C:\\Users\\Andrii\\IdeaProjects\\JBA\\Konand_1503\\src\\test\\java\\com\\it\\Ublock.crx"));
            driver = new ChromeDriver(options);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        return driver;
    }
}
