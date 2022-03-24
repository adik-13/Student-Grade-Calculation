package com.mile1.exception;

@SuppressWarnings("serial")
public class NullMarksArrayException extends Exception {
	public NullMarksArrayException() {
	}
	public String toString() {
		return "mark array is null";
	}
}
