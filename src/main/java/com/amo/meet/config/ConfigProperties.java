package com.amo.meet.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class ConfigProperties {

    private static String contextPath;

    public String getContextPath() {
        return contextPath;
    }

    @Value("${server.servlet.context-path}")
    public void setContextPath(String contextPath) {
        ConfigProperties.contextPath = contextPath;
    }
}
