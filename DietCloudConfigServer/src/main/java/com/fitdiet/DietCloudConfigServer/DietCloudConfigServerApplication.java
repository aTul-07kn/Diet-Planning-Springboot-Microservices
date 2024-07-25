package com.fitdiet.DietCloudConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DietCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DietCloudConfigServerApplication.class, args);
	}

}
