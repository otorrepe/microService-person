package com.nttdata.bank.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BankPersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankPersonApplication.class, args);
	}

}
