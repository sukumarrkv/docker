package com.sukumar.accountservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentServiceConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
