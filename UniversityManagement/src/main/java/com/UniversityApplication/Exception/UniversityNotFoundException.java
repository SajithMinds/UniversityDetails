package com.UniversityApplication.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UniversityNotFoundException extends RuntimeException {
			/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public UniversityNotFoundException(String message) {
				super(message);
		
			}
}
