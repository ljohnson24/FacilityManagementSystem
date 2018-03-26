package com.fms.model.facility;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FacilitySearch implements IFacilitySearch {

	public IBuilding searchByID(List<IBuilding> buildings, String buildingid) {
		ListIterator<IBuilding> iter = buildings.listIterator();
		while(iter.hasNext()) {
			if (iter.next().getBuildingID().equals(buildingid)) {
				return iter.next();
			}
		}
		return null;
	}

	
	public IBuilding searchByName(List<IBuilding> buildings, String buildingname) {
		
		ListIterator<IBuilding> iter = buildings.listIterator();
		while(iter.hasNext()) {
			if (iter.next().getBuildingDetail().getBuildingName().equals(buildingname)) {
				return iter.next();
			}
		}
		return null;
	}

}
