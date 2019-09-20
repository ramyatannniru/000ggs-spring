package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootServerMicroservice1609ddApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServerMicroservice1609ddApplication.class, args);
	}

}
