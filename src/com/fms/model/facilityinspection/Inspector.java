package com.fms.model.facilityinspection;

public class Inspector implements IInspector {
	private String inspectorname;
	private String inspectorid;
	
	public Inspector(String inspectorname, String inspectorid) {
		this.inspectorname = inspectorname;
		this.inspectorid = inspectorid;
	}
	public String getInspectorName() {
		
		return inspectorname;
	}

	
	public void setInspectorName(String inspectorname) {
		this.inspectorname = inspectorname;

	}

	
	public String getInspectorID() {
		
		return inspectorid;
	}

	
	public void setInspectorID(String inspectorid) {
		
		this.inspectorid = inspectorid;
	}

}
