package com.springboot.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //habilitamos eureja server
@SpringBootApplication
public class ServiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEurekaServerApplication.class, args);
	}

}
