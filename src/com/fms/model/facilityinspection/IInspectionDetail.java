package com.fms.model.facilityinspection;

public interface IInspectionDetail {
	boolean getInspectionResult();
	void setInspectionResult(boolean inspectionresult);
	String getInspectionDate();
	void setInspectionDate(String inspectiondate);
	void setInspectionNote(String inspectionnote);
	String getInspectionNote();
	
}
