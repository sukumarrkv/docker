package com.sukumar.customerservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sukumar.customerservice.dto.CustomerResponse;
import com.sukumar.customerservice.entity.Customer;
import com.sukumar.customerservice.repository.CustomerRepository;
import com.sukumar.customerservice.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public CustomerResponse getCustomer(Long customerId) {
		CustomerResponse customerResponse = new CustomerResponse();
		Customer customer = customerRepository.findById(customerId).get();
		customerResponse.setCustomer(customer);
		customerResponse.setSucess(true);
		customerResponse.setSucessMessage("Succesfully retrieved customer with customer id - "+customerId);
		return customerResponse;
	}

	@Override
	public CustomerResponse saveCustomer(Customer customer) {
		CustomerResponse customerResponse = new CustomerResponse();
		Customer createdCustomer = customerRepository.save(customer);
		customerResponse.setCustomer(createdCustomer);
		customerResponse.setSucess(true);
		customerResponse.setSucessMessage("Succesfully saved customer with customer id - "+createdCustomer.getCustomerId());
		return customerResponse;
	}

}
