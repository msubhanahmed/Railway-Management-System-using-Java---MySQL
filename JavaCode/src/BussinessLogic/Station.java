package BussinessLogic;

public class Station 
{
		private int ID;
		private String name;
		private String contact;
		private ScheduleBoard scheduleboard;
		
		public Station(int iD, String name, String contact, ScheduleBoard scheduleboard) {
			ID = iD;
			this.name = name;
			this.contact = contact;
			this.scheduleboard = scheduleboard;
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public ScheduleBoard getScheduleboard() {
			return scheduleboard;
		}
		public void setScheduleboard(ScheduleBoard scheduleboard) {
			this.scheduleboard = scheduleboard;
		}
		
}
