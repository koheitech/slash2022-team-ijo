package com.ijoapp.ijoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IjoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(IjoAppApplication.class, args);
	}

}
