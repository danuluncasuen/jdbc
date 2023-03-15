package com.endava.jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication implements CommandLineRunner {

	private final DataAccessObject dataAccessObject = new DataAccessObject();

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

	@Override
	public void run(String... args) {
		dataAccessObject.createNewEmployeeTable();
		dataAccessObject.dropTableEmployee();
	}
}
