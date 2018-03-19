package com.fms.model.facility;


public interface IFacilitySearch {
	
	 IBuilding searchByID(String buildingid);
	 IBuilding searchByName(String buildingname);
	 
}
