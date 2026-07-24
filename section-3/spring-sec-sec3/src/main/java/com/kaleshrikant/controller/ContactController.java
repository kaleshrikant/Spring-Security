package com.kaleshrikant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shrikant Kale
 * @Date 24 Jul 2026
 */

@RestController
public class ContactController {

	@GetMapping("/contact")
	public String saveContactInquiryDetails() {
		return "Inquiry details are saved in DB";
	}
}
