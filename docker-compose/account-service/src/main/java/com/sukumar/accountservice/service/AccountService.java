package com.sukumar.accountservice.service;

import java.math.BigDecimal;

import com.sukumar.accountservice.dto.AccountResponse;
import com.sukumar.accountservice.entity.Account;

public interface AccountService {

	public AccountResponse getAccount(Long accountId);
	
	public AccountResponse saveAccount(Account account);
	
	public String getPaymentStatus(Long accountNumber, BigDecimal amount);
}
