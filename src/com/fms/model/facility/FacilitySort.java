package com.fms.model.facility;

import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
public class FacilitySort implements IFacilitySort {
	
	private List<IBuilding> buildings;
	private List<IBuildingDetail> buildingdetail;
	
	public List<IBuilding> sortByName(List<IBuilding> buildings){
		this.buildings.clear();
		for (IBuilding building:buildings) {
			
		}
		return this.buildings;
	}

}
