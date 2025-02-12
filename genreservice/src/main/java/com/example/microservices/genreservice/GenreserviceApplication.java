package com.example.microservices.genreservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GenreserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenreserviceApplication.class, args);
	}

}
