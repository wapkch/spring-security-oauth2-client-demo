package com.example.springsecurityoauth2clientdemo;

import org.springframework.boot.SpringApplication;

class SpringSecurityOauth2ClientDemoApplicationTests {

    public static void main(String[] args) {
        SpringApplication.from(SpringSecurityOauth2ClientDemoApplication::main)
            .with(MyContainersConfiguration.class)
            .run(args);
    }

}
