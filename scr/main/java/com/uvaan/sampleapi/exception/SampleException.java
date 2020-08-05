package com.uvaan.sampleapi.exception;

import java.util.List;

import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

public class SampleException extends RuntimeException {

	private static final long serialVersionUID = 7471337251203479522L;
	private String errorMessage;

	public SampleException() {
		super();
	}

	public SampleException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public SampleException(List<ObjectError> errorList) {
		for (ObjectError error : errorList) {
			if (error instanceof FieldError) {
				FieldError field = (FieldError) error;
				if (errorMessage == null) {
					errorMessage = field.getField() + " " + field.getDefaultMessage() + " ,";
				} else {
					errorMessage = errorMessage + field.getField() + " " + field.getDefaultMessage() + " ,";
				}
			}
		}
		errorMessage = errorMessage.substring(0, errorMessage.length() - 2);
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}