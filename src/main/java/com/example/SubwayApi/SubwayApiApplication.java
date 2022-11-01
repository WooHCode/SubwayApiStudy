package com.example.SubwayApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class SubwayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubwayApiApplication.class, args);
	}

}
