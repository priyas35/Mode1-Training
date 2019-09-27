package com.hcl.hotel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room")
public class Room {
	
	private String RoomID;
	private String Type;
	private String Status;
	private int CostPerDay;
	
	@Id
	@Column(name="roomID")
	public String getRoomID() {
		return RoomID;
	}
	
	@Column(name="roomID")
	public void setRoomID(String roomID) {
		RoomID = roomID;
	}
	
	@Column(name="Type")
	public String getType() {
		return Type;
	}
	
	@Column(name="Type")
	public void setType(String type) {
		Type = type;
	}
	
	@Column(name="Status")
	public String getStatus() {
		return Status;
	}
	
	@Column(name="Status")
	public void setStatus(String status) {
		Status = status;
	}
	
	@Column(name="CostPerDay")
	public int getCostPerDay() {
		return CostPerDay;
	}
	
	@Column(name="CostPerDay")
	public void setCostPerDay(int costPerDay) {
		CostPerDay = costPerDay;
	}
	
	
	
}
