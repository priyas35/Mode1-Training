package com.hcl.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.student.dao.StudentDAO;
import com.hcl.student.model.Student;
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentDAO;
	
	@Transactional
	public void addStudent(Student student) {
		studentDAO.addStudent(student);
		
	}

	@Transactional
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

	public Student updateStudent(Student student) {
		return studentDAO.updateStudent(student);
	}
	
	@Transactional
	public void deleteStudent(Integer rollNum) {
		studentDAO.deleteStudent(rollNum);
		
	}

	public Student getStudent(int rollNum) {
		return studentDAO.getStudent(rollNum);
	}

}
