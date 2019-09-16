package com.cts.stockclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockclientApplication.class, args);
	}

}
