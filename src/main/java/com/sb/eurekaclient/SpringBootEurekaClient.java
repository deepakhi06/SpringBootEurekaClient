package com.sb.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringBootEurekaClient {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClient.class, args);

	}

	@RequestMapping(value = "/")
	public String home() {
		return "Eureka Client application";
	}
}
