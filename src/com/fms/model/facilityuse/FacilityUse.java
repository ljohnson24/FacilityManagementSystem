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

	
	public void addUser(IUser user) {
		
		this.users.add(user);
	}

	
	public void removeUser(IUser user) {
		
		this.users.remove(user);
	}

	
	public void setFacility(IFacility facility) {
		this.facility = facility;
	}

	
	public IFacility getFacility() {
		
		return facility;
	}

	
	public void addInspection(IInspection inspection) {
		
		this.inspections.add(inspection);
	}

	public void removeInspection(IInspection inspection) {
		
		this.inspections.remove(inspection);
	}

	public List<IInspection> listInspection() {
		 
		return inspections;
	}

	
	public void assignFacilityToUse(IRoom room, IUser user) {
		// TODO Auto-generated method stub
		
	}

	
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
	
	@Override
	public String toString() {
		return "FacilityUse [users=" + users + ", facility=" + facility + ", facilityschedule=" + facilityschedule
				+ ", inspections=" + inspections + "]";
	}

}
