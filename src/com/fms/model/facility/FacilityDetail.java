package com.fms.model.facility;

public class FacilityDetail implements IFacilityDetail {

	String facilityname;
	String facilitydescription;
	String facilityaddress;
	int facilityphone;
	
	public FacilityDetail(String facilityname, String facilitydescription, String facilityaddress, int facilityphone) {
		this.facilityname = facilityname;
		this.facilitydescription = facilitydescription;
		this.facilityaddress = facilityaddress;
		this.facilityphone = facilityphone;
	}
	public String getFacilityName() {
		
		return facilityname;
	}

	
	public void setFacilityName(String facilityname) {
		
		this.facilityname = facilityname;
	}

	
	public String getFacilityDescription() {
		
		return facilitydescription;
	}

	
	public void setFacilityDescription(String facilitydescription) {
		
		this.facilitydescription = facilitydescription;
	}

	
	public int getFacilityPhone() {
		
		return facilityphone;
	}

	
	public void setFacilityPhone(int facilityphone) {
		
		this.facilityphone = facilityphone;
	}

	
	public String getFacilityAddress() {
		
		return facilityaddress;
	}

	
	public void setFacilityAddress(String facilityaddress) {
		
		this.facilityaddress = facilityaddress;
	}

}
