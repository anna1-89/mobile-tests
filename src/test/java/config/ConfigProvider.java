package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigProvider {

    public static final BrowserstackConfig browserStackConfig =
            ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

}
