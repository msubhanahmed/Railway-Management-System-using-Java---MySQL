package BussinessLogic;

public class Admin 
{
	private ID;
	
	
	public Admin AdminGetInfo()
	{
		DB_Handler d = new DB_Handler();
		return d.getAdmininfo();
	}
}
