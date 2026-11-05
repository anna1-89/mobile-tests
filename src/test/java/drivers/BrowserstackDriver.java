package drivers;


import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static config.ConfigProvider.browserStackConfig;

public class BrowserstackDriver implements WebDriverProvider{

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities caps = new MutableCapabilities();

        Map<String, Object> bstackOptions = new HashMap<>();
        bstackOptions.put("userName", browserStackConfig.username());
        bstackOptions.put("accessKey", browserStackConfig.accessKey());
        bstackOptions.put("projectName", "First Java Project");
        bstackOptions.put("buildName", "browserstack-build-1");
        bstackOptions.put("sessionName", "first_test");

        caps.setCapability("bstack:options", bstackOptions);
        caps.setCapability("platformName", "android");
        caps.setCapability("appium:deviceName", browserStackConfig.deviceName());
        caps.setCapability("appium:platformVersion", browserStackConfig.osVersion());
        caps.setCapability("appium:app", browserStackConfig.appUrl());
        System.out.println("ANDROID DRIVER STARTED");
        try {
            return new RemoteWebDriver(
                    new URL("https://hub.browserstack.com/wd/hub"), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}
