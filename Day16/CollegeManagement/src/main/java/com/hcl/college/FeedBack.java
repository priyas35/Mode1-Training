package com.hcl.college;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
public class FeedBack {
	private String fid;
	private String studentName;
	private String instructor;
	private String subject;
	private String fbvalue;
	
	@Id
	@Column(name="fid")
	
	public String getFid() {
		return fid;
	}
	@Column(name="fid")
	public void setFid(String fid) {
		this.fid = fid;
	}
	
	@Column(name="studentName")
	public String getStudentName() {
		return studentName;
	}
	
	@Column(name="studentName")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Column(name="instructor")
	public String getInstructor() {
		return instructor;
	}
	
	@Column(name="instructor")
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	@Column(name="subject")
	public String getSubject() {
		return subject;
	}
	
	@Column(name="subject")
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Column(name="fbvalue")
	public String getFbvalue() {
		return fbvalue;
	}
	
	@Column(name="fbvalue")
	public void setFbvalue(String fbvalue) {
		this.fbvalue = fbvalue;
	}
	
	
	

}
