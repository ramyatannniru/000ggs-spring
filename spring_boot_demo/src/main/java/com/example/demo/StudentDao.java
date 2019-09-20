package com.example.demo;

import java.util.List;



public interface StudentDao {
	
	public void createNewStudent(Student st);
	 public List<Student> getAllStudents();
}