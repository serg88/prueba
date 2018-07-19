package com.intelygenz.sortByBinaryOnesProject.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class SortOperations {
	private static Logger LOGGER = LoggerFactory.getLogger(SortOperations.class);
	private ConversionOperations convOps;
	
	public SortOperations() {
		convOps = new ConversionOperations();
	}

	/** Sort a list of decimal numbers counting the number of 'ones' on it's binary version */
	public String sortByBinaryOnesOp(String unorderedString) {
		try {
		LOGGER.debug("Received '{}' from the Service.", unorderedString);
		ArrayList<Integer> unorderedDecimalList = convOps.fromFormatedStringToList(unorderedString);

		LOGGER.debug("Start sorting the list of decimal numbers");
		Collections.sort(unorderedDecimalList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int result = countOne(convOps.intIntoBinary(o1)).compareTo(countOne(convOps.intIntoBinary(o2)));

				// Manage the case with same 'ones' number.
				if (result == 0) {
					result = o1 < o2 ? 1 : -1;
				}

				return result;
			}
		}.reversed());
		LOGGER.debug("Sorted the list of decimal numbers.");

		return convOps.fromListToFormatedString(unorderedDecimalList);
		} catch(Exception e) {
			
			return new SortOperationException(e.getMessage()).getMessage();
		}
	}

	

	/** Count the number of 'ones' in the binary number. */
	private Integer countOne(String binaryNumber) {
		return StringUtils.countOccurrencesOf(binaryNumber, "1");
	}
}
