package com.fms.model.facility;

public interface IFacility {
	String getFacilityID();
	void setFacilityID(String facilityid);
	IFacilityDetail getFacilityDetail();
	void setFacilityDetail(IFacilityDetail facilitydetail);
	void addBuilding(IBuilding building);
	void removeBuilding(IBuilding building);
	void setFacilityMaintenance(IFacilityMaintenance facilitymaintenance);
	IFacilityMaintenance getFacilityMaintenance();
	void setInspection(IInspection inspection);
	IInspection getInspection();
	
}
