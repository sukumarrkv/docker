package com.sukumar.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@GetMapping("/message")
	public String message() {
		return "Hello from customer service";
	}
}
