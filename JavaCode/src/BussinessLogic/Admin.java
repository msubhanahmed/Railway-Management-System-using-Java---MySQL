package BussinessLogic;

import java.sql.SQLException;
import java.sql.Statement;

import DataBase.DB_Handler;

public class Admin 
{
	private int ID;
	private String Fname;
	private String Lname;
	private String email;
	private String phone;
	private String psd;
	private String cnic;
	private static int counter = 2000;
 	public Admin() 
	{
		
		
	}
	
	public Admin(int id,String fn, String ln, String mail, String phone, String pass ,String cnic) 
	{
		ID = id;
		this.Fname = fn;
		this.Lname = ln;
		this.email = mail;
		this.phone = phone;
		this.psd = pass;
		this.cnic  = cnic;
	}
	
	public Admin AdminGetInfo()
	{
		DB_Handler d = new DB_Handler();
		return d.getAdmininfo();
	}
	
	
	public String getCnic() {
		return cnic;
	}


	public void setCnic(String cnic) {
		this.cnic = cnic;
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
	
	public void deleteTrain(String name)
	{
		DB_Handler d = new DB_Handler();
		d.deleteTrain(name);
	}
	public void insertTrain(String name , String type , int load)
	{
		DB_Handler d = new DB_Handler();
		++counter;
		d.insertTrain(counter , name,type,load);
	}

	public void insertStation(int id,String name , String phone)
	 {
		DB_Handler d = new DB_Handler();
		++counter;
		d.insertStation(counter , name,phone);
	 }
	 public void deleteStation(String name)
	 {
		DB_Handler d = new DB_Handler();
		d.deleteStation(name);
	 }

	 public void insertSchedule(int ID , int TrainID, int Src , int dest , String arriv , String dept)
	 {
		DB_Handler d = new DB_Handler();
		++counter;
		d.insertSchedule(counter ,1000 ,d.getOneStation(Src).getID(),d.getOneStation(dest).getID(),arriv,dept);
	 }
	 public void deleteSchedule(int ID)
	 {
		DB_Handler d = new DB_Handler();
		d.deleteSchedule(ID);
	 }

}
