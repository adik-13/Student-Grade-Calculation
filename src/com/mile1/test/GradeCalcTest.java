package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;

class GradeCalcTest {
	StudentReport fg = new StudentReport();
	Student st[]= new Student[4];
	
	
	@Test
	void testFindGrades() {
		st[0]=new Student("Sekar", new int []{75,35,95});
		assertEquals("grade is A",fg.findGrades(st[0]));
	}
	@Test
	void testFindGrades2() {
		st[0]=new Student("Sekar", new int []{50,50,49});
		assertEquals("grade is C",fg.findGrades(st[0]));
	}
	@Test
	void testFindGrades3() {
		st[0]=new Student("Sekar", new int []{10,10,10});
		assertEquals("grade is F",fg.findGrades(st[0]));
	}

}
