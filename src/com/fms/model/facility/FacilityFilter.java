package com.fms.model.facility;

import java.util.List;

public class FacilityFilter implements IFacilityFilter {
	
	private List<IBuilding> buildings;
	
	private List<IBuilding> getBuildings() {
		return this.buildings;
	}
	
	private void setBuildings(List<IBuilding> buildings) {
		this.buildings = buildings;
	}
	
	private void addBuilding(IBuilding building) {
		
		this.buildings.add(building);
	}
	
	
	private void clearBuildings() {
		this.buildings.clear();
	}

	@Override
	public List<IBuilding> filterByOccupancy(List<IBuilding> buildings) {
		
		return buildings;
	}

	@Override
	public List<IBuilding> filterByVacancy(List<IBuilding> buildings) {
		
		return buildings;
	}

}
