package com.fms.model.facilityuse;

import com.fms.model.facility.IRoom;

public class FacilitySchedule implements IFacilitySchedule {
	
	@Override
	public String toString() {
		return "FacilitySchedule [room=" + room + ", user=" + user + ", interval=" + interval + "]";
	}

	private IRoom room;
	private IUser user;
	private int interval;
	
	@Override
	public void assignFacilityToUse(IRoom room, IUser user) {
		

	}

	@Override
	public void vacateFacility(IRoom room) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isInUseDuringInterval(IRoom room, int interval) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double calcUsageRate(IRoom room) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double listActualUsage(IRoom room) {
		// TODO Auto-generated method stub
		return 0;
	}

}
