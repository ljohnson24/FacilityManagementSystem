package com.fms.model.facilityuse;

import java.util.List;
import com.fms.model.facility.*;

public interface IFacilityUse {
	void addUser(IUser user);
	void removeUser(IUser user);
	void setFacility(IFacility facility);
	IFacility getFacility();
	void addInspection(IInspection inspection);
	void removeInspection(IInspection inspection);
	List<IInspection> listInspection();
}
