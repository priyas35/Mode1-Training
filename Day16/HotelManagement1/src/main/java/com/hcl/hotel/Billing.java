package com.hcl.hotel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Billing")
public class Billing {

	private String BookID;
	private String RoomID;
	private int NoOfDays;
	private int BillAmt;
	
	@Id
	@Column
	public String getBookID() {
		return BookID;
	}
	public void setBookID(String bookID) {
		BookID = bookID;
	}
	public String getRoomID() {
		return RoomID;
	}
	public void setRoomID(String roomID) {
		RoomID = roomID;
	}
	public int getNoOfDays() {
		return NoOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		NoOfDays = noOfDays;
	}
	public int getBillAmt() {
		return BillAmt;
	}
	public void setBillAmt(int billAmt) {
		BillAmt = billAmt;
	}
	
	
	

}
