package com.fms.model.facility;

public interface ILevel {
	public String getLevelID();
	public void setLevelID(String levelid);
	public void addRoom(IRoom rooms);
	public void removeRoom(IRoom rooms);
	
}
