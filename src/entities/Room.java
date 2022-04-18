package entities;

public class Room {
	
	private String resident;
	private String residentEmail;
	private int roomNumber;
	
	public Room(String resident, String residentEmail, int roomNumber) {
		this.resident = resident;
		this.residentEmail = residentEmail;
		this.roomNumber = roomNumber;
	}
	
	public String getResident() {
		return resident;
	}
	
	public void setResident(String resident) {
		this.resident = resident;
	}
	
	public String getResidentEmail( ) {
		return residentEmail;
	}
	
	public void setResidentEmail(String residentEmail) {
		this.residentEmail = residentEmail;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumer(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public String toString() {
		return getRoomNumber() 
			   + ": " 
			   + getResident() 
			   + ", " 
			   + getResidentEmail(); 
	}
}
