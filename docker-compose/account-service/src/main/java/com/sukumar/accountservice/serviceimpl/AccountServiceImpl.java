package com.sukumar.accountservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sukumar.accountservice.dto.AccountResponse;
import com.sukumar.accountservice.entity.Account;
import com.sukumar.accountservice.repository.AccountRepository;
import com.sukumar.accountservice.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public AccountResponse getAccount(Long accountId) {
		AccountResponse accountResponse = new AccountResponse();
		Account account = accountRepository.findById(accountId).get();
		accountResponse.setAccount(account);
		accountResponse.setSuccess(true);
		accountResponse.setSuccessMessage("Succesfully retrieved account with account id - "+accountId);
		return accountResponse;
	}

	@Override
	public AccountResponse saveAccount(Account account) {
		AccountResponse accountResponse = new AccountResponse();
		Account savedAccount = accountRepository.save(account);
		accountResponse.setAccount(account);
		accountResponse.setSuccess(true);
		accountResponse.setSuccessMessage("Succesfully saved account with account id - "+savedAccount.getAccountId());
		return accountResponse;
	}

}
