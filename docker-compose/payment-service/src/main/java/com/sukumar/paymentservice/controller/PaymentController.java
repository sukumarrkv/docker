package com.sukumar.paymentservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sukumar.paymentservice.service.PaymentService;

@RestController
@RequestMapping("/api/payment/")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@GetMapping("/status/{accountnumber}/{amount}")
	public ResponseEntity<String> getPaymentStatus(@PathVariable("accountnumber") Long accountNumber,
			@PathVariable("amount") BigDecimal amount) {
		return new ResponseEntity<String>(paymentService.getPaymentStatus(accountNumber, amount), HttpStatus.OK);
	}
}
