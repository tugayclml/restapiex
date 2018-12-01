package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	
	@Bean(name="dataSource")
	public DriverManagerDataSource dataSource() {
		
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
		driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/restexample");
		driverManagerDataSource.setUsername("postgres");
		driverManagerDataSource.setPassword("42gdk2480t");
		return driverManagerDataSource;
		
	}
	
}
