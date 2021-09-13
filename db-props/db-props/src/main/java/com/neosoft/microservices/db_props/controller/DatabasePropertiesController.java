package com.neosoft.microservices.db_props.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.microservices.db_props.bean.DatabaseProperties;
import com.neosoft.microservices.db_props.configuration.Configuration;

@RestController
public class DatabasePropertiesController {

	@Autowired
	Configuration config;

	@GetMapping("/db-props")
	public DatabaseProperties getDBProps() {
		return new DatabaseProperties(
				config.getDriverClassName(), 
				config.getUrl(), 
				config.getUsername(),
				config.getPassword()
		);
	}
}
