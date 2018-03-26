package com.fms.model.facilityinspection;

public class InspectionDetail implements IInspectionDetail {
	private boolean inspectionresult;
	private String inspectiondate;

	@Override
	public boolean getInspectionResult() {
		
		return this.inspectionresult;
	}

	@Override
	public void setInspectionResult(boolean inspectionresult) {
		this.inspectionresult = inspectionresult;

	}

	@Override
	public String getInspectionDate() {
		
		return this.inspectiondate;
	}

	@Override
	public void setInspectionDate(String inspectiondate) {
		this.inspectiondate = inspectiondate;

	}

}
