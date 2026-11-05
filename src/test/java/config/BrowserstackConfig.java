package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:BrowserstackConfig.properties")
public interface BrowserstackConfig extends Config {

    @Key("bs.username")
    String username();

    @Key("bs.accessKey")
    String accessKey();

    @Key("bs.appUrl")
    String appUrl();

    @Key("bs.deviceName")
    String deviceName();

    @Key("bs.osVersion")
    String osVersion();


}
