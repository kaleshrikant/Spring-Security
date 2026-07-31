package com.kaleshrikant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EazyBankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyBankBackendApplication.class, args);
	}

}
 // -Dspring.profiles.active=default : IntelliJ
//  SPRING_PROFILES_ACTIVE=default : Using environment variable