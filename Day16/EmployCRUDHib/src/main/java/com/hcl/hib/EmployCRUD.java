package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployCRUD {
	public List<Employ> showEmploy(){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
		List<Employ> lstemploy=q.list();
		return lstemploy;
	}
	 
	public Employ searchEmploy(int empno){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ where empno="+empno);
		List<Employ> lstemploy=q.list();
		Employ employ=null;
		if(lstemploy.size() != 0){
			employ =lstemploy.get(0);
		}
		return employ;
	}
	
	public String insertEmploy(Employ employ){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(employ);
		t.commit();
		return "employ inserted";
		
	}
	
	public String updateEmploy(Employ employ){
		Employ res=searchEmploy(employ.getEmpno());
		res.setName(employ.getName());
		res.setDept(employ.getDept());
		res.setDesig(employ.getDesig());
		res.setBasic(employ.getBasic());
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.update(res);
		t.commit();
		return "employ updated";
		
	}
	public String deleteEmploy(int empno){
		Employ res=searchEmploy(empno);
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.delete(res);
		t.commit();
		return "employ deleted";
	}

}
