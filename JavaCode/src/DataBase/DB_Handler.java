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
				Station c = new Station(r.getInt(1), r.getString(2) , r.getString(3) , null);
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
		return null;
	}
}
