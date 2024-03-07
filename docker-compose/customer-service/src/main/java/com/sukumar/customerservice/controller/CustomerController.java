package com.sukumar.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sukumar.customerservice.dto.CustomerResponse;
import com.sukumar.customerservice.entity.Customer;
import com.sukumar.customerservice.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	private CustomerService  customerService;
	
	@GetMapping("/get/{customerId}")
	public ResponseEntity<CustomerResponse> getCustomer(@PathVariable("customerId") Long customerId) {
		return new ResponseEntity<CustomerResponse>(customerService.getCustomer(customerId),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<CustomerResponse> saveCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<CustomerResponse>(customerService.saveCustomer(customer), HttpStatus.CREATED);
	}

}
