package com.fms.model.facility;

public interface IBuilding {
	

	String getBuildingID();
	void setBuildingID(String buildingid);
	IBuildingDetail getBuildingDetail();
	void setBuildingDetail(IBuildingDetail buildingdetail);
	void addRoom(IRoom room);
	void removeRoom(IRoom room);

}
