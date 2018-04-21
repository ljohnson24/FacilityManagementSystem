package com.fms.model.facilityuse;

import com.fms.model.facility.IRoom;

public class FacilitySchedule implements IFacilitySchedule {
	
	private IRoom room;
	private IUser user;
	private int interval;
	
	@Override
	public void assignFacilityToUse(IRoom room, IUser user) {
		

	}

	@Override
	public void vacateFacility(IRoom room) {
		

	}

	@Override
	public boolean isInUseDuringInterval(IRoom room, int interval) {
		
		return false;
	}

	@Override
	public double calcUsageRate(IRoom room) {
		
		return 0;
	}

	@Override
	public double listActualUsage(IRoom room) {
		
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "FacilitySchedule [room=" + room + ", user=" + user + ", interval=" + interval + "]";
	}

}
