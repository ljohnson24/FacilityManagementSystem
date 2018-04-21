package com.fms.model.facility;

public interface IRoom {
	public String getRoomID();
	public void setRoomID(String roomid);
	public int getRoomCapacity();
	public void setRoomCapacity(int roomcapacity);
	public double getRoomCost();
	public void setRoomCost(double roomcost);
	public String getRoomType();
	public void setRoomType(String roomtype);
	public int getRoomPhone();
	public void setRoomPhone(int roomphone);
	public void occupyRoom();
	public void vacateRoom();
	public boolean getRoomStatus();
	
	}

}
