package BussinessLogic;

public abstract class Train 
{
	private int ID;
	private String name;
	private String Type;
	private int maxCapacity; // For Freight Train it is in KiloGrams while in Passenger Train it is number of seats
	public Train(int iD, String name, String type, int maxCapacity) {
		ID = iD;
		this.name = name;
		Type = type;
		this.maxCapacity = maxCapacity;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public String getFreightType() {
		return null;
	}
	public void setFreightType(String freightType) {
	}
	public int getSeatsBooked() {
		return 0;
	}
	public void setSeatsBooked(int seatsBooked) {
	}
	
}
