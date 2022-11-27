package BussinessLogic;

public class FreightBooking 
{
	private int ID;
	private String Validity;
	private int price;
	private String type;
	private int load;
	private int passengerID;
	private String src;
	private String dest;
	private static int ids = 3000; 
	public FreightBooking(String validity, int price, String type, int load, int passengerID, String src, String dest) {
		ID = ++ids;
		Validity = validity;
		this.price = price;
		this.type = type;
		this.load = load;
		this.passengerID = passengerID;
		this.src = src;
		this.dest = dest;
	}
	public String getValidity() {
		return Validity;
	}
	public void setValidity(String validity) {
		Validity = validity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLoad() {
		return load;
	}
	public void setLoad(int load) {
		this.load = load;
	}
	public int getPassengerID() {
		return passengerID;
	}
	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
}
