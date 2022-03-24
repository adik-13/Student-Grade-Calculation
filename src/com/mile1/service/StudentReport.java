package com.mile1.service;
import com.mile1.exception.*;

import com.mile1.bean.Student;

public class StudentReport {
	public String findGrades(Student StudentObject) {
		int[] mark = StudentObject.getMarks();
		int sum=0;
		for(int i=0;i<StudentObject.getMarks().length;i++) 
		{
				if(mark[i]<35) {
					StudentObject.setGrade("F");
					return "grade is F";
				}
				else {
					sum=sum+mark[i];
				}
	    }
		if(sum<150)
			{StudentObject.setGrade("C");
			return "grade is C";}
		else if(sum<200)
			{StudentObject.setGrade("B");
			return "grade is B";}
		else if(sum<250)
			{StudentObject.setGrade("A");
			return "grade is A";}
		else
			StudentObject.setGrade("A+");
			return "grade is A+";
	
	}
	public String validate(Student s) throws NullNameException, 
	NullMarksArrayException, 
	NullStudentObjectException {
		if(s == null)
			throw new NullStudentObjectException();
		if(s.getName()==null)
			throw new NullNameException();
		else if(s.getMarks()==null)
			throw new NullMarksArrayException();
		else
			return "VALID";
		
	}
}
