package DataBase;


import java.sql.*;
import BussinessLogic.*;

import java.util.ArrayList;

public class DB_Handler 
{
	private String name = "root";
	private String pass = "Subh@n2004639";
	private Connection con ;
	
	public DB_Handler() 
	{
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaysystem",name,pass);
			System.out.println("Connection made to DB");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Connection failed");
		}
	}
	
	public Train getOneTrain(int id)
	{
		try {
			Statement s = con.createStatement();
			ResultSet r = s.executeQuery("Select * from PassengerTrain where ID="+id);
			while(r.next())
			{
				// GET Schedule of this particular station first and pass it instead of null below
				PassengerTrain c = new PassengerTrain(r.getInt(1), r.getString(2) , "Passenger Train" , r.getInt(3));
				return c;			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<PassengerTrain> getAllTrain()
	{
		ArrayList<PassengerTrain> t = new ArrayList<PassengerTrain>();
		try {
			Statement s = con.createStatement();
			ResultSet r = s.executeQuery("Select * from PassengerTrain");
			while(r.next())
			{
				// GET Schedule of this particular station first and pass it instead of null below
				PassengerTrain c = new PassengerTrain(r.getInt(1), r.getString(2) , "Passenger Train" , r.getInt(3));
				t.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}
	public Station getOneStation(int id )
	{
		try {
			Statement s = con.createStatement();
			ResultSet r = s.executeQuery("Select * from station where ID="+id);
			while(r.next())
			{
				// GET Schedule of this particular station first and pass it instead of null below
				Station c = new Station(r.getInt(1), r.getString(2) , r.getString(3) , null);
				return c;				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<Station> loadAllStation()
	{
		ArrayList<Station> clist = new ArrayList<Station>();
		String query = "Select * from station";
		
		try {
			Statement s = con.createStatement();
			ResultSet r = s.executeQuery(query);
			while(r.next())
			{
				// GET Schedule of this particular station first and pass it instead of null below
				Station c = new Station(r.getInt(1), r.getString(2) , r.getString(3) , getStationSchedule(r.getInt(1)));
				clist.add(c);				
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return clist;
	}
	public ScheduleBoard getStationSchedule(int Station_ID)
	{
		ScheduleBoard sb = new ScheduleBoard();
		String query = "Select * from ScheduleEntry";
		
		try {
			Statement s = con.createStatement();
			ResultSet r = s.executeQuery(query);
			while(r.next())
			{
				if(getOneStation(r.getInt(3)).getID() == Station_ID || getOneStation(r.getInt(4)).getID() == Station_ID)
				{
					ScheduleEntry e = new ScheduleEntry(r.getInt(1) , getOneTrain(r.getInt(2)).getName() , getOneStation(r.getInt(3)).getName() , getOneStation(r.getInt(4)).getName() , r.getString(5) , r.getString(6) );
					sb.addnewEntry(e);
				}
				
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return sb;
	}

	public void saveTicket(Ticket t)
	{
		String q = "Insert into Ticket values (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pq = con.prepareStatement(q);
			pq.setInt(1,t.getID());
			pq.setString(2, t.getSource());
			pq.setString(3, t.getDestination());
			pq.setString(4, t.getTrainID());
			pq.setString(5, t.getValidity());
			pq.setInt(6,t.getPrice());
			pq.setInt(7,t.getSeats());
			pq.setInt(8, 202445);
			
			pq.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void saveBooking(FreightBooking t , int PID)
	{
		String q = "Insert into FreightBooking values (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pq = con.prepareStatement(q);
			pq.setInt(1, t.getID());
			pq.setString(2,t.getValidity());
			pq.setInt(3, t.getPrice());
			pq.setString(4, t.getSrc());
			pq.setString(5, t.getDest());
			pq.setString(6, t.getType());
			pq.setInt(7, t.getLoad());
			pq.setInt(8, PID);
			
			pq.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public Admin getAdmininfo() {
			String q = "Select * from StationAdmin"; 
			
		try {	
				Statement s = con.createStatement();
				ResultSet r = s.executeQuery(q);
				while(r.next())
				{
					Admin a = new Admin(r.getInt(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5),r.getString(6),r.getString(7));
					return a;
				}
			
		    }  catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
		
		
	}
}
