package com.fms.model.facility;

public class Room implements IRoom {
	private String roomid;
	private int roomcapacity;
	private double roomcost;
	private String roomtype;
	private int roomphone;
	private boolean roomstatus;
	private ITimeSlot timeslot;

	
	public ITimeSlot getTimeSlot() {
		return timeslot;
	}

	public void setTimeslot(ITimeSlot timeslot) {
		this.timeslot = timeslot;
	}

	public Room() {
		
	}
	
	public Room (String roomid, int roomcapacity, double roomcost, String roomtype, int roomphone) {
		this.roomid = roomid;
		this.roomcapacity = roomcapacity;
		this.roomcost = roomcost;
		this.roomtype = roomtype;
		this.roomphone = roomphone;
		this.roomstatus = false;
		this.timeslot = new TimeSlot(5);
		
	}
	
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

	
	public void setRoomCost(double roomcost) {
		
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
	
	public void occupyRoom() {
		this.roomstatus = true;
	}
	
	public void vacateRoom() {
		this.roomstatus = false;
	}
	
	public boolean getRoomStatus() {
		return this.roomstatus;
	}
	
	public void setRoomStatus(boolean roomstatus) {
		this.roomstatus = roomstatus;
	}
	
	@Override
	public String toString() {
		return "Room(ID:"+roomid+", Capacity:"+roomcapacity+", Phone:"+roomphone+", Status:"
				+roomstatus+")";
	}

}
