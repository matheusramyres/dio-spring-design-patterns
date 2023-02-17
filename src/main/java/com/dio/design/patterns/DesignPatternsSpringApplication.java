package com.dio.design.patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DesignPatternsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsSpringApplication.class, args);
	}

}
