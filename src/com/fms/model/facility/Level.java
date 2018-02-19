package com.fms.model.facility;

import java.util.ArrayList;

public class Level implements ILevel {
	private String levelid;
	private ArrayList<IRoom> rooms;

	
	public String getLevelID() {
		
		return levelid;
	}

	
	public void setLevelID(String levelid) {
		
		this.levelid = levelid;
	}
	
	public void addRoom(IRoom room) {
		this.rooms.add(room);
	}
	
	public void removeRoom(IRoom room) {
		this.rooms.remove(room);
	}

}
