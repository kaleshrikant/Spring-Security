package com.kaleshrikant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shrikant Kale
 * @Date 23 Jul 2026
 */

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String sayWelcome() {
		return "Welcome to Spring Application with security";
	}
}
