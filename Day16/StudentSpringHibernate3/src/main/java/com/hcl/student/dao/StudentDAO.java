package com.hcl.student.dao;


import java.util.List;

import com.hcl.student.model.Student;

public interface StudentDAO {
	
	
	public void addStudent(Student student);

	public List<Student> getAllStudents();

	public Student updateStudent(Student student);
	
	public void deleteStudent(Integer rollNum);
	
	public Student getStudent(int rollNum);
	

}
