package com.sukumar.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public CustomerResponse getCustomer(@PathVariable Long customerId) {
		return customerService.getCustomer(customerId);
	}
	
	@PostMapping("/save")
	public CustomerResponse saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

}
