package com.fms.model.facility;

import java.util.List;

public interface IFacilityFilter {
	
	List<IBuilding> filterByOccupancy(List<IBuilding> buildings);
	
	List<IBuilding> filterByVacancy(List<IBuilding> buildings);

}
