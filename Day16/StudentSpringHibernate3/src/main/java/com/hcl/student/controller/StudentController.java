package com.hcl.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.student.model.Student;
import com.hcl.student.service.StudentService;

@Controller
public class StudentController {

	private static final Logger logger = Logger
			.getLogger(StudentController.class);

	public StudentController() {
		System.out.println("StudentController()");
	}

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Student> listStudent = studentService.getAllStudents();
		model.addObject("liststudent", listStudent);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newStudent", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Student student = new Student();
		model.addObject("student", student);
		model.setViewName("StudentForm");
		return model;
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		if (student.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			studentService.addStudent(student);
		} else {
		studentService.updateStudent(student);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public ModelAndView deleteStudent(HttpServletRequest request) {
		int rollNum = Integer.parseInt(request.getParameter("rollNum"));
		studentService.deleteStudent(rollNum);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int rollNum = Integer.parseInt(request.getParameter("rollNum"));
		Student student = studentService.getStudent(rollNum);
		ModelAndView model = new ModelAndView("studentForm");
		model.addObject("student", student);

		return model;
	}

}