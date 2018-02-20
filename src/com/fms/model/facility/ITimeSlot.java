package com.fms.model.facility;
import com.fms.model.facilityuse.*;

public interface ITimeSlot {
	void setOccupant(IUser user);
	void removeOccupant(IUser user);
	IUser getOccupant();
}
