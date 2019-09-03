package com.app.samplesv1.springbootmicroservicesmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringbootMicroservicesMcApplication.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
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
	@LoadBalanced
	public RestTemplate restTemplate() {
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		clientHttpRequestFactory.setConnectTimeout(3000);
	    return new RestTemplate(clientHttpRequestFactory);
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
