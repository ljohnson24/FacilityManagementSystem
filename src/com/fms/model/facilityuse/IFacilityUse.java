package com.fms.model.facilityuse;

import java.util.List;
import com.fms.model.facilityinspection.*;
import com.fms.model.facility.*;

public interface IFacilityUse {
	void addUser(IUser user);
	void removeUser(IUser user);
	void assignFacilityToUse(IRoom room, IUser user);
	void vacateFacility(IRoom room);
	boolean isInUseDuringInterval(IRoom room, int interval);
	double calcUsageRate(IRoom room);
	double listActualUsage(IRoom room);
}
