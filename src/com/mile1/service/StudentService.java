package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	int c = 0;
	public int findNumberofNullMarksArray(Student s[]) {
		if(s!=null) {
			for(int i=0;i<s.length;i++) {
				if(s[i]!=null) {
					if(s[i].getMarks() == null) {
						c++;
						return c;
					}
					
					}
				}
			}
		return c;
		
	}
	
	public int findNumberOfNullName(Student s[]) {
		if(s!=null) {
			for(int i=0;i<s.length;i++) {
				if(s[i]!=null) {
					if(s[i].getName() == null) {
						c++;
						return c;
					}
					
					}
				}
			}
		return c;
	}
	
	public int findNumberOfNullObjects(Student s[]) {
		c=0;
		if(s!=null) {
			for(int i=0;i<s.length;i++) {
			if(s[i]==null)
			{
				c++;
			}
				
		}}
		return c;
	}
}
