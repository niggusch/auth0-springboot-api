package com.auth0.example;

import com.auth0.example.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

// NOTE: Ensure you dont import the auth0-security-context.xml by mistake.
// You will have issues with CSRF - instead setup a config cliass in Securityconfig.java
// @ImportResource("classpath:auth0-security-context.xml")

@SpringBootApplication
@ComponentScan(basePackages = {"com.example", "com.auth0"})
@EnableAutoConfiguration
@PropertySource("classpath:auth0.properties")
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        SpringApplication.run(App.class, args);
    }
}
