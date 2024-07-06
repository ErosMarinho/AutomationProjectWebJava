package br.com.project.awj.core.exceptions;

import static br.com.project.awj.core.utils.Utilitarios.formatter;

public class UtilsException extends RuntimeException implements IException {

	private static final long serialVersionUID = 1L;
	private String message;

	public UtilsException(Exception e, String description) {
		message = handler(e, description);
		message = String.format("%s - %s", formatter(), message);
		logger(e, message);
	}

	public String toString() {
		return description(message);
	}
}
