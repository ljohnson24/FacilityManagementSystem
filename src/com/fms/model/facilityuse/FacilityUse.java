package com.fms.model.facilityuse;

import java.util.List;
import com.fms.model.facilityinspection.*;
import com.fms.model.facility.IFacility;
import com.fms.model.facility.IRoom;

public class FacilityUse implements IFacilityUse {
	
	private List<IUser> users;
	private IFacility facility;
	private IFacilitySchedule facilityschedule;
	private List<IInspection> inspections;

	@Override
	public void addUser(IUser user) {
		
		this.users.add(user);
	}

	@Override
	public void removeUser(IUser user) {
		
		this.users.remove(user);
	}

	@Override
	public void setFacility(IFacility facility) {
		this.facility = facility;
	}

	@Override
	public IFacility getFacility() {
		
		return facility;
	}

	@Override
	public void addInspection(IInspection inspection) {
		
		this.inspections.add(inspection);
	}

	public void removeInspection(IInspection inspection) {
		
		this.inspections.remove(inspection);
	}

	public List<IInspection> listInspection() {
		 
		return inspections;
	}

	@Override
	public void assignFacilityToUse(IRoom room, IUser user) {
		// TODO Auto-generated method stub
		
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
