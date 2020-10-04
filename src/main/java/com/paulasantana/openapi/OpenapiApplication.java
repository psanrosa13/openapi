package com.paulasantana.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapiApplication.class, args);
	}

}
