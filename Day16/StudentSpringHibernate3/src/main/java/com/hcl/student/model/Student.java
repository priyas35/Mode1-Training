package com.hcl.student.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Student")
public class Student implements Serializable {
	
	
	private static final long serialVersionUID = -4020171395277060445L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private int rollNum;
	
	@Column
	private String sName;
	
	@Column
	private int age;
	
	@Column
	private String gender;
	
	@Column
	private String country;
	
	@Column
	private Date dateOfJoin;
	
	@Column
	private float finalScore;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	public int getRollNum() {
		return rollNum;
	}


	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}


	
	
	public String getsName() {
		return sName;
	}
	
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getGender() {
		return gender;
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getCountry() {
		return country;
	}
	
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	
	
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
	
	public float getFinalScore() {
		return finalScore;
	}
	
	
	public void setFinalScore(float finalScore) {
		this.finalScore = finalScore;
	}
	
	
	

}
