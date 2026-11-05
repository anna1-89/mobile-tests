package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigProvider {

    private ConfigProvider() {
    }

    public static String deviceHost() {
        return System.getProperty("deviceHost", "browserstack");
    }

    public static final BrowserstackConfig BROWSERSTACK_CONFIG =
            ConfigFactory.create(BrowserstackConfig.class, System.getProperties());


}
