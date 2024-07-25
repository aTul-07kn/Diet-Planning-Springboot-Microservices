package com.fitdiet.DietEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DietEurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DietEurekaServerApplication.class, args);
	}
}