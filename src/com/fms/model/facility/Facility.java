package com.fms.model.facility;

import java.util.List;
import com.fms.model.facilityinspection.*;
import com.fms.model.facilitymaintenance.*;

public class Facility implements IFacility {
	
	private IFacilityDetail facilitydetail;
	private List<IBuilding> buildings;
	private String facilityid;
	private IFacilityMaintenance facilitymaintenance;
	private IInspection inspection;
	

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

	
	public void setFacilityMaintenance(IFacilityMaintenance facilitymaintenance) {
		this.facilitymaintenance = facilitymaintenance;
		
	}

	
	public IFacilityMaintenance getFacilityMaintenance() {
		
		return this.facilitymaintenance;
	}

	
	public void setInspection(IInspection inspection) {
		
		this.inspection = inspection;
	}

	
	public IInspection getInspection() {
		
		return this.inspection;
	}


}
