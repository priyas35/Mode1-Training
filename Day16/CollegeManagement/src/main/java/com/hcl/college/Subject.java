package com.hcl.college;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjects")
public class Subject {
	private int subId;
	
	private int year;
	private String instructor;
	private String subject;
	private int theory;
	private int practical;
	
	@Id
	@Column(name="subId")
	
	public int getSubId() {
		return subId;
	}
	@Column(name="subId")
	public void setSubId(int subId) {
		this.subId = subId;
	}

	

	@Column(name="year")
	public int getYear() {
		return year;
	}
	
	@Column(name="year")
	public void setYear(int year) {
		this.year = year;
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
	
	@Column(name="theory")
	public int getTheory() {
		return theory;
	}
	
	@Column(name="theory")
	public void setTheory(int theory) {
		this.theory = theory;
	}
	
	@Column(name="practical")
	public int getPractical() {
		return practical;
	}
	
	@Column(name="practical")
	public void setPractical(int practical) {
		this.practical = practical;
	}
	
	

}
