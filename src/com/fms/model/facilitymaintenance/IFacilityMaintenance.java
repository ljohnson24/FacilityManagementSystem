package com.fms.model.facilitymaintenance;

import java.util.List;

import com.fms.model.facility.*;

public interface IFacilityMaintenance {
	void requestRoomMaintenance(IRoom room);
	List<IRoom> getFacilityMaintenanceRequestList();

}
