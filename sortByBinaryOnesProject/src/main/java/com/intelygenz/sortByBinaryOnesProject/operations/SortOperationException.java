package com.intelygenz.sortByBinaryOnesProject.operations;

public class SortOperationException extends Exception {

	private static final long serialVersionUID = 7874974528615985337L;

	public SortOperationException(String message) {
		super("Se ha generado una excepción durante el proceso de ordenación debida a : " + message);
	}

}
