package com.fms.model.facilityinspection;

public class InspectionDetail implements IInspectionDetail {

	private boolean inspectionresult;
	private String inspectiondate;
	private String inspectionnote;

	public InspectionDetail(String inspectiondate, boolean inspectionresult, String inspectionnote){
		
		this.inspectiondate = inspectiondate;
		this.inspectionresult = inspectionresult;
		this.inspectionnote = inspectionnote;
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
	
	@Override
	public String toString() {
		return "InspectionDetail [inspectionresult=" + inspectionresult + ", inspectiondate=" + inspectiondate
				+ ", inspectionnote=" + inspectionnote + "]";
	}

}
