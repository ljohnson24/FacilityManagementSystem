package com.fms.model.facility;

public interface IRoom {
	 String getRoomID();
	 void setRoomID(String roomid);
	 int getRoomCapacity();
	 void setRoomCapacity(int roomcapacity);
	 double getRoomCost();
	 void setRoomCost(double roomcost);
	 String getRoomType();
	 void setRoomType(String roomtype);
	 int getRoomPhone();
	 void setRoomPhone(int roomphone);
	 void occupyRoom();
	 void vacateRoom();
	 boolean getRoomStatus();
	 ITimeSlot getTimeSlot();
	 void setRoomStatus(boolean roomstatus);
	 
}
