package drivers;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class BrowserstackDriver implements WebDriverProvider{

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities caps = new MutableCapabilities();
/*
        // Set your access credentials
        caps.setCapability("browserstack.user", "anna_A29J6N");
        caps.setCapability("browserstack.key", "CjzuJrSssS2sxHpeX632");

        // Set URL of the application under test
        caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 8 Pro");
        caps.setCapability("os_version", "14.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "first_test"); */


        caps.setCapability("platformName", "android");
        caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

        /*
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("userName", "anna_A29J6N");
        browserstackOptions.put("accessKey", "CjzuJrSssS2sxHpeX632");
        browserstackOptions.put("deviceName", "Google Pixel 8 Pro");
        browserstackOptions.put("osVersion", "14.0");
        browserstackOptions.put("projectName", "First Java Project");

        caps.setCapability("bstack:options", browserstackOptions);*/



        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        try {
            return new RemoteWebDriver(
                    new URL("https://hub.browserstack.com/wd/hub"), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}
