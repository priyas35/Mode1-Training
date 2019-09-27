package com.hcl.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.student.dao.StudentDAO;
import com.hcl.student.model.Student;

@Service
public class StudentManagerImpl implements StudentManager{
	
	@Autowired
	StudentDAO dao;

	public String addStudent(Student student) {
		
		return dao.addStudent(student);
	}

	
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}


	

	public Student searchStudent(int rollNum) {
		return dao.searchStudent(rollNum);
	}

}
