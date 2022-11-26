package BussinessLogic;

public class Ticket 
{
	static int sid = 7865;
	private int ID;
	private String Source;
	private String Destination;
	private String TrainID;
	private int price;
	private int seats;
	private String validity;
	
	public Ticket(String source, String destination, String trainID, int price , int s, String validity) {
		ID = ++sid;
		Source = source;
		Destination = destination;
		TrainID = trainID;
		this.price = price;
		this.seats = s;
		this.validity = validity;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public void setTrainID(String trainID) {
		TrainID = trainID;
	}
	public String getTrainID() {
		return TrainID;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
}
