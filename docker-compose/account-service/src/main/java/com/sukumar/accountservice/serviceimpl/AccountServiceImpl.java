package com.sukumar.accountservice.serviceimpl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sukumar.accountservice.dto.AccountResponse;
import com.sukumar.accountservice.entity.Account;
import com.sukumar.accountservice.repository.AccountRepository;
import com.sukumar.accountservice.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Value("${payment.service.url}")
	private String paymentServiceUrl;

	@Override
	public AccountResponse getAccount(Long accountId) {
		AccountResponse accountResponse = new AccountResponse();
		Account account = accountRepository.findById(accountId).get();
		accountResponse.setAccount(account);
		accountResponse.setSuccess(true);
		accountResponse.setSuccessMessage("Succesfully retrieved account with account id - " + accountId);
		return accountResponse;
	}

	@Override
	public AccountResponse saveAccount(Account account) {
		AccountResponse accountResponse = new AccountResponse();
		Account savedAccount = accountRepository.save(account);
		accountResponse.setAccount(account);
		accountResponse.setSuccess(true);
		accountResponse.setSuccessMessage("Succesfully saved account with account id - " + savedAccount.getAccountId());
		return accountResponse;
	}

	@Override
	public String getPaymentStatus(Long accountNumber, BigDecimal amount) {
		return restTemplate.getForObject(paymentServiceUrl + "/status/" + accountNumber + "/" + amount, String.class);
	}

}
