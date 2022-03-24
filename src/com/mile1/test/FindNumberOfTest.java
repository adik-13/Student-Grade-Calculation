package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;

class FindNumberOfTest {
	Student s[] = new Student[3];
	StudentService ss = new StudentService();

	@Test
	void testFindNumberofNullMarksArray() {
		s[0] = new Student(null, new int []{85,75,95});
		assertEquals(1, ss.findNumberOfNullName(s));
	}

	@Test
	void testFindNumberOfNullName() {
		s[1] = new Student("Sekar", null);
		assertEquals(1, ss.findNumberofNullMarksArray(s));
	}

	@Test
	void testFindNumberOfNullObjects() {
		s[2] = null;
		assertEquals(3, ss.findNumberOfNullObjects(s));
	}

}
