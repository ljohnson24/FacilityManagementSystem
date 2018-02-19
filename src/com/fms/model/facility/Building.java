package com.fms.model.facility;

import java.util.ArrayList;

public class Building implements IBuilding {
	
	private String buildingname;
	private String buildingaddress;
	private int buildingphone; 
	private ArrayList<ILevel> levels;
	
	
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
	
	public void addLevel(ILevel level) {
		
		this.levels.add(level);
	}
	
	public void removeLevel(ILevel level) {
		
		this.levels.remove(level);
	}

}
