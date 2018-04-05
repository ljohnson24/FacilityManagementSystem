package com.fms.model.facility;

public class BuildingDetail implements IBuildingDetail {
	private String buildingname;
	private String buildingaddress;
	private int buildingphone;

	public String toString() {
		return "BuildingDetail("+"Name:"+buildingname+", Address:"+buildingaddress+", Phone:"
				+buildingphone+")";
	}
	public BuildingDetail(String buildingname, String buildingaddress, int buildingphone) {
		this.buildingname = buildingname;
		this.buildingaddress = buildingaddress;
		this.buildingphone = buildingphone;
	}
	public String getBuildingName() {
		
		return this.buildingname;
	}

	
	public void setBuildingName(String buildingname) {
		this.buildingname = buildingname;

	}

	
	public String getBuildingAddress() {
		
		return  this.buildingaddress;
	}

	
	public void setBuildingAddress(String buildingaddress) {
		this.buildingaddress = buildingaddress;

	}

	
	public int getBuildingPhone() {
		
		return this.buildingphone;
	}

	
	public void setBuildingPhone(int buildingphone) {
		this.buildingphone = buildingphone;

	}

}
