package com.john.silverfox.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.john.silverfox"})
@SpringBootApplication
public class SilverfoxApplication {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "dev");
		SpringApplication.run(SilverfoxApplication.class, args);
	}
}
