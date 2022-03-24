package com.mile1.exception;

@SuppressWarnings("serial")
public class NullNameException extends Exception{
	public NullNameException() {
	}
	public String toString() {
		return "name is null";
	}
}
