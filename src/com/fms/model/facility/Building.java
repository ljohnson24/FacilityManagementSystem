package com.fms.model.facility;

import java.util.ArrayList;

public class Building implements IBuilding {
	
	private String buildingname;
	private String buildingaddress;
	private int buildingphone; 
	private ArrayList<IRoom> rooms;
	
	
	public String getBuildingName() {
		
		return buildingname;
	}

	
	public void setBuildingName(String buildingname) {
		
		this.buildingname = buildingname;
	}

	
	public String getBuildingAddress() {
		
		return buildingaddress;
	}

	
	public void setBuildingAddress(String buildingaddress) {
		
		this.buildingaddress = buildingaddress;
	}

	
	public int getBuildingPhone() {
		
		return buildingphone;
	}

	
	public void setBuildingPhone(int buildingphone) {
		
		this.buildingphone = buildingphone;
	}
	
	public void addRoom(IRoom room) {
		
		this.rooms.add(room);
	}
	
	public void removeRoom(IRoom room) {
		
		this.rooms.remove(room);
	}

}
