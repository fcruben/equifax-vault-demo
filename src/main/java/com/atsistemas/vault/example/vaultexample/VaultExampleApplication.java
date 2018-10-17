package com.atsistemas.vault.example.vaultexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VaultExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VaultExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Start - VaultExampleApplication");
	}

}