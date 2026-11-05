package drivers;


import java.util.Objects;

public final class DriverFactory {

    public String getDriver() {
        String browser = null;

        if (Objects.equals(System.getProperty("deviceHost"), "browserstack")) {
            browser = BrowserstackDriver.class.getName();
        }
        return browser;
    }

}
