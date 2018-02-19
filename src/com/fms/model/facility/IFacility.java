package com.fms.model.facility;

public interface IFacility {
	public String getFacilityID();
	public void setFacilityID(String facilityid);
	public IFacilityDetail getFacilityDetail();
	public void setFacilityDetail(IFacilityDetail facilitydetail);
	public void addBuilding(IBuilding building);
	public void removeBuilding(IBuilding building);
}
