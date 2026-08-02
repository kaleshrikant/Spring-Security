package com.kaleshrikant.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

/**
 * @author Shrikant Kale
 * @Date 02 Aug 2026
 */

@Component
@Slf4j
public class AuthenticationEvents {

	@EventListener
	public void onSuccess(AuthenticationSuccessEvent success) {
		log.info("Login successfull for the user {} ",success.getAuthentication().getName());
	}

	@EventListener
	public void onFailuer(AbstractAuthenticationFailureEvent failure) {
		log.info("Login failed for the user {} due to : {}  ",failure.getAuthentication().getName(), failure.getException().getMessage());
	}
}
