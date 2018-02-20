package com.fms.model.facilityuse;

import com.fms.model.facility.*;

public interface IFacilityUse {
	void addUser(IUser user);
	void removeUser(IUser user);
	void setFacility(IFacility facility);
	IFacility getFacility();
	IInspection listInspection();
}
