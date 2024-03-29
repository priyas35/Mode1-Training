package com.hcl.project;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	static List<Student> lststudent=null;
	static{
		lststudent =new ArrayList<Student>();
		
	}
	public String addStudentDao(Student student){
		lststudent.add(student);
		return "student created successfully";
	}
	public Student searchStudentDao(int sno){
       Student objstudent=null;
       for (Student student : lststudent) {
		if(student.getSno() == sno){
			objstudent =student;
		}
	}

		return objstudent;
	}
	public List<Student> showStudentDao(){
		return lststudent;
	}
	public String updateStudentDao(Student objstudent) {
		Student student=searchStudentDao(objstudent.getSno());
		if(student!=null){
			for (Student s : lststudent) {
				if(s.getSno() == objstudent.getSno()){
					s.setName(objstudent.getName());
					s.setCity(objstudent.getCity());
					s.setCgp(objstudent.getCgp());
				}
			}
			return "record updated";
			
		}else{
			return "student not found";
		}
		
		
	}
         public String deleteStudentNameDao(int sno){
        	 Student student=searchStudentDao(sno);
        	 if(student != null){
        		 lststudent.remove(student);
        		 return "student removed";
        	 }else{
        		 return "student not found";
        	 }
         }
         
}
