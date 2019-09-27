package com.hcl.student.service;

import java.util.List;

import com.hcl.student.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);

	public List<Student> getAllStudents();

	public Student updateStudent(Student student);
	
	public void deleteStudent(Integer rollnum);
	
	public Student getStudent(int rollNum);
	

}
