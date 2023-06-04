package main;

import java.util.ArrayList;

public class Room {
	private int TypeID;
	private int roomNumber;
	private int roomPricePerNight;
	private boolean filled;
	private String roomType;
	
	public Room(int TypeID, int roomNumber, boolean filled) {
		this.setTypeID(TypeID);
		this.setRoomNumber(roomNumber);
		this.setfilled(filled);
		this.setRoomPricePerNight(getRoomPrice(TypeID));
		this.setRoomType(getRoomName(TypeID));
	}

	public static int getRoomPrice(int typeID){
		if(typeID == 1) {
			return 500000;
		}else if(typeID ==2) {
			return 250000;
		}else if(typeID == 3) {
			return 100000;
		}
		return 0;
	}

	public static String getRoomName(int typeID){
		if(typeID == 1) {
			return "VIP";
		}else if(typeID ==2) {
			return "Family";
		}else if(typeID == 3) {
			return "Personal";
		}
		return null;
	}

	public static int checkNomorRuangan(int nomorRuangan, ArrayList<Room> msRoom) {
		for (Room room : msRoom) {
			if (room.getRoomNumber() == nomorRuangan) {
				if (room.isfilled()) {
					return 2;
				} else {
					return 1;
				}
			}
		}
		return 0;
	}


	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getRoomPricePerNight() {
		return roomPricePerNight;
	}

	public void setRoomPricePerNight(int roomPricePerNight) {
		this.roomPricePerNight = roomPricePerNight;
	}

	public boolean isfilled() {
		return filled;
	}

	public void setfilled(boolean filled) {
		this.filled = filled;
	}

	public int getTypeID() {
		return TypeID;
	}

	public void setTypeID(int typeID) {
		TypeID = typeID;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomTypeName) {
		this.roomType = roomTypeName;
	}
	

}
