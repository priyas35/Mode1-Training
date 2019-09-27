package com.hcl.department;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.department.DataInsertDao;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DataInsertDao d=(DataInsertDao) ctx.getBean("myDao");
		d.insertDepartment();
		System.out.println("record inserted");
		
	}

}
