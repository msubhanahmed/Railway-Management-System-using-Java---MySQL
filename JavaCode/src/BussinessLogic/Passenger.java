package BussinessLogic;

public class Passenger 
{
	private String ID;
	private String name;
	private String cnic;
	private String phoneNo;
	
	public Passenger(String iD, String name, String cnic, String phoneNo) {
		ID = iD;
		this.name = name;
		this.cnic = cnic;
		this.phoneNo = phoneNo;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
