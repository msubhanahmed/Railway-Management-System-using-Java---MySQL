package BussinessLogic;

public class PassengerTrain extends Train
{
	private int seatsBooked;

	public PassengerTrain(int iD, String name, String type, int maxCapacity, int seatsBooked) {
		super(iD, name, type, maxCapacity);
		this.seatsBooked = seatsBooked;
	}

	public int getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	
}
