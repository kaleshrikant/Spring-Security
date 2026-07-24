package com.kaleshrikant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shrikant Kale
 * @Date 24 Jul 2026
 */

@RestController
public class CardsController {

	@GetMapping("/myCards")
	public String getCardDetails() {
		return "Here are the card details from the DB";
	}
}
