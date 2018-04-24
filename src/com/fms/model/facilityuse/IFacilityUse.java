package com.fms.model.facilityuse;

import java.util.List;
import com.fms.model.facilityinspection.*;
import com.fms.model.facility.*;

public interface IFacilityUse {
	void addUser(IUser user);
	void removeUser(String userid);
	void assignFacilityToUse(String roomid, String userid);
	void vacateFacility(String roomid);
	boolean isInUseDuringInterval(String roomid, int interval);
	int calcUsageRate(String roomid);
	List<IUser> listActualUsage(String roomid);
	void setFacility(IFacility facility);
	
}
