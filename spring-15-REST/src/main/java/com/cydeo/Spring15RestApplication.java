package com.cydeo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring15RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring15RestApplication.class, args);
	}

	public ModelMapper modelMapper(){ return new ModelMapper(); }

}
