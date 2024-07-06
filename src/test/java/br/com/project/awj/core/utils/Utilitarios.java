package br.com.project.awj.core.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utilitarios {

	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(Utilitarios.class.getSimpleName());
	
	public static String formatter() {
		return DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss").format(LocalDateTime.now());
	}

	
}
