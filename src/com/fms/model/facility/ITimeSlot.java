package com.fms.model.facility;
import java.util.List;
import com.fms.model.facilityuse.*;

public interface ITimeSlot {
	List<IUser> getOccupiedSlots();
	int getOccupiedSlotsCount();
	int getOpenSlotsCount();
	void occupySlot(IUser user);
	void vacateSlot(int slot);
	boolean getSlotStatus(int slot);
}
