package com.sukumar.accountservice.dto;

import com.sukumar.accountservice.entity.Account;

public class AccountResponse {

	private Account account;
	
	private Boolean success;
	
	private String successMessage;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	
	
}
