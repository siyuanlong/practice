package com.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test01 {
    @Test
    public void jdbctest(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/empty");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        JdbcTemplate template = new JdbcTemplate(dataSource);
        template.update("delete from user where id = 2");
    }
}
