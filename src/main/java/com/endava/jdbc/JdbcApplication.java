package com.endava.jdbc;

import com.endava.jdbc.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class JdbcApplication implements CommandLineRunner {

//	private final DataAccessObject dataAccessObject = new DataAccessObject();

	private final TestService testService;

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

	@Override
	public void run(String... args) {

		try {
			testService.testAddEmployeeAndInvoices();
			System.out.println("efsihgrsi");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
