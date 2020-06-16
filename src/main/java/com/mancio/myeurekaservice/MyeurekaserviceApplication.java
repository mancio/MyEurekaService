package com.mancio.myeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MyeurekaserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyeurekaserviceApplication.class, args);
	}

}
