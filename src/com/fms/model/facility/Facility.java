package com.fms.model.facility;

import java.util.List;

import com.fms.model.facilityinspection.IInspection;
import com.fms.model.facilitymaintenance.IFacilityMaintenance;

public class Facility implements IFacility {
	
	private IFacilityDetail facilitydetail;
	private List<IBuilding> buildings;
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

	@Override
	public void setFacilityMaintenance(IFacilityMaintenance facilitymaintenance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IFacilityMaintenance getFacilityMaintenance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInspection(IInspection inspection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IInspection getInspection() {
		// TODO Auto-generated method stub
		return null;
	}


}
