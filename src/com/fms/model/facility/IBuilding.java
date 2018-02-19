package com.fms.model.facility;

public interface IBuilding {
	
	public String getBuildingName();
	public void setBuildingName(String buildingname);
	public String getBuildingAddress();
	public void setBuildingAddress(String buildingaddress);
	public int getBuildingPhone();
	public void setBuildingPhone(int buildingphone);
	public void addLevel(ILevel level);
	public void removeLevel(ILevel level);

}
