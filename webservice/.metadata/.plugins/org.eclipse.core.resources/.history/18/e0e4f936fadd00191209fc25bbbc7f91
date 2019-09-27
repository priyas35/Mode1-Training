package com.hcl.employ.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hcl.employ.dao.EmployeeDAOImpl;
import com.hcl.employ.model.Employee;


@Path("/employees")
@Produces(MediaType.APPLICATION_XML)
public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDAOImpl	employeeDAO=new EmployeeDAOImpl();
	@GET
	@Path("/getAll")
	public Employee[] getAllEmployees() {
		List<Employee> ids = employeeDAO.getAllEmployees();
		Employee[] e = new Employee[ids.size()];
		int i=0;
		for(Employee id : ids){
			e[i] = (Employee) employeeDAO.getAllEmployees();
			i++;
		}
		return e;
	}

}
