package com.hcl.college;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class CollegeCRUD {
	
	public String insertSubject(Subject subject){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(subject);
		t.commit();
		return "inserted";
		
	}
	
	
	
	public List<String> instructorList(){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("select distinct instructor from Subject");
		List<String> lst=q.list();
		return lst;
	}
	
	
	public List<String> subjectList(String instructor){
		
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("select distinct subject from Subject where instructor='"+instructor+"'");
		List<String> lst=q.list();
		return lst;
	}
	
	public String  generateFId(){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("select max(fid) from FeedBack");
		String fid="C001";
		List<String> lst=q.list();
		String fb="";
		
			if(lst.get(0)==null) {
				fid="C001";
			}
			else {
				fb=lst.get(0);
				int id=Integer.parseInt(fb.substring(1));
				id++;
				 String formatted = String.format("%03d", id);
				fid="C"+formatted;

			}
			
			
		return fid;
	}
	
	public String insertFeedBack(FeedBack feedback){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(feedback);
		t.commit();
		return "Record Inserted...";
		
	}
	
public List<FbResult> feedbackList(String instructor,String subject){
		
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery(" select fbvalue,count(*) from FeedBack "
				+ " where instructor='" +instructor+ "' and subject='" +subject +"' "
				+ " group by fbvalue");
		
		List lst=q.list();
		List<FbResult> list=new ArrayList<FbResult>();
		FbResult res=null;
		for (Object ob : lst) {
			Object[] row=(Object[])ob;
			res=new FbResult();
			res.setFbValue(row[0].toString());
			res.setCount(Integer.parseInt(row[1].toString()));
			System.out.println(row[0] + "  " +row[1]);
			list.add(res);
		}
		return list;
	}

}
