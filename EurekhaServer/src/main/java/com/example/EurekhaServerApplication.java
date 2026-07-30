package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class EurekhaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekhaServerApplication.class, args);
	}

}
