package com.fms.model.facilityuse;

import com.fms.model.facility.IRoom;

public interface IFacilitySchedule {
	void assignFacilityToUse(IRoom room, IUser user);
	void vacateFacility(IRoom room);
	boolean isInUseDuringInterval(IRoom room, int interval);
	double calcUsageRate(IRoom room);
	double listActualUsage(IRoom room);
}
