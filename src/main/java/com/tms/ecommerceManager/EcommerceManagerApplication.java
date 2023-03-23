package com.tms.ecommerceManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EcommerceManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceManagerApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(){
       return new RestTemplate();
	}
}
