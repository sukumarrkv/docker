package com.sukumar.customerservice.dto;

import com.sukumar.customerservice.entity.Customer;

public class CustomerResponse {

	private Customer customer;
	
	private Boolean sucess;
	
	private String sucessMessage;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Boolean getSucess() {
		return sucess;
	}

	public void setSucess(Boolean sucess) {
		this.sucess = sucess;
	}

	public String getSucessMessage() {
		return sucessMessage;
	}

	public void setSucessMessage(String sucessMessage) {
		this.sucessMessage = sucessMessage;
	}
	
	
}
