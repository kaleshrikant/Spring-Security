package com.kaleshrikant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shrikant Kale
 * @Date 24 Jul 2026
 */

@RestController
public class AccountController {

	@GetMapping("/myAccount")
	public String getAccountDetails() {
		return "Here are the account details from the DB";
	}
}
