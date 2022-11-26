package BussinessLogic;

import java.util.*;

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
	public ArrayList<ScheduleEntry> GetSchedule(/* Add Necessary Arguments */)
	{
		ArrayList<ScheduleEntry> schedule = new ArrayList<ScheduleEntry>();
		return schedule;
	}
	public ArrayList<Station> GetStations(/* Add Necessary Arguments */)
	{
		return stlist.getSl();
	}
	public int	GetFare(/* Add Necessary Arguments*/)
	{
		return 0;
	}
	
	
	/*
	 * Add Administrator Functions Here
	 * 
	 */
	
	
	
	
	
	
	/*
	 * Add Helping Functions Here No Business Logic Function Outside this class
	 */
	
	
	
	
}
