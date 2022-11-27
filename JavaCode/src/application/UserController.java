package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import BussinessLogic.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class UserController {

	
	private Passenger p1 = null;
	Ticket_Counter TC = new Ticket_Counter();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Tab CalculateFare_tab;

    @FXML
    private Button Cfare_calculate_btn;

    @FXML
    private Label Cfare_class;

    @FXML
    private ChoiceBox<?> Cfare_class_choice;

    @FXML
    private Label Cfare_dest;

    @FXML
    private ChoiceBox<?> Cfare_dest_choice;

    @FXML
    private TextField Cfare_display;

    @FXML
    private Label Cfare_seats;

    @FXML
    private ChoiceBox<?> Cfare_seats_choice;

    @FXML
    private Label Cfare_station;

    @FXML
    private ChoiceBox<?> Cfare_station_choice;

    @FXML
    private Tab FreightBook_tab;

    @FXML
    private Tab Home_tab;

    @FXML
    private Tab MyAccount_tab;

    @FXML
    private Label PakistanRailways_Main;

    @FXML
    private ImageView PakistanRailways_Main_img;

    @FXML
    private Label Sch_station;

    @FXML
    private TableColumn<?, ?> Sch_station_arrival;

    @FXML
    private ChoiceBox<?> Sch_station_choice;

    @FXML
    private TableColumn<?, ?> Sch_station_depart;

    @FXML
    private TableColumn<?, ?> Sch_station_dest;

    @FXML
    private TableColumn<?, ?> Sch_station_id;

    @FXML
    private Button Sch_station_search_btn;

    @FXML
    private TableColumn<?, ?> Sch_station_src;

    @FXML
    private TableView<ScheduleEntry> Sch_station_table;

    @FXML
    private TableColumn<?, ?> Sch_station_train;

    @FXML
    private Tab Schedule_tab;

    @FXML
    private Label TR_BankAcc;

    @FXML
    private TextField TR_BankAcc_user;

    @FXML
    private Label TR_class;

    @FXML
    private ChoiceBox<?> TR_class_choice;

    @FXML
    private Label TR_dest;

    @FXML
    private ChoiceBox<?> TR_dest_choice;

    @FXML
    private Label TR_err_;

    @FXML
    private Button TR_reserve_btn;

    @FXML
    private Label TR_seats;

    @FXML
    private ChoiceBox<?> TR_seats_choice;

    @FXML
    private Label TR_station;

    @FXML
    private ChoiceBox<?> TR_station_choice;

    @FXML
    private Tab TicketReservation_tab;

    @FXML
    private TitledPane ViewProfile_titiledPane;

    @FXML
    private ImageView acc_login_img;

    @FXML
    private Text copyright_line;

    @FXML
    private Label fbook_bank;

    @FXML
    private TextField fbook_bank_user;

    @FXML
    private Label fbook_dest;

    @FXML
    private ChoiceBox<?> fbook_dest_choice;

    @FXML
    private Label fbook_err;

    @FXML
    private Label fbook_station;

    @FXML
    private ChoiceBox<?> fbook_station_choice;

    @FXML
    private Button fbook_submit_btn;

    @FXML
    private Label fbook_type;

    @FXML
    private ChoiceBox<?> fbook_type_choice;

    @FXML
    private Label fbook_weight;

    @FXML
    private TextField fbook_weight_user;

    @FXML
    private Label home_PopularDestinations;

    @FXML
    private Label home_chairman_name;

    @FXML
    private ImageView home_dest_img;

    @FXML
    private ImageView home_img_chairman;

    @FXML
    private Label home_msg;

    @FXML
    private Label home_msg_txt;

    @FXML
    private Label login_email;

    @FXML
    private TextField login_email_user;

    @FXML
    private Label login_mob;

    @FXML
    private TextField login_mob_user;

    @FXML
    private Label login_pass;

    @FXML
    private TextField login_pass_user;

    @FXML
    private Button login_submit_btn;

    @FXML
    private TitledPane login_titiledpane;

    @FXML
    private Button schedule_load_station_btn;

    @FXML
    private CheckBox sign_check;

    @FXML
    private Label sign_cnic;

    @FXML
    private TextField sign_cnic_user;

    @FXML
    private Label sign_fname;

    @FXML
    private TextField sign_fname_user;

    @FXML
    private ImageView sign_img;

    @FXML
    private Label sign_lname;

    @FXML
    private TextField sign_lname_user;

    @FXML
    private Label sign_mail;

    @FXML
    private TextField sign_mail_user;

    @FXML
    private Label sign_mob;

    @FXML
    private TextField sign_mob_user;

    @FXML
    private Label sign_pass;

    @FXML
    private TextField sign_pass_user;

    @FXML
    private Button sign_submit_btn;

    @FXML
    private TitledPane signup_titledpane;

    @FXML
    private Label view_cnic;

    @FXML
    private TextField view_cnic_user;

    @FXML
    private Label view_fname;

    @FXML
    private TextField view_fname_user;

    @FXML
    private Label view_lname;

    @FXML
    private TextField view_lname_user;

    @FXML
    private Label view_mail;

    @FXML
    private TextField view_mail_user;

    @FXML
    private Label view_mob;

    @FXML
    private TextField view_mob_user;

    @FXML
    private Label view_pass;

    @FXML
    private TextField view_pass_user;

    @FXML
    void fetchstations(ActionEvent event) 
    {
    	
    	try {
			@SuppressWarnings("unchecked")
			ObservableList<String> list = (ObservableList<String>) Sch_station_choice.getItems();
			for(Station s: TC.GetStations())
			{
				String name = s.getName();
				list.add(name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @FXML
    public void reserveTicket(ActionEvent event)
    {
    	String src = TR_station_choice.getValue().toString();
    	String dest = TR_dest_choice.getValue().toString();
    	String train = TR_class_choice.getValue().toString();
    	String seats = TR_seats_choice.getValue().toString();
    	
    	if(TC.reserveTicket(src,dest,train,Integer.parseInt(seats)) == true)
		{
    		TR_err_.setVisible(true);
    		TR_err_.setText("Ticket Reserved Successfully!");
		}
    	else
    	{
    		TR_err_.setVisible(true);
            TR_err_.setText("Ticket Reservation Failed!");
    	}
    }
    @FXML
    public void getStationSchedule(ActionEvent event)
    {
    	Sch_station_id.setCellValueFactory(new PropertyValueFactory<>("ID"));
        Sch_station_src.setCellValueFactory(new PropertyValueFactory<>("Src"));
        Sch_station_dest.setCellValueFactory(new PropertyValueFactory<>("Dest"));
        Sch_station_depart.setCellValueFactory(new PropertyValueFactory<>("arrival"));
        Sch_station_arrival.setCellValueFactory(new PropertyValueFactory<>("dept"));
        Sch_station_train.setCellValueFactory(new PropertyValueFactory<>("Train"));
        
    	if(Sch_station_choice.getValue()!=null)
    	{
    		ArrayList<ScheduleEntry> a = TC.GetSchedule(Sch_station_choice.getValue().toString());
    		ObservableList<ScheduleEntry> list = FXCollections.observableArrayList();
    		for(ScheduleEntry e:a)
    		{
    			list.add(e);
    		}
    		Sch_station_table.setItems(list);
    	}
    }
    
    	
    @FXML
    public void bookFreight(ActionEvent event)
    {
    	if(fbook_bank_user.getText().toString() != null)
    	{
    		String src = fbook_station_choice.getValue().toString();
	    	String dest = fbook_dest_choice.getValue().toString();
	    	String type = fbook_type_choice.getValue().toString();
	    	String load = fbook_weight_user.getText().toString();
	    	
	    	if(TC.BookFreight(type,Integer.parseInt(load),202445,src,dest) == true)
			{
	    		fbook_err.setVisible(true);
	    		fbook_err.setText("Freight Booked Successfully!");
			}
	    	else
	    	{
	    		fbook_err.setVisible(true);
	    		fbook_err.setText("Freight Reservation Failed!");
	    	}
	    	
    	}
    }
    @FXML
    public void calculateFare(ActionEvent event)
    {
    	String src= Cfare_station_choice.getValue().toString();
    	String dest = Cfare_dest_choice.getValue().toString();
    	if(src != dest)
    	{int fare = (Integer.parseInt(Cfare_seats_choice.getValue().toString()) * 1500);
    	Cfare_display.setText(String.valueOf(fare));
    	}
    
    }
    
    public void login() 
    {
    	p1 = TC.login(login_email_user.getText().toString(),login_pass_user.getText().toString() );
    	viewAccount();
    }
    
    public void INSERT() 
    {
    	p1 = TC.Insert(sign_fname_user.getText().toString(),sign_lname_user.getText().toString(),sign_mail_user.getText().toString(),sign_mob_user.getText().toString(),sign_cnic_user.getText().toString(),sign_pass_user.getText().toString());	
    }
    
    
    
    
    

    void viewAccount() {
    	
    	if(p1 != null) {
				//	Passenger p = p1.PassengerGetInfo();
					
					view_fname_user.setText(p1.getFname());
					view_lname_user.setText(p1.getLname());
					view_mail_user.setText(p1.getEmail());
					view_mob_user.setText(p1.getPhone());
					view_pass_user.setText(p1.getPsd());
					view_cnic_user.setText(p1.getCnic());
					
    	}
    }
    @SuppressWarnings("unchecked")
	@FXML
    
	
void initialize() 
    {
        assert CalculateFare_tab != null : "fx:id=\"CalculateFare_tab\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Cfare_calculate_btn != null : "fx:id=\"Cfare_calculate_btn\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Cfare_class != null : "fx:id=\"Cfare_class\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Cfare_class_choice != null : "fx:id=\"Cfare_class_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Cfare_dest != null : "fx:id=\"Cfare_dest\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Cfare_dest_choice != null : "fx:id=\"Cfare_dest_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Cfare_display != null : "fx:id=\"Cfare_display\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Cfare_seats != null : "fx:id=\"Cfare_seats\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Cfare_seats_choice != null : "fx:id=\"Cfare_seats_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Cfare_station != null : "fx:id=\"Cfare_station\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Cfare_station_choice != null : "fx:id=\"Cfare_station_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert FreightBook_tab != null : "fx:id=\"FreightBook_tab\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Home_tab != null : "fx:id=\"Home_tab\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert MyAccount_tab != null : "fx:id=\"MyAccount_tab\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert PakistanRailways_Main != null : "fx:id=\"PakistanRailways_Main\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert PakistanRailways_Main_img != null : "fx:id=\"PakistanRailways_Main_img\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Sch_station != null : "fx:id=\"Sch_station\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Sch_station_arrival != null : "fx:id=\"Sch_station_arrival\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Sch_station_choice != null : "fx:id=\"Sch_station_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Sch_station_depart != null : "fx:id=\"Sch_station_depart\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Sch_station_dest != null : "fx:id=\"Sch_station_dest\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Sch_station_id != null : "fx:id=\"Sch_station_id\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Sch_station_search_btn != null : "fx:id=\"Sch_station_search_btn\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Sch_station_src != null : "fx:id=\"Sch_station_src\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Sch_station_table != null : "fx:id=\"Sch_station_table\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Sch_station_train != null : "fx:id=\"Sch_station_train\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert Schedule_tab != null : "fx:id=\"Schedule_tab\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_BankAcc != null : "fx:id=\"TR_BankAcc\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_BankAcc_user != null : "fx:id=\"TR_BankAcc_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_class != null : "fx:id=\"TR_class\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_class_choice != null : "fx:id=\"TR_class_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_dest != null : "fx:id=\"TR_dest\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_dest_choice != null : "fx:id=\"TR_dest_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_err_ != null : "fx:id=\"TR_err_\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_reserve_btn != null : "fx:id=\"TR_reserve_btn\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_seats != null : "fx:id=\"TR_seats\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_seats_choice != null : "fx:id=\"TR_seats_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_station != null : "fx:id=\"TR_station\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TR_station_choice != null : "fx:id=\"TR_station_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert TicketReservation_tab != null : "fx:id=\"TicketReservation_tab\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert ViewProfile_titiledPane != null : "fx:id=\"ViewProfile_titiledPane\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert acc_login_img != null : "fx:id=\"acc_login_img\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert copyright_line != null : "fx:id=\"copyright_line\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_bank != null : "fx:id=\"fbook_bank\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_bank_user != null : "fx:id=\"fbook_bank_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_dest != null : "fx:id=\"fbook_dest\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_dest_choice != null : "fx:id=\"fbook_dest_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_err != null : "fx:id=\"fbook_err\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_station != null : "fx:id=\"fbook_station\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_station_choice != null : "fx:id=\"fbook_station_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_submit_btn != null : "fx:id=\"fbook_submit_btn\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_type != null : "fx:id=\"fbook_type\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_type_choice != null : "fx:id=\"fbook_type_choice\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_weight != null : "fx:id=\"fbook_weight\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert fbook_weight_user != null : "fx:id=\"fbook_weight_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert home_PopularDestinations != null : "fx:id=\"home_PopularDestinations\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert home_chairman_name != null : "fx:id=\"home_chairman_name\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert home_dest_img != null : "fx:id=\"home_dest_img\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert home_img_chairman != null : "fx:id=\"home_img_chairman\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert home_msg != null : "fx:id=\"home_msg\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert home_msg_txt != null : "fx:id=\"home_msg_txt\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert login_email != null : "fx:id=\"login_email\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert login_email_user != null : "fx:id=\"login_email_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert login_mob != null : "fx:id=\"login_mob\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert login_mob_user != null : "fx:id=\"login_mob_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert login_pass != null : "fx:id=\"login_pass\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert login_pass_user != null : "fx:id=\"login_pass_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert login_submit_btn != null : "fx:id=\"login_submit_btn\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert login_titiledpane != null : "fx:id=\"login_titiledpane\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert schedule_load_station_btn != null : "fx:id=\"schedule_load_station_btn\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_check != null : "fx:id=\"sign_check\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_cnic != null : "fx:id=\"sign_cnic\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_cnic_user != null : "fx:id=\"sign_cnic_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_fname != null : "fx:id=\"sign_fname\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_fname_user != null : "fx:id=\"sign_fname_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_img != null : "fx:id=\"sign_img\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_lname != null : "fx:id=\"sign_lname\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_lname_user != null : "fx:id=\"sign_lname_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_mail != null : "fx:id=\"sign_mail\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_mail_user != null : "fx:id=\"sign_mail_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_mob != null : "fx:id=\"sign_mob\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_mob_user != null : "fx:id=\"sign_mob_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_pass != null : "fx:id=\"sign_pass\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_pass_user != null : "fx:id=\"sign_pass_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert sign_submit_btn != null : "fx:id=\"sign_submit_btn\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert signup_titledpane != null : "fx:id=\"signup_titledpane\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_cnic != null : "fx:id=\"view_cnic\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_cnic_user != null : "fx:id=\"view_cnic_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_fname != null : "fx:id=\"view_fname\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_fname_user != null : "fx:id=\"view_fname_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_lname != null : "fx:id=\"view_lname\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_lname_user != null : "fx:id=\"view_lname_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_mail != null : "fx:id=\"view_mail\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_mail_user != null : "fx:id=\"view_mail_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_mob != null : "fx:id=\"view_mob\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_mob_user != null : "fx:id=\"view_mob_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_pass != null : "fx:id=\"view_pass\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert view_pass_user != null : "fx:id=\"view_pass_user\" was not injected: check your FXML file 'userinterface.fxml'.";
        
        fbook_err.setVisible(false);
    	//login();
        try {
        	
        	// Add source
        	
			@SuppressWarnings("unchecked")
			ObservableList<String> list = (ObservableList<String>) TR_station_choice.getItems();
			for(Station s: TC.GetStations())
			{
				String name = s.getName();
				list.add(name);
			}
			
			@SuppressWarnings("unchecked")
			ObservableList<String> fbook_station_choice_lst = (ObservableList<String>) fbook_station_choice.getItems();
			for(Station s: TC.GetStations())
			{
				String name = s.getName();
				fbook_station_choice_lst.add(name);
			}
			@SuppressWarnings("unchecked")
			ObservableList<String> Cfare_dest_choice_lst = (ObservableList<String>) Cfare_dest_choice.getItems();
			for(Station s: TC.GetStations())
			{
				String name = s.getName();
				Cfare_dest_choice_lst.add(name);
			}
			
			@SuppressWarnings("unchecked")
			ObservableList<String> Cfare_station_choice_lst = (ObservableList<String>) Cfare_station_choice.getItems();
			for(Station s: TC.GetStations())
			{
				String name = s.getName();
				Cfare_station_choice_lst.add(name);
			}
			
			
			
			@SuppressWarnings("unchecked")
			ObservableList<String> fbook_dest_choice_lst = (ObservableList<String>) fbook_dest_choice.getItems();
			for(Station s: TC.GetStations())
			{
				String name = s.getName();
				fbook_dest_choice_lst.add(name);
			}
			
			@SuppressWarnings("unchecked")
			ObservableList<String> fbook_type_choice_lst = (ObservableList<String>) fbook_type_choice.getItems();
			fbook_type_choice_lst.add("Coal & Minerals");
			fbook_type_choice_lst.add("Goods");
			fbook_type_choice_lst.add("Flammable Liquid");
			fbook_type_choice_lst.add("Minerals & Heavy Metals");
			
			
			// Add Destination
			
			ObservableList<String> list2 = (ObservableList<String>) TR_dest_choice.getItems();
			for(Station s: TC.GetStations())
			{
				String name = s.getName();
				list2.add(name);
			}
			// Add Trains
			ObservableList<String> list3 = (ObservableList<String>) TR_class_choice.getItems();
			for(PassengerTrain s: TC.getPTrains())
			{
				String name = s.getName();
				list3.add(name);
			}
			// Add Seats
			
			ObservableList<String> list4 = (ObservableList<String>) TR_seats_choice.getItems();
			for(int i=1 ; i<6 ; i++)
			{
				String name = String.valueOf(i);
				list4.add(name);
			}
			
			ObservableList<String> Cfare_seats_choice_lst = (ObservableList<String>) Cfare_seats_choice.getItems();
			for(int i=1 ; i<6 ; i++)
			{
				String name = String.valueOf(i);
				Cfare_seats_choice_lst.add(name);
			}
			
			fbook_err.setVisible(false);
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }

}
