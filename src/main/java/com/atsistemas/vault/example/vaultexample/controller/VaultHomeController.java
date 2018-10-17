package com.atsistemas.vault.example.vaultexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultHomeController {

	/**
	 * */
	@RequestMapping("/")
	ResponseEntity<String> home() {
		StringBuilder endpoints = new StringBuilder();
		endpoints.append("Endpoint to use Secret Service KV -> /secrets/service/kv/{name} <br>");
		endpoints.append("Endpoint to use Secret Service KV and connect to DB -> /testDatabase <br>");
		return new ResponseEntity<String>(endpoints.toString(), HttpStatus.ACCEPTED);
	}

}
