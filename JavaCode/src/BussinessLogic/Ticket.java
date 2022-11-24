package BussinessLogic;

public class Ticket 
{
	private int ID;
	private int TrainID;
	private int price;
	private String validity;
	public Ticket(int iD, int trainID, int price, String validity) {
		ID = iD;
		TrainID = trainID;
		this.price = price;
		this.validity = validity;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getTrainID() {
		return TrainID;
	}
	public void setTrainID(int trainID) {
		TrainID = trainID;
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
	
}
