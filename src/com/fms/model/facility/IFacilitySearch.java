package com.fms.model.facility;

import java.util.List;

public interface IFacilitySearch {
	
	 IBuilding searchByID(List<IBuilding> buildings, String buildingid);
	 IBuilding searchByName(List<IBuilding> buildings, String buildingname);
	 
}
