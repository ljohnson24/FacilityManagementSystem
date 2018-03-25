package com.fms.model.facilityinspection;

public class Inspector implements IInspector {
	private String inspectorname;
	private String inspectorid;
	
	@Override
	public String getInspectorName() {
		
		return inspectorname;
	}

	@Override
	public void setInspectorName(String inspectorname) {
		this.inspectorname = inspectorname;

	}

	@Override
	public String getInspectorID() {
		
		return inspectorid;
	}

	@Override
	public void setInspectorID(String inspectorid) {
		
		this.inspectorid = inspectorid;
	}

}
