package com.kaleshrikant.exceptionhandeling;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * @author Shrikant Kale
 * @Date 01 Aug 2026
 */

public class CustomAccessDeniedHandler implements AccessDeniedHandler {
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
		response.setHeader("eazybank-denied-reason", "Authorization Failed");
		response.setStatus(HttpStatus.FORBIDDEN.value());
		response.setContentType("application/json:charset=UTF-8");

		LocalDateTime currentTimeStamp = LocalDateTime.now();
		String message = (accessDeniedException != null && accessDeniedException.getMessage() != null) ? accessDeniedException.getMessage() : "Authorization Failed";
		String path = request.getRequestURI();

		String jsonResponse = String.format("{\"timestamp\": \"%s\", \"status\": %d, \"error\": \"%s\", \"message\": \"%s\", \"path\": \"%s\"}",
				currentTimeStamp, HttpStatus.FORBIDDEN.value(), HttpStatus.FORBIDDEN.getReasonPhrase(), message,path	);
		response.getWriter().write(jsonResponse);
	}
}
