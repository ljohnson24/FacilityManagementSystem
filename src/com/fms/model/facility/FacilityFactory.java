package com.fms.model.facility;

import java.util.Comparator;
import java.util.List;

public class FacilityFactory implements IFacilityFactory {
	private List<IFacility> facilities;
	private FacilitySearch facilitysearch;
	private FacilityFilter facilityfilter;
	private FacilitySort facilitysort;

	
	public void addFacility(IFacility facility) {
		
		this.facilities.add(facility);
	}

	
	public void removeFacility(IFacility facility) {
		
		this.facilities.remove(facility);
	}

	
	public List<IFacility> sortFacilitiesByName(List<IFacility> facilities) {
		this.facilities.sort((Comparator<? super IFacility>) facilities);
		return facilities;
	}

	
	public IFacility searchFacilityByID(List<IFacility> facilities, IFacility facility) {
		int index = facilities.indexOf(facility);
		return facilities.get(index);
	}

	
	public List<IFacility> filterFacilitiesByCost(List<IFacility> facilities, int facilitycost) {
		
		return facilities;
	}

}
