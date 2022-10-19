package com.example.tour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TourApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourApplication.class, args);
	}

}
