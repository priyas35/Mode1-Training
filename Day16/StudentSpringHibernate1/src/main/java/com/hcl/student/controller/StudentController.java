package com.hcl.student.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.student.model.Student;
import com.hcl.student.service.StudentManager;

@Controller
@RequestMapping(value="/")
public class StudentController {
	
	
	
	
	@RequestMapping(value="/home",method=RequestMethod.POST)
	public String home(Model model){
		model.addAttribute("student",new Student());
		return "addStudent";
	}
	
	@Autowired
	StudentManager mgr;
	
	@RequestMapping(value="/searchStudent",method=RequestMethod.POST)
	public String searchStudent(int rollNum,Model model){
		mgr.searchStudent(rollNum);
		return "searchStudent";
	}
	
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public String addStudent(Student student,Model model){
		mgr.addStudent(student);
		return "addStudent";
	}
	
	
	@RequestMapping(value="/updateStudent",method=RequestMethod.POST)
	public String updateStudent(Student student,Model model){
		mgr.updateStudent(student);
		return "updateStudent";
	}
	

  
}