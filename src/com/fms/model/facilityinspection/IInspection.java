package com.fms.model.facilityuse;

public interface IInspection {
	String getInspectionID();
	void setInspectionID(String inspectionid);
	IInspectionDetail getInspectionDetail();
	void setInspectionDetail(IInspectionDetail inspectiondetail);
	IInspector getInspector();
	void setInspector(IInspector inspector);
	
}
