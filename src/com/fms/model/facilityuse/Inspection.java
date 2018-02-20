package com.fms.model.facilityuse;

public class Inspection implements IInspection {
	private String inspectionid;
	private IInspectionDetail inspectiondetail;
	private IInspector inspector;
	@Override
	public String getInspectionID() {
		
		return inspectionid;
	}

	@Override
	public void setInspectionID(String inspectionid) {
		
		this.inspectionid = inspectionid;
	}

	@Override
	public IInspectionDetail getInspectionDetail() {
		
		return inspectiondetail;
	}

	@Override
	public void setInspectionDetail(IInspectionDetail inspectiondetail) {
		
		this.inspectiondetail = inspectiondetail;
	}

	@Override
	public IInspector getInspector() {
		
		return inspector;
	}

	@Override
	public void setInspector(IInspector inspector) {
		this.inspector = inspector;
	}

}
