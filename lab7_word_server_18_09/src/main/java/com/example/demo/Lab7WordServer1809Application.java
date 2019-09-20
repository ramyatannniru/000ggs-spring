package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab7WordServer1809Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab7WordServer1809Application.class, args);
	}

}
