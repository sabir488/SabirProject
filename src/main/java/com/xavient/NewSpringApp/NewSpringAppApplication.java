package com.xavient.NewSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.xavient"})
public class NewSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewSpringAppApplication.class, args);
	}
}
