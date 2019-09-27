package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmploySearch {
    public static void main(String[] args) {
		int empno=2;
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ where Empno="+empno);
		List<Employ> lstemploy=q.list();
		Employ e=lstemploy.get(0);
		if(e!=null){
			System.out.println("Name " +e.getName());
			System.out.println("Dept "+e.getDept());
			System.out.println("Desig "+e.getDesig());
			System.out.println("Salary "+e.getBasic());
		}else{
			System.out.println("Record Not Found");
		}
		
	}	

}
