package com.fms.model.facilityinspection;

public interface IInspection {
	String getInspectionID();
	void setInspectionID(String inspectionid);
	IInspectionDetail getInspectionDetail();
	void setInspectionDetail(IInspectionDetail inspectiondetail);
	IInspector getInspector();
	void setInspector(IInspector inspector);
	
}
