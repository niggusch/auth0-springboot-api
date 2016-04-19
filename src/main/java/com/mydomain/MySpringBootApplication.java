package com.mydomain;

import com.mydomain.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

//NOTE: Ensure you dont import the auth0-security-context.xml by mistake. You will have issues with CSRF - instead setup a config cliass in Securityconfig.java
//@ImportResource("classpath:auth0-security-context.xml")

@SpringBootApplication
@ComponentScan(basePackages = {"com.mydomain", "com.auth0"})
@EnableAutoConfiguration
@PropertySource("classpath:auth0.properties")
public class MySpringBootApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();

		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
