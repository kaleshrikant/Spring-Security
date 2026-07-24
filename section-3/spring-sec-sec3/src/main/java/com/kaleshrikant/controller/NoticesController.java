package com.kaleshrikant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shrikant Kale
 * @Date 24 Jul 2026
 */

@RestController
public class NoticesController {

	@GetMapping("/notices")
	public String getNotices() {
		return "Here are the notices details from the DB";
	}
}
