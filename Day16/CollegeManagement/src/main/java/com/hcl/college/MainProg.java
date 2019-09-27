package com.hcl.college;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainProg {

	public static void main(String[] args) {
		String instructor="hari";
		String subject="PC3";
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery(" select fbvalue,count(*) from FeedBack "
				+ " where instructor='" +instructor+ "' and subject='" +subject +"' "
				+ " group by fbvalue");
		
		List lst=q.list();
		List<FbResult> list=new ArrayList<FbResult>();
		for (Object ob : lst) {
			Object[] row=(Object[])ob;
			System.out.println(row[0] + "  " +row[1]);
		}
		
	}
}
