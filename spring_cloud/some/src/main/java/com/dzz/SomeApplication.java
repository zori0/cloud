package com.dzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SomeApplication.class, args);
	}
}
