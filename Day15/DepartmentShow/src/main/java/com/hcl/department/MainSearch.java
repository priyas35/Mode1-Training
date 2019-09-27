package com.hcl.department;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSearch {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DataQueryDao d=(DataQueryDao) ctx.getBean("myDao");
		d.deptSearch(3);
		
	}


}
