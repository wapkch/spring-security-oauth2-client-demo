package com.example.springsecurityoauth2clientdemo.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class WebClientConfig {

    @Bean
    @Order(SecurityProperties.DEFAULT_FILTER_ORDER - 1)
    SecurityFilterChain oauth2SecurityFilterChain(HttpSecurity http) throws Exception {
        http.securityMatcher("/oauth2/authorization/**", "/login/oauth2/**", "/sso/**");
        http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
        http.oauth2Login(withDefaults());
        http.oauth2Client(withDefaults());
        return http.build();
    }

}
