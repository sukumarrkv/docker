package com.sukumar.paymentservice.serviceimpl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.sukumar.paymentservice.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public String getPaymentStatus(Long accountNumber, BigDecimal amount) {
		// Actual logic to get payment status
		return "Sucessfully processsed payment of " + amount + " from account number " + accountNumber;
	}

}
