package com.atsistemas.vault.example.vaultexample.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample Application using Spring Cloud Vault. Vault will obtain MySQL
 * credentials to be used with a {@link javax.activation.DataSource}.
 */
@RestController
public class DatabaseController {
	

	@Autowired
	DataSource dataSource;

	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	@RequestMapping("/testDatabase")
	ResponseEntity<String> secretsDatabasMysql() {
		StringBuilder res = new StringBuilder();


		// values
		res.append(test_connection());

		return new ResponseEntity<String>(res.toString(), HttpStatus.ACCEPTED);
	}

	private String test_connection() {
		String val ="";
		try {
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT text FROM message;");
			resultSet.next();
			val = "ExecuteQuery result: " + resultSet.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return val;
	}
}
