package com.hcl.student.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Student")
public class Student {
	private int rollNum;
	
	private String sName;
	private int age;
	private String gender;
	private String country;
	private Date dateOfJoin;
	private float finalScore;
	@Id
	@Column(name="rollNum")
	public int getRollNum() {
		return rollNum;
	}


	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}


	
	@Column(name="sName")
	public String getsName() {
		return sName;
	}
	
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	@Column(name="age")
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Column(name="gender")
	public String getGender() {
		return gender;
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Column(name="country")
	public String getCountry() {
		return country;
	}
	
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Column(name="dateOfJoin")
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	
	
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
	@Column(name="finalScore")
	public float getFinalScore() {
		return finalScore;
	}
	
	
	public void setFinalScore(float finalScore) {
		this.finalScore = finalScore;
	}
	
	
	

}
