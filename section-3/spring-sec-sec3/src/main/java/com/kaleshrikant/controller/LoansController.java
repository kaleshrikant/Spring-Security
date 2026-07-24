package com.kaleshrikant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shrikant Kale
 * @Date 24 Jul 2026
 */

@RestController
public class LoansController {

	@GetMapping("/myLoan")
	public String getLoanDetails() {
		return "Here are the loan details from the DB";
	}
}
