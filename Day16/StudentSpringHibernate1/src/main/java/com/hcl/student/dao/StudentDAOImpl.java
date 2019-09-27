package com.hcl.student.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.student.model.HibernateUtil;
import com.hcl.student.model.Student;
import com.jwt.model.Employee;

public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addStudent(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);

	}

	/*public String addStudent(Student student) {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(student);
		t.commit();
		return "Added";
	}

	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student searchStudent(int rollNum) {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Student where rollNum="+rollNum);
		List<Student> lststudent=q.list();
		Student student=null;
		if(lststudent.size() != 0){
			student =lststudent.get(0);
		}
		return student;
	}
*/
	
	
	

}
