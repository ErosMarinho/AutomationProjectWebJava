package br.com.project.awj.core.exceptions;

import static br.com.project.awj.core.utils.Utilitarios.formatter;

/**
 * <p>
 * <strong>Excessões Personalizadas</strong> para a classe
 * {@link br.com.project.awj.core.interacao.Interactions
 * Interactions}.
 * 
 * @author Eros Marinho
 */
public class InteracaoException extends RuntimeException implements IException {

	private static final long serialVersionUID = 1L;
	private String message;

	public InteracaoException(Exception e, String description) {
		message = handler(e, description);
		message = String.format("%s - %s", formatter(), message);
		logger(e, message);
	}

	public String toString() {
		return description(message);
	}
}