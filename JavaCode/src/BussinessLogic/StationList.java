package BussinessLogic;

import java.util.ArrayList;
import DataBase.DB_Handler;
public class StationList 
{
	ArrayList<Station> sl;
	
	public StationList() 
	{
		DB_Handler d = new DB_Handler();
		sl = d.loadAllStation();
	}

	public ArrayList<Station> getSl() {
		
		return sl;
	}

	public void setSl(ArrayList<Station> sl) {
		this.sl = sl;
	}
	
}
