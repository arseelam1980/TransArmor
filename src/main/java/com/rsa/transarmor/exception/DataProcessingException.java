package com.rsa.transarmor.exception;

public class DataProcessingException extends Exception {

	public DataProcessingException() {

	}

	public DataProcessingException(String message) {
		super(message);
	}

	public DataProcessingException(Throwable cause) {
		super(cause);
	}

	public DataProcessingException(String message, Throwable cause) {
		super(message, cause);
	}

}
