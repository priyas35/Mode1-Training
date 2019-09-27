package com.hcl.hib;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Main {
	
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
		q.setFirstResult(0);
		q.setMaxResults(5);
		List<Employ> lstEmploy=q.list();
		Criteria c=s.createCriteria(Employ.class);
		c.add(Restrictions.gt("basic", 8000));
		List list2=c.list();
		
		
		Criteria c3=s.createCriteria(Employ.class);
		c3.setProjection(Projections.property("name"));
		List<String> list4=c3.list();
		for(String e:list4){
			System.out.println("Name:" +e);
		}
		for (Object employ : list2) {
			Employ e=(Employ)employ;
			System.out.println("Empno " +e.getEmpno());
			System.out.println("Name " +e.getName());
			System.out.println("Dept "+e.getDept());
			System.out.println("Desig "+e.getDesig());
			System.out.println("Salary "+e.getBasic());
			System.out.println("-------------");
}
		Criteria c2=s.createCriteria(Employ.class);
		c.addOrder(Order.asc("basic"));
		List list3=c2.list();
		
		for (Object employ : list3) {
			Employ e=(Employ)employ;
			System.out.println("Empno " +e.getEmpno());
			System.out.println("Name " +e.getName());
			System.out.println("Dept "+e.getDept());
			System.out.println("Desig "+e.getDesig());
			System.out.println("Salary "+e.getBasic());
			System.out.println("-------------");
}

		for (Employ employ : lstEmploy) {
			Employ e=(Employ)employ;
			System.out.println("Empno " +e.getEmpno());
			System.out.println("Name " +e.getName());
			System.out.println("Dept "+e.getDept());
			System.out.println("Desig "+e.getDesig());
			System.out.println("Salary "+e.getBasic());
			System.out.println("-------------");
}
		
		
	}

}