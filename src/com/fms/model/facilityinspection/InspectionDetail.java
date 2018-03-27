package com.fms.model.facilityinspection;

public class InspectionDetail implements IInspectionDetail {
	
	private boolean inspectionresult;
	private String inspectiondate;
	private String inspectionnote;

	public InspectionDetail() {
		
	}
	public boolean getInspectionResult() {
		
		return this.inspectionresult;
	}

	public void setInspectionResult(boolean inspectionresult) {
		this.inspectionresult = inspectionresult;

	}

	public String getInspectionDate() {
		
		return this.inspectiondate;
	}

	
	public void setInspectionDate(String inspectiondate) {
		this.inspectiondate = inspectiondate;

	}
	
	public void setInspectionNote(String inspectionnote) {
		this.inspectionnote = inspectionnote;
	}
	
	public String getInspectionNote() {
		return inspectionnote;
	}

}
