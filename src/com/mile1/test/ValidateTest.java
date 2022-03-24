package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

class ValidateTest {
	
	StudentReport sr = new StudentReport();
	@Test
	void testValidate() {
		Student st = new  Student(null, new int []{75,35,95});
		
		NullNameException thrown = assertThrows(
		           NullNameException.class,
		           () -> sr.validate(st),
		           "Expected NullNameException() to throw, but it didn't"
		    );
	}
	@Test
	void testValidate1() {
		Student st = null;
		
		NullStudentObjectException thrown = assertThrows(
		           NullStudentObjectException.class,
		           () -> sr.validate(st),
		           "Expected NullStudentObjectException to throw, but it didn't"
		    );
		
	}
	@Test
	void testValidate2() {
		Student st = new  Student("Adik",null);
		
		NullMarksArrayException thrown = assertThrows(
		           NullMarksArrayException.class,
		           () -> sr.validate(st),
		           "Expected NullMarksArrayException to throw, but it didn't"
		    );
		
	}

}
