package com.mile1.bean;

public class Student {
	String name;
	int marks[];
	String grade;
	
	public Student(){
	}
	public Student(String grade,int[] marks,String name) {
		this.grade = grade;
		this.marks = marks;
		this.name = name;
	}
	public Student(String name,int[] marks) {
		this.marks = marks;
		this.name = name;
	}
	public String getName() {
		return this.name;	
	}
	public String getGrade() {
		return this.grade;
	}
	public int[] getMarks() {
		return this.marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	


}
	
