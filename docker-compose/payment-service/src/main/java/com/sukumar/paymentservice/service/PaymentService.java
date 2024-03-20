package com.sukumar.paymentservice.service;

import java.math.BigDecimal;

public interface PaymentService {

	public String getPaymentStatus(Long accountNumber, BigDecimal amount);
}
