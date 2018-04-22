package com.fms.model.facility;

import java.util.ArrayList;
import java.util.List;
import com.fms.model.facilityinspection.*;
import com.fms.model.facilitymaintenance.*;
import com.fms.model.facilityuse.*;

public class Facility implements IFacility {
	
	private IFacilityDetail facilitydetail;
	private List<IBuilding> buildings;
	private String facilityid;
	private IFacilityMaintenance facilitymaintenance;
	private IInspection inspection;
	private IFacilitySchedule facilityschedule;
	
	@Override
	public String toString() {
		return "Facility(ID:"+facilityid+", "+facilitydetail+", NumOfBldg"+buildings.size()+")";
	}
	public Facility(IFacilityDetail facilitydetail, List<IBuilding> buildings, String facilityid, IFacilityMaintenance facilitymaintenance, IInspection inspection) {
		this.facilitydetail = facilitydetail;
		this.buildings = new ArrayList<>();
		this.facilityid = facilityid;
		this.facilitymaintenance = facilitymaintenance;
		this.inspection = inspection;
	}
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

	public List<IBuilding> getBuildings() {
		return this.buildings;
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
