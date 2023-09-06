package com.example.springsecurityoauth2clientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisIndexedHttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableRedisIndexedHttpSession
@RestController
@SpringBootApplication
public class SpringSecurityOauth2ClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityOauth2ClientDemoApplication.class, args);
    }

    @Bean
    public ConfigureRedisAction configureRedisAction() {
        return ConfigureRedisAction.NO_OP;
    }

    @Bean
    public LettuceConnectionFactory connectionFactory() {
        return new LettuceConnectionFactory();
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
