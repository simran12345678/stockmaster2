package com.cts.stockserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StockserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockserverApplication.class, args);
	}

}
