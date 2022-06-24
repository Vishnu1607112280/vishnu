package com.zensar.springbootdemo.StudentException;

public class StudentAlreadyExistsException extends RuntimeException {

	private String message;

	public StudentAlreadyExistsException() {
		super();

	}
}