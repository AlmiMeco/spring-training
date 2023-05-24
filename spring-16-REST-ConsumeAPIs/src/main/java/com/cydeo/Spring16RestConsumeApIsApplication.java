package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Spring16RestConsumeApIsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring16RestConsumeApIsApplication.class, args);
	}


	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
