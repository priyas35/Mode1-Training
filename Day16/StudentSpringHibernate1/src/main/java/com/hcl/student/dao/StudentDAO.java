package com.hcl.student.dao;


import com.hcl.student.model.Student;

public interface StudentDAO {
	public String addStudent(Student student);
	public Student searchStudent(int rollNum);
	public String updateStudent(Student student);
	

}
