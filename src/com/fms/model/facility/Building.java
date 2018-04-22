package com.fms.model.facility;

import java.util.ArrayList;
import java.util.List;

public class Building implements IBuilding {
	
	private String buildingid;
	private IBuildingDetail buildingdetail;
	private List <IRoom> rooms;
	
	
	public Building(String buildingid, IBuildingDetail buildingdetail, List<IRoom> rooms) {
		this.buildingid = buildingid;
		this.buildingdetail = buildingdetail;
		this.rooms = new ArrayList<IRoom>();
	}

	public String getBuildingID() {
		return this.buildingid;
	}
	
	public void setBuildingID(String buildingid) {
		this.buildingid = buildingid;
	}
	
	public IBuildingDetail getBuildingDetail() {
		return this.buildingdetail;
	}
	
	public void setBuildingDetail(IBuildingDetail buildingdetail) {
		this.buildingdetail = buildingdetail;
	}
	
	public void addRoom(IRoom room) {
		
		this.rooms.add(room);
	}
	
	public void removeRoom(IRoom room) {
		
		this.rooms.remove(room);
	}
	
	public List<IRoom> getRooms(){
		return this.rooms;
	}
	
	@Override
	public String toString() {
		return "Building("+buildingid+buildingdetail+"NumOfRooms("+rooms.size()+"))";
	}

}
