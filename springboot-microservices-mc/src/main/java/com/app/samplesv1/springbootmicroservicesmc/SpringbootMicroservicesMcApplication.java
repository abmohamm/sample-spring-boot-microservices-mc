package com.app.samplesv1.springbootmicroservicesmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringbootMicroservicesMcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroservicesMcApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	

}
