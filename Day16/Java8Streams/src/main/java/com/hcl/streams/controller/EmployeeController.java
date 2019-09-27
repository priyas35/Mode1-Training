package com.hcl.streams.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.streams.model.Employee;
import com.hcl.streams.service.EmployeeService;

@Controller
public class EmployeeController {

	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);

	public EmployeeController() {
		System.out.println("EmployeeController()");
	}

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);
		model.addObject("searchEmployee", new Employee());
		model.setViewName("home");
		return model;
	}
	
    @RequestMapping(value = "/Search" ,method=RequestMethod.POST)
	public ModelAndView searchEmployee(ModelAndView model ,@ModelAttribute Employee searchEmployee) throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployees();
        if(searchEmployee.getBand() != '0'){
        	
        
		listEmployee=listEmployee.stream().filter((var)->var.getEmpName().startsWith(searchEmployee.getEmpName()) & var.getBand()==searchEmployee.getBand()&var.getSalary()>searchEmployee.getSalary()).collect(Collectors.toList());
        }else{
        	listEmployee=listEmployee.stream().filter((var)->var.getEmpName().startsWith(searchEmployee.getEmpName()) &var.getSalary()>searchEmployee.getSalary()).collect(Collectors.toList());
        }
		model.addObject("searchEmployee",searchEmployee );
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		
        	return model;	
        
		
        
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.setViewName("EmployeeForm");
		return model;
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		if (employee.getEmpNo() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			employeeService.addEmployee(employee);
		} else {
			employeeService.updateEmployee(employee);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("empNo"));
		employeeService.deleteEmployee(employeeId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("empNo"));
		Employee employee = employeeService.getEmployee(employeeId);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("employee", employee);

		return model;
	}
	
	@ModelAttribute("bandList")
	public Map<String, String> getCountryList() {
		Map<String, String> bandList = new HashMap<String, String>();
		bandList.put("C", "C");
		bandList.put("E", "E");
		bandList.put("M", "M");
		return bandList;
	}

}