package com.fms.model.facilityuse;

import java.util.List;
import java.util.ArrayList;
import com.fms.model.facility.IBuilding;
import com.fms.model.facility.IFacility;
import com.fms.model.facility.IRoom;

public class FacilityUse implements IFacilityUse {
	
	private List<IUser> users;
	private IFacility facility;

	public FacilityUse() {
		
	}
	public FacilityUse(IFacility facility) {
		this.users = new ArrayList<IUser>();
		this.facility = facility;
	}
	
	public void addUser(IUser user) {
		
		this.users.add(user);
	}

	
	public void removeUser(String userid) {
		for (IUser user:users) {
			if (user.getUserID() == userid) {
				this.users.remove(user);
			}
		}
	}

	
	public void setFacility(IFacility facility) {
		this.facility = facility;
	}

	
	public IFacility getFacility() {
		
		return facility;
	}

	
	public void assignFacilityToUse(String roomid, String userid) {
		for (IBuilding building:facility.getBuildings()) {
			for (IRoom room:building.getRooms()) {
				if (room.getRoomID() == roomid) {
					//if (room.getRoomStatus() == true){
						//System.out.println("Room is already in use, please choose a different room");
						//break;
					//}
					for(IUser user:users) {
						if (user.getUserID() == userid) {
							room.setRoomStatus(true);
							room.getTimeSlot().occupySlot(user);
						}
					}
				}
			}
		}
		
	}

	
	public void vacateFacility(String roomid) {
		for (IBuilding building:facility.getBuildings()) {
			for (IRoom room:building.getRooms()) {
				if (room.getRoomID() == roomid) {
					//if (room.getRoomStatus() == false){
						//System.out.println("Room is already vacant");
						//break;
					//}
					room.getTimeSlot().vacateSlot(0);
					room.vacateRoom();
					
				}
			}
		}
		
	}

	
	public boolean isInUseDuringInterval(String roomid, int interval) {
		for (IBuilding building:facility.getBuildings()) {
			for (IRoom room:building.getRooms()) {
				if (room.getRoomID() == roomid) {
					if (room.getRoomStatus() == false){
						System.out.println("Room is already vacant");
						return true;
					}
				}
			}
		}
		return false;
	}

	
	public int calcUsageRate(String roomid) {
		for (IBuilding building:facility.getBuildings()) {
			for (IRoom room:building.getRooms()) {
				if (room.getRoomID() == roomid) {
					
						return room.getTimeSlot().getOccupiedSlotsCount();
				}
			}
		}
		return 0;
	}

	
	public List<IUser> listActualUsage(String roomid) {
		for (IBuilding building:facility.getBuildings()) {
			for (IRoom room:building.getRooms()) {
				if (room.getRoomID() == roomid) {
					if (room.getRoomStatus() == true){
						
						return room.getTimeSlot().getOccupiedSlots();
					}
				}
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "FacilityUse [users=" + users + ", facility=" + facility +  "]";
	}

}
