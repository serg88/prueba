package com.intelygenz.sortByBinaryOnesProject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.intelygenz.sortByBinaryOnesProject.operations.SortOperations;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SortByBinaryOnesProjectApplicationTests {
	private static Logger LOGGER = LoggerFactory.getLogger(SortByBinaryOnesProjectApplicationTests.class);
	SortOperations so = new SortOperations();

	@Test
	public void contextLoads() {

	}

	@Test
	public void sortExampleList() {
		String expectedResponse = "15,7,3,5,1";

		String realResponse = so.sortByBinaryOnesOp("1,15,5,7,3");

		LOGGER.info("{} VS {}", realResponse, expectedResponse);

		assertTrue(realResponse.equals(expectedResponse));
	}

	@Test
	public void sortExampleListWithSpaces() {
		String expectedResponse = "15,7,3,5,1";

		String realResponse = so.sortByBinaryOnesOp("1, 15, 5, 7, 3");
		
		LOGGER.info("{} VS {}", realResponse, expectedResponse);

		assertTrue(realResponse.equals(expectedResponse));
	}

}
