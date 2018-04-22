package com.fms.model.facilitymaintenance;

import java.util.ArrayList;
import java.util.List;

import com.fms.model.facility.IRoom;

public class FacilityMaintenance implements IFacilityMaintenance {
	private List<IRoom> maintenancerequests;
	
	public FacilityMaintenance() {
		this.maintenancerequests = new ArrayList<IRoom>();
		
	}

	
	public void requestRoomMaintenance(IRoom room) {
		this.maintenancerequests.add(room);
		
	}

	
	public List<IRoom> getFacilityMaintenanceRequestList() {
		
		return maintenancerequests;
	}


	@Override
	public String toString() {
		return "FacilityMaintenance [maintenancerequests=" + maintenancerequests + "]";
	}

	
}
