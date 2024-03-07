package com.sukumar.customerservice.service;

import com.sukumar.customerservice.dto.CustomerResponse;
import com.sukumar.customerservice.entity.Customer;

public interface CustomerService {

	public CustomerResponse getCustomer(Long customerId);
	
	public CustomerResponse saveCustomer(Customer customer);
}
