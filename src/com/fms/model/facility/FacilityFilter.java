package com.fms.model.facility;

import com.fms.model.facility.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FacilityFilter implements IFacilityFilter {
	private List<IBuilding> buildings;
	
	public FacilityFilter() {
		this.buildings = new ArrayList<>();
	}

	public List<IBuilding> filterByOccupancy(List<IBuilding> buildings) {
		this.buildings.clear();
		for (IBuilding building:buildings) {
			for (IRoom room: building.getRooms()) {
				if (room.getRoomStatus() == true) {
					this.buildings.add(building);
					break;
				}
			}
		}
		
		return this.buildings;
	}

	public List<IBuilding> filterByVacancy(List<IBuilding> buildings) {
		
		this.buildings.clear();
		for (IBuilding building:buildings) {
			for (IRoom room: building.getRooms()) {
				if (room.getRoomStatus() == false) {
					this.buildings.add(building);
					break;
				}
			}
		}
		
		return this.buildings;
	}

}
