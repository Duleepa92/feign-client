package com.epiclanka.feingclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class FeingClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeingClientApplication.class, args);
	}

	
}
