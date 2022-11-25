package BussinessLogic;

public class ScheduleEntry 
{
	private int ID;
	private String Train;
	private String Src;
	private String Dest;
	private String arrival;
	private String dept;
	public ScheduleEntry(int iD, String train, String src, String dest, String arrival, String dept) {
		ID = iD;
		Train = train;
		Src = src;
		Dest = dest;
		this.arrival = arrival;
		this.dept = dept;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTrain() {
		return Train;
	}
	public void setTrain(String train) {
		Train = train;
	}
	public String getSrc() {
		return Src;
	}
	public void setSrc(String src) {
		Src = src;
	}
	public String getDest() {
		return Dest;
	}
	public void setDest(String dest) {
		Dest = dest;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
