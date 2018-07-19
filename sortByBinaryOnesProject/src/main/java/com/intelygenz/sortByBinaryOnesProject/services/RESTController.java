package com.intelygenz.sortByBinaryOnesProject.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intelygenz.sortByBinaryOnesProject.SortByBinaryOnesProjectApplication;
import com.intelygenz.sortByBinaryOnesProject.operations.SortOperations;

@RestController
public class RESTController {
	private static Logger LOGGER = LoggerFactory.getLogger(SortByBinaryOnesProjectApplication.class);
	private SortOperations so = new SortOperations();

	@RequestMapping("/list")
	public String decimalListController(
			@RequestParam(value = "stringList", defaultValue = "", required = true) String decList) {
		String result;

		if (decList == null || decList.length() == 0) { // Empty case
			result = "El parámetro está vacío";
			LOGGER.info("No response given.");
		} else {
			String sorted = so.sortByBinaryOnesOp(decList);

			if (sorted.indexOf("Se ha generado una") > -1) { // Exception
				result = sorted;
			} else { // Correct Case
				result = "La lista '" + decList + "' se ha ordenado siendo su valor resultante: '" + sorted + "'";
			}
			LOGGER.info("The response given is: {}", result);
		}

		return result;
	}
}
