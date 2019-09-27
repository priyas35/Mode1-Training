package com.hcl.hotel;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class HotelCRUD {
	
	public String insertRoom(Room room){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(room);
		t.commit();
		return "inserted";
		
	}
	public String  generateRoomId(){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("select max(RoomID) from Room");
		String rid="R001";
		List<String> lst=q.list();
		String rb="";
		
			if(lst.get(0)==null) {
				rid="R001";
			}
			else {
				rb=lst.get(0);
				int id=Integer.parseInt(rb.substring(1));
				id++;
				 String formatted = String.format("%03d", id);
				rid="R"+formatted;

			}
			
			
		return rid;
	}

}
