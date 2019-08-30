package com.app.samplesv1.springbootmicroservicesmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringbootMicroservicesMcApplication.
 */
@SpringBootApplication
public class SpringbootMicroservicesMcApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroservicesMcApplication.class, args);
	}
	
	/**
	 * Rest template.
	 *
	 * @return the rest template
	 */
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	/**
	 * Gets the web client builder.
	 *
	 * @return the web client builder
	 */
	@Bean
	public WebClient getWebClientBuilder(){
		return WebClient.builder().build();
	}
	
	

}
