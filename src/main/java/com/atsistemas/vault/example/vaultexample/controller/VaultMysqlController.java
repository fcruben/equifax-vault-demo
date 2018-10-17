package com.atsistemas.vault.example.vaultexample.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample Application using Spring Cloud Vault. Vault will obtain MySQL
 * credentials to be used with a {@link javax.activation.DataSource}.
 */
@RestController
public class VaultMysqlController {
	/**
	 * */
//	@Value("${kv.secret.user}")
//	String spring_datasource_username;
//
//	@Value("${kv.secret.pwd}")
//	String spring_datasource_password;
//
//	@Autowired
//	DataSource dataSource;
//
//	private Connection connection = null;
//	private Statement statement = null;
//	private ResultSet resultSet = null;
//
//	@RequestMapping("/secrets/database/mysql")
//	ResponseEntity<String> secretsDatabasMysql() {
//		StringBuilder res = new StringBuilder();
//
//		// values
//		res.append("@Value('${spring.datasource.username}') = " + spring_datasource_username).append("<br>");
//		res.append("@Value('${spring.datasource.password}') = " + spring_datasource_password).append("<br>");
//
//		// test_connection_status
//		res.append("test_connection_status() = ").append(test_connection_status() ? "ON" : "OFF").append("<br>");
//
//		// test_current_user
//		res.append("test_current_user = ").append(test_current_user()).append("<br>");
//
//		// test_select_db
//		res.append("test_select_db = ").append(test_select_db()).append("<br>");
//
//		return new ResponseEntity<String>(res.toString(), HttpStatus.ACCEPTED);
//	}
//
//	private boolean test_connection_status() {
//		try {
//			connection = dataSource.getConnection();
//			statement = connection.createStatement();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return true;
//	}
//
//	private String test_current_user() {
//		String val = null;
//		try {
//			resultSet = statement.executeQuery("SELECT CURRENT_USER();");
//			resultSet.next();
//
//			val = "Connection works with User: " + resultSet.getString(1);
//			resultSet.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return val;
//	}
//
//	private String test_select_db() {
//		String val = null;
//		try {
//			resultSet = statement.executeQuery("SELECT text FROM message;");
//			resultSet.next();
//
//			val = "ExecuteQuery result: " + resultSet.getString(1);
//			resultSet.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return val;
//	}
}
