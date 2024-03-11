package com.sukumar.accountservice.service;

import com.sukumar.accountservice.dto.AccountResponse;
import com.sukumar.accountservice.entity.Account;

public interface AccountService {

	public AccountResponse getAccount(Long accountId);
	
	public AccountResponse saveAccount(Account account);
}
