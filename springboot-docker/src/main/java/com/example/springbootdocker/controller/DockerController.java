package com.example.springbootdocker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	private static final Logger logger = LoggerFactory.getLogger(DockerController.class);
	
	@GetMapping("/message")
	public String message() {
		logger.info("Getting message in version 1");
		return "Hello from Spring boot docker application";
	}
	
	@GetMapping("/v2/message")
	public String messageFromVersion2() {
		logger.info("Getting message in version 2");
		return "Hello from Spring boot docker application from version 2";
	}
}
