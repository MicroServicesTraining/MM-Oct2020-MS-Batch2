package com.sb.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BankingServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BankingServiceApplication.class, args);
	}
}
