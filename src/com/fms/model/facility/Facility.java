package com.fms.model.facility;

import java.util.ArrayList;

public class Facility implements IFacility {
	
	private IFacilityDetail facilitydetail;
	private ArrayList<IBuilding> buildings;
	private String facilityid;
	

	public void setFacilityDetail (IFacilityDetail facilitydetail) {
		
		this.facilitydetail = facilitydetail;
	}
	
	public IFacilityDetail getFacilityDetail() {
		
		return facilitydetail;
	}
	
	public String getFacilityID() {
		
		return facilityid;
	}

	
	public void setFacilityID(String facilityid) {
		
		this.facilityid = facilityid;
	}
	
	public void addBuilding(IBuilding building){
		
		this.buildings.add(building);
	}
	
	public void removeBuilding(IBuilding building) {
		
		this.buildings.remove(building);
	}


}
