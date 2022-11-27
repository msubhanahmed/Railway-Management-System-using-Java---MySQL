package BussinessLogic;

import DataBase.DB_Handler;

public class Passenger 
{
	private int ID;
	
	private String Fname;
	private String Lname;
	private String email;
	private String phone;
	private String psd;
	private String cnic;
	
	
	public Passenger() {}
	public Passenger(int id,String fn, String ln, String mail, String phone, String pass ,String cnic) 
	{
		ID = id;
		this.Fname = fn;
		this.Lname = ln;
		this.email = mail;
		this.phone = phone;
		this.psd = pass;
		this.cnic  = cnic;
	}
	public Passenger PassengerGetInfo()
	{
		DB_Handler d = new DB_Handler();
		return d.getPassengerinfo();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
}
