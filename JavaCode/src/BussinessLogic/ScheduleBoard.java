package BussinessLogic;

import java.util.ArrayList;

public class ScheduleBoard 
{
	private ArrayList<ScheduleEntry> SE;
	public ScheduleBoard() {SE = new ArrayList<ScheduleEntry>();}
	public ArrayList<ScheduleEntry> getSE() {
		return SE;
	}
	public void setSE(ArrayList<ScheduleEntry> sE) {
		SE = sE;
	}
}
