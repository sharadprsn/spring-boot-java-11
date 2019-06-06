package com.cb.app.config;

import com.cb.util.helper.AppHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    AppHelper appHelper() {
        return new AppHelper();
    }
}
