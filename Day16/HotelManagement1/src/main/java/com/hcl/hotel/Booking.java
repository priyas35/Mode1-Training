package com.hcl.hotel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Booking")
public class Booking {
	 
	private String BookId;
	private String RoomID;
	private String CustName;
	private String City;
	private Date BookDate;
	private Date ChkDate;
	
	@Id
	@Column(name="BookId")
	public String getBookId() {
		return BookId;
	}
	
	@Column(name="BookId")
	public void setBookId(String bookId) {
		BookId = bookId;
	}
	
	@Column(name="RoomID")
	public String getRoomID() {
		return RoomID;
	}
	
	@Column(name="RoomID")
	public void setRoomID(String roomID) {
		RoomID = roomID;
	}
	
	@Column(name="CustName")
	public String getCustName() {
		return CustName;
	}
	
	@Column(name="CustName")
	public void setCustName(String custName) {
		CustName = custName;
	}
	
	@Column(name="City")
	public String getCity() {
		return City;
	}
	
	@Column(name="City")
	public void setCity(String city) {
		City = city;
	}
	
	@Column(name="BookDate")
	public Date getBookDate() {
		return BookDate;
	}
	
	@Column(name="BookDate")
	public void setBookDate(Date bookDate) {
		BookDate = bookDate;
	}
	
	@Column(name="ChkDate")
	public Date getChkDate() {
		return ChkDate;
	}
	
	@Column(name="ChkDate")
	public void setChkDate(Date chkDate) {
		ChkDate = chkDate;
	}
	
	
}
