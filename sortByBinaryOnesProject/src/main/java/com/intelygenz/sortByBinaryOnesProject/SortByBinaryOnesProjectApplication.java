package com.intelygenz.sortByBinaryOnesProject;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.intelygenz.sortByBinaryOnesProject.services",
		"com.intelygenz.sortByBinaryOnesProject.operations" })
public class SortByBinaryOnesProjectApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SortByBinaryOnesProjectApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Starting SortByBinaryOnesApplication at: " + new Date());
		
		SpringApplication.run(SortByBinaryOnesProjectApplication.class, args);
		
		LOGGER.info("End SortByBinaryOnesApplication at: " + new Date());
	}
}
