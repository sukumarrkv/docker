package com.example.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/message")
	public String message() {
		return "Hello from Spring boot docker application";
	}
	
	@GetMapping("/v2/message")
	public String messageFromVersion2() {
		return "Hello from Spring boot docker application from version 2";
	}
}
