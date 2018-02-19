package com.fms.model.facility;

import java.util.ArrayList;

public interface IFacilityFactory {
	public void addFacility(IFacility facility);
	public void removeFacility(IFacility facility);
	public ArrayList<IFacility> sortFacilitiesByName(ArrayList<IFacility> facilities);
	public IFacility searchFacilityByID(ArrayList<IFacility> facilities, String facilityid);
	public ArrayList<IFacility> filterFacilitiesByCost(ArrayList<IFacility> facilities, int facilitycost);

}
