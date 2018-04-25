package com.fms.view;

import java.util.ArrayList;
import java.util.List;

import com.fms.model.facility.*;
import com.fms.model.facilityinspection.*;
import com.fms.model.facilitymaintenance.*;
import com.fms.model.facilityuse.*;

public class Main {

	public static void main(String[] args) {
		
		//creates 2 users
		IUserDetail user1detail, user2detail;
		user1detail = new UserDetail("Rena", "777 E Street", "rena@mail.com", 1234567);
		user2detail = new UserDetail("Jada", "999 w Street", "jada@mail.com", 7654321);
		IUser user1, user2;
		user1 = new User("0001", user1detail);
		user2 = new User("0002", user2detail);
		//prints both users
		System.out.println("User1: "+ user1 + "\nUser2: "+user2);
		
		//Creates Inspection department _-> inspector with details and inspection
		IInspector inspector = new Inspector("Shaun", "09");
		IInspectionDetail inspectiondetail = new InspectionDetail("Today", true, "This was the first inspection, which the unit has passed");
		IInspection inspection = new Inspection("09", inspectiondetail, inspector);
		//prints out inspection
		System.out.println("\nInspection 1: "+inspection);
		
		
		//Creates a facility
		//Schedule
		IFacilitySchedule facilityschedule = new FacilitySchedule();
		
		//facility detail
		IFacilityDetail facilitydetail = new FacilityDetail("Inter-Office Rental Co", "Offers retail office spaces", 
				"123 e Street", 1122334);
		
		//creates building group
		IBuildingDetail buildingdetail = new BuildingDetail("Building 1","123 north Street", 4543560);
		IBuildingDetail buildingdetail2 = new BuildingDetail("Building 2", "321 northeast Street", 6758490);
		List<IBuilding> buildings = new ArrayList<IBuilding>();
		
		//creates rooms
		List<IRoom> rooms = new ArrayList<IRoom>();
		List<IRoom> rooms2 = new ArrayList<IRoom>();
		IRoom room1 = new Room("1", 32, 100, "Class Room", 7737733);
		IRoom room2 = new Room("2", 40, 120, "Class Room", 7737734);
		IRoom room3 = new Room("3", 33, 105, "Class Room", 7737736);
		IRoom room4 = new Room("4", 42, 124, "Class Room", 7757734);
		IRoom room5 = new Room("5", 41, 121, "Class Room", 7732734);
		
		//adds rooms to the room container
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);
		rooms.add(room4);
		rooms.add(room5);
		rooms2.add(room5);
		
		//assembly building
		IBuilding building = new Building("123", buildingdetail, rooms);
		IBuilding building2 = new Building("321", buildingdetail2, rooms2);
		
		//add building to list of buildings
		buildings.add(building);
		buildings.add(building2);
		
		//prints buildings and room
		System.out.println("\nBuildings: "+buildings);
		
		
		//Creates Maintenance department
		IFacilityMaintenance facilitymaintenance = new FacilityMaintenance();
		facilitymaintenance.requestRoomMaintenance(room2);
		
		//print maintenance request
		System.out.println("\nFacility Maintenance Request: "+facilitymaintenance.getFacilityMaintenanceRequestList());
		
		//assembly facility
		IFacility facility = new Facility(facilitydetail, buildings, "321", facilitymaintenance, inspection);
		facility.addBuilding(building2);
		

		//Creates FacilityUse department
		IFacilityUse facilityuse = new FacilityUse(facility);
		
		//Facility use
		facilityuse.addUser(user1);
		facilityuse.addUser(user2);
		facilityuse.assignFacilityToUse("2", "0001");
		facilityuse.assignFacilityToUse("1", "0001");
		facilityuse.assignFacilityToUse("1","0002");
		System.out.println("\nFacility: room1 usage rate: " +facilityuse.calcUsageRate("1"));
		System.out.println("Facility: room2 usage rate: " +facilityuse.calcUsageRate("2"));
		System.out.println("\nFacility: room1 actual usage list: "+facilityuse.listActualUsage("1"));
		
		IFacilityFilter facilityfilter = new FacilityFilter();
		System.out.println("\nList only occupied buildings:\n" + facilityfilter.filterByOccupancy(facility.getBuildings()));
		System.out.println("\nList only buildings that has vacancies:\n" + facilityfilter.filterByVacancy(facility.getBuildings()));
		
		//end
			
	}

}