package com.github.marceloemanoel.fish;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class PropertyCredentials implements Credentials {

    private Properties properties;

    public PropertyCredentials() {
        this(new Properties());
    }

    public PropertyCredentials(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String clientId() {
        return properties.getProperty("clientId");
    }

    @Override
    public String apiKey() {
        return properties.getProperty("apiKey");
    }

    public static PropertyCredentials loadFrom(URL source) throws IOException {
        Properties properties = new Properties();
        properties.load(source.openStream());
        return new PropertyCredentials(properties);
    }
}
