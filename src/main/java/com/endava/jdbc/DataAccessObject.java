package com.endava.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class DataAccessObject {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/jdbc";
    static final String USER = "postgres";
    static final String PASS = "postgres";
    private final JdbcTemplate jdbcTemplate;

    public DataAccessObject() {
        SingleConnectionDataSource ds = new SingleConnectionDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl(DB_URL);
        ds.setUsername(USER);
        ds.setPassword(PASS);
        jdbcTemplate = new JdbcTemplate(ds);
    }

    public void createNewEmployeeTable() {
        try {
            jdbcTemplate.execute("create table employees (id int, name varchar(10))");
        } catch (Exception e) {
            System.out.println("Could not create employee table " + e.getMessage());
        }
    }

    public void dropTableEmployee() {
        try {
            jdbcTemplate.execute("drop table employees");
        } catch (Exception e) {
            System.out.println("Could not drop the employee table " + e.getMessage());
        }
    }

}
