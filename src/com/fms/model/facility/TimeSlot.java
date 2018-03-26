package com.fms.model.facility;

import java.util.ArrayList;
import java.util.List;

import com.fms.model.facilityuse.IUser;

public class TimeSlot implements ITimeSlot {
	
	private List<IUser> slots;
	private int slotlimit;
	
	public TimeSlot(int slotlimit) {
		this.slots = new ArrayList<>();
		this.slotlimit = slotlimit;
	}

	
	public List<IUser> getOccupiedSlots() {
		return this.slots;
		
	}

	
	public int getOccupiedSlotsCount() {
		
		return this.slots.size();
	}

	
	public int getOpenSlotsCount() {
		
		return this.slotlimit - this.slots.size();
	}

	
	public void occupySlot(IUser user) {
		if (slots.size()<=8) {
		this.slots.add(user);
		
	}

	
	public void vacateSlot(int slot) {
		this.slots.remove(slot);
		
	}

	
	public boolean getSlotStatus(int slot) {
		this.slots.get(slot);
		return false;
	}
	
	public void clearSlots() {
		this.slots.clear();
	}

}
