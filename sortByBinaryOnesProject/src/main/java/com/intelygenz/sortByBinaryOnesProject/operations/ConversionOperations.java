package com.intelygenz.sortByBinaryOnesProject.operations;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ConversionOperations {
	
	/** Convert String comma separated line into a list of int. */
	protected ArrayList<Integer> fromFormatedStringToList(String commaSeparatedString) {
		Pattern pat = Pattern.compile(",");
		return (ArrayList<Integer>) pat.splitAsStream(commaSeparatedString.replaceAll("\\s+", "")).map(Integer::valueOf)
				.collect(Collectors.toList());
	}

	/** Convert list of int into String comma separated line. */
	protected String fromListToFormatedString(ArrayList<Integer> list) {
		return String.join(",", list.stream().map(n -> n.toString()).collect(Collectors.toList()));
	}

	/** Convert int number into it's binary version. */
	protected String intIntoBinary(int number) {
		return Integer.toBinaryString(number);
	}
}
