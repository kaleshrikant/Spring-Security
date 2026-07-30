package com.kaleshrikant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shrikant Kale
 * @Date 24 Jul 2026
 */

@RestController
public class BalanceController {

	@GetMapping("/myBalance")
	public String getBalanceDetails() {
		return "Here are the balance details from the DB";
	}
}
