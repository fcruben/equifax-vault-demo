package com.atsistemas.vault.example.vaultexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.vault.example.vaultexample.service.impl.SecretServiceImpl;

/**
 * Sample Application using Spring Cloud Vault. Vault will obtain KV credentials
 * to be used with a {@link org.springframework.beans.factory.annotation.Value}.
 */
@RestController
public class VaultSecretServiceController {

	/**
	 * */

	@Autowired
	private SecretServiceImpl secretsServiceImpl;

	@RequestMapping("/secrets/service/kv")
	public ResponseEntity<String> secretsServiceKV(@RequestParam(name = "name") String secretNameToRead) {
		return new ResponseEntity<String>(secretsServiceImpl.readKV(secretNameToRead), HttpStatus.ACCEPTED);
	}

}
