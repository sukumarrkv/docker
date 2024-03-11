package com.sukumar.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public AccountResponse getAccount(@PathVariable("accountid") Long accountId) {
		return accountService.getAccount(accountId);
	}
	
	@PostMapping("/save")
	public AccountResponse saveAccount(@RequestBody Account account) {
		return accountService.saveAccount(account);
	}
}
