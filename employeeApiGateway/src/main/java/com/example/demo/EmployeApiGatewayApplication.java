package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeApiGatewayApplication {

	public static void main(String[] args) {
		System.out.println("request came to api gateway");
		SpringApplication.run(EmployeApiGatewayApplication.class, args);
	}

}
