package com.hcl.hib;

import java.util.Iterator;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainInsert {
public static void main(String[] args) {
	Employ e=new Employ();
	Scanner sc=new Scanner(System.in);
	
	Configuration cfg=new AnnotationConfiguration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	int empno=0;
	Query q=s.createQuery("SELECT max(empno) from Employ ");
	for(Iterator it=q.iterate();it.hasNext();){
		empno=(Integer)it.next();
	}
	Employ emp=new Employ();
	empno++;
	emp.setEmpno(empno);
	System.out.println(empno);
	String name,dept,desig;
	int basic;
	System.out.println("name of the employ");
	emp.setName(sc.nextLine());
	System.out.println("department ");
	emp.setDept(sc.nextLine());
	System.out.println("designation ");
	emp.setDesig(sc.nextLine());
	System.out.println("basic ");
	emp.setBasic(Integer.parseInt(sc.nextLine()));
	
	Transaction t=s.beginTransaction();
	s.save(emp);
	t.commit();
	System.out.println("employ inserted");
	
}

}
