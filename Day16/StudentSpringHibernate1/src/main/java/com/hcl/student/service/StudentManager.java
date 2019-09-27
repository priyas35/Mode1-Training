package com.hcl.student.service;

import java.util.List;

import com.hcl.student.model.Student;
import com.jwt.model.Employee;

public interface StudentManager {
	public void addEmployee(Student employee);

	public List<Student> getAllEmployees();

	
}
