package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigProvider {

    private ConfigProvider() {
    }

    public static final BrowserstackConfig browserStackConfig =
            ConfigFactory.create(BrowserstackConfig.class, System.getProperties());


}
