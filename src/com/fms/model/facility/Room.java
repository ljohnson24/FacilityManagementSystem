package com.fms.model.facility;

public class Room implements IRoom {
	private String roomid;
	private int roomcapacity;
	private int roomcost;
	private String roomtype;
	private int roomphone;

	
	public String getRoomID() {
		
		return roomid;
	}

	public void setRoomID(String roomid) {
		
		this.roomid = roomid;
	}

	
	public int getRoomCapacity() {
		
		return roomcapacity;
	}

	
	public void setRoomCapacity(int roomcapacity) {
		
		this.roomcapacity = roomcapacity;
	}

	
	public double getRoomCost() {
		
		return roomcost;
	}

	
	public void setRoomCost(int roomcost) {
		
		this.roomcost = roomcost;
	}

	
	public String getRoomType() {
		
		return roomtype;
	}

	
	public void setRoomType(String roomtype) {
		
		this.roomtype = roomtype;
	}

	
	public int getRoomPhone() {
		
		return roomphone;
	}

	
	public void setRoomPhone(int roomphone) {
		
		this.roomphone = roomphone;
	}

}
