package com.sukumar.accountservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sukumar.accountservice.dto.AccountResponse;
import com.sukumar.accountservice.entity.Account;
import com.sukumar.accountservice.service.AccountService;

@RestController
@RequestMapping("/api/account/")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping("/get/{accountid}")
	public ResponseEntity<AccountResponse> getAccount(@PathVariable("accountid") Long accountId) {
		return new ResponseEntity<AccountResponse>(accountService.getAccount(accountId), HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<AccountResponse> saveAccount(@RequestBody Account account) {
		return new ResponseEntity<AccountResponse>(accountService.saveAccount(account), HttpStatus.CREATED);
	}

	@GetMapping("/payment/status/{accountnumber}/{amount}")
	public ResponseEntity<String> getPaymentStatus(@PathVariable("accountnumber") Long accountNumber,
			@PathVariable("amount") BigDecimal amount) {
		return new ResponseEntity<String>(accountService.getPaymentStatus(accountNumber, amount), HttpStatus.OK);
	}
}
