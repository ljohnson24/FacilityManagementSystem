package com.fms.model.facilityuse;

import java.util.List;
import com.fms.model.facility.IFacility;

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

	@Override
	public void removeInspection(IInspection inspection) {
		
		this.inspections.remove(inspection);
	}

	@Override
	public List<IInspection> listInspection() {
		// 
		return inspections;
	}

}
