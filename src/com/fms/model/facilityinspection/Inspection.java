package com.fms.model.facilityinspection;

public class Inspection implements IInspection {
	
	private String inspectionid;
	private IInspectionDetail inspectiondetail;
	private IInspector inspector;
	
	public Inspection(String inspectionid, IInspectionDetail inspectiondetail, IInspector inspector) {
		this.inspectionid = inspectionid;
		this.inspectiondetail = inspectiondetail;
		this.inspector = inspector;
	}
	public String getInspectionID() {
		
		return inspectionid;
	}

	
	public void setInspectionID(String inspectionid) {
		
		this.inspectionid = inspectionid;
	}

	
	public IInspectionDetail getInspectionDetail() {
		
		return inspectiondetail;
	}

	
	public void setInspectionDetail(IInspectionDetail inspectiondetail) {
		
		this.inspectiondetail = inspectiondetail;
	}

	
	public IInspector getInspector() {
		
		return inspector;
	}

	
	public void setInspector(IInspector inspector) {
		this.inspector = inspector;
	}
	
	@Override
	public String toString() {
		return "Inspection [inspectionid=" + inspectionid + ", inspectiondetail=" + inspectiondetail + ", inspector="
				+ inspector + "]";
	}

}
