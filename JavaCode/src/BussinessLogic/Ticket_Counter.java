package BussinessLogic;

import java.time.LocalDateTime;
import java.util.*;

import DataBase.DB_Handler;

public class Ticket_Counter 
{
	private StationList stlist;
	
	public Ticket_Counter() {
		stlist = new StationList();
	}
	public void ReserveTicket(/* Add Necessary Arguments */)
	{
		
	}
	public void CancelTicket(/* Add Necessary Arguments */)
	{
		
	}
	public void BookFreight(/* Add Necessary Arguments */)
	{
		
	}
	public ArrayList<ScheduleEntry> GetSchedule(String name)
	{
		for(Station i : stlist.getSl())
		{
			if(i.getName()==name)
			{
				return i.getScheduleboard().getSE();
			}
		}
		return null;
	}
	public ArrayList<Station> GetStations(/* Add Necessary Arguments */)
	{
		return stlist.getSl();
	}
	public ArrayList<PassengerTrain> getPTrains()
	{
		DB_Handler d = new DB_Handler();
		return d.getAllTrain();
	}
	public int	GetFare(/* Add Necessary Arguments*/)
	{
		return 0;
	}
	public void reserveTicket(String source, String destination, String trainID, int s)
	{
		DB_Handler d = new DB_Handler();
		Ticket t = new Ticket(source,destination,trainID,s*1500,s,LocalDateTime.now().toString());
		d.saveTicket(t);
	}
	
	/*
	 * Add Administrator Functions Here
	 * 
	 */
	
	
	
	
	
	
	/*
	 * Add Helping Functions Here No Business Logic Function Outside this class
	 */
	
	
	
	
}
