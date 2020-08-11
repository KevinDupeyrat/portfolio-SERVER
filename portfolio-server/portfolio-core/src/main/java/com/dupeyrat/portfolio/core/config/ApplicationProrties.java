package com.dupeyrat.portfolio.core.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
public class ApplicationProrties {

    Mail mail = new Mail();
    Captcha captcha = new Captcha();

    @Data
    @NoArgsConstructor
    public static class Mail {
        private String login;
        private String password;
        private String smtp;
        private int port;
    }

    @Data
    @NoArgsConstructor
    public static class Captcha {
        private String privateKey;
    }
}
