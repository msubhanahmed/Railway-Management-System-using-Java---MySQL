package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import BussinessLogic.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;




public class Admin_Controller {
	
	Ticket_Counter TC = new Ticket_Counter();
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Tab ManageStation_Tab;
    @FXML
    private Button Switch_to_user;
    @FXML
    private TextField acc_cnic;
    @FXML
    private Label acc_cnic_label;
    @FXML
    private TextField acc_email;
    @FXML
    private Label acc_email_label;
    @FXML
    private TextField acc_mobile;
    @FXML
    private Label acc_mobile_label;
    @FXML
    private TextField acc_name;

    @FXML
    private Label acc_name_label;

    @FXML
    private TextField acc_password;

    @FXML
    private Label acc_password_label;

    @FXML
    private Tab account_info_tab;

    @FXML
    private Button add_train_btn;

    @FXML
    private TextField add_train_maxload;

    @FXML
    private TextField add_train_name;

    @FXML
    private ChoiceBox<?> add_train_type_selector;

    @FXML
    private Button create_station_btn;

    @FXML
    private Label createstationlabel;

    @FXML
    private TextField crt_station_arrival;

    @FXML
    private Button crt_station_btn;

    @FXML
    private TextField crt_station_dept;

    @FXML
    private TextField crt_station_dest;

    @FXML
    private Label crt_station_label;

    @FXML
    private TextField crt_station_source;

    @FXML
    private TableColumn<?, ?> del_schedule_ID_col;

    @FXML
    private ChoiceBox<?> del_schedule_ID_selector;

    @FXML
    private TableColumn<?, ?> del_schedule_arriv_col;

    @FXML
    private Button del_schedule_btn;

    @FXML
    private TableColumn<?, ?> del_schedule_dept_col;

    @FXML
    private TableColumn<?, ?> del_schedule_dest_col;

    @FXML
    private Label del_schedule_label;

    @FXML
    private Button del_schedule_refresh_btn;

    @FXML
    private TableColumn<?, ?> del_schedule_source_col;

    @FXML
    private TableView<ScheduleEntry> del_schedule_table;

    @FXML
    private Button del_train_btn;

    @FXML
    private ChoiceBox<?> del_train_id_selector;

    @FXML
    private Label del_train_label;

    @FXML
    private Button delete_station_btn;

    @FXML
    private Label deletestationlabel;

    @FXML
    private Tab mng_schedule_tab;

    @FXML
    private TableColumn<?, ?> mng_station_ID_col;

    @FXML
    private TableColumn<?, ?> mng_station_name_col;

    @FXML
    private TableColumn<?, ?> mng_station_phone_col;

    @FXML
    private Label mng_train_add_label;

    @FXML
    private TableColumn<?, ?> mng_train_id_col;

    @FXML
    private TableColumn<?, ?> mng_train_maxload_col;

    @FXML
    private TableColumn<?, ?> mng_train_name_col;

    @FXML
    private Button mng_train_refresh_table;

    @FXML
    private Tab mng_train_tab;

    @FXML
    private TableView<PassengerTrain> mng_train_table;

    @FXML
    private TableColumn<?, ?> mng_train_type_col;

    @FXML
    private TextField new_station_name;

    @FXML
    private TextField new_station_number;
    
    @FXML
    private Button refresh_station_btn;
    
    @FXML
    private Button refresh_station_table;

    @FXML
    private ChoiceBox<?> select_station_delete_ID;
    
    @FXML
    private TableView<Station> station_table;

    Admin d2 = new Admin();
    void  account_info_tab()
    {
    	Admin d = d2.AdminGetInfo();
    	acc_name.setText(d.getFname() +" "+ d.getLname()); 
    	acc_cnic.setText(d.getCnic());
    	acc_email.setText(d.getEmail());
    	acc_mobile.setText(d.getPhone());
    	acc_password.setText(d.getPsd());
    }
    @FXML
    void Refresh_Station_table(ActionEvent e) 
    {
    	mng_station_ID_col.setCellValueFactory(new PropertyValueFactory<>("ID"));
    	mng_station_name_col.setCellValueFactory(new PropertyValueFactory<>("name"));
    	mng_station_phone_col.setCellValueFactory(new PropertyValueFactory<>("contact"));
    
		ObservableList<Station> list2 = FXCollections.observableArrayList();

		for(Station s: TC.GetStations())
		{
			list2.add(s);
		}
	    station_table.setItems(list2);
	}
    
    
    public void RefreshScheduleDel(ActionEvent e) 
    {
    	del_schedule_ID_col.setCellValueFactory(new PropertyValueFactory<>("ID"));
    	del_schedule_source_col.setCellValueFactory(new PropertyValueFactory<>("Src"));
    	del_schedule_dest_col.setCellValueFactory(new PropertyValueFactory<>("Dest"));
    	del_schedule_arriv_col.setCellValueFactory(new PropertyValueFactory<>("arrival"));
    	del_schedule_dept_col.setCellValueFactory(new PropertyValueFactory<>("dept"));
    
    	
    	
    	
			ObservableList<ScheduleEntry> list3 = FXCollections.observableArrayList();
			for(Station i : TC.GetStations()) {
				
						for(ScheduleEntry s: TC.GetSchedule(i.getName()))
						{
							list3.add(s);
						}
						
			}
			del_schedule_table.setItems(list3);
			
	}
    
    public void RefreshTrains(ActionEvent e) 
    {
    	mng_train_id_col.setCellValueFactory(new PropertyValueFactory<>("ID"));
    	mng_train_name_col.setCellValueFactory(new PropertyValueFactory<>("name"));
    	mng_train_type_col.setCellValueFactory(new PropertyValueFactory<>("Type"));
    	mng_train_maxload_col.setCellValueFactory(new PropertyValueFactory<>("maxCapacity"));
 
    	
			ObservableList<PassengerTrain> list4 = FXCollections.observableArrayList();
			for(PassengerTrain s: TC.getPTrains())
			{
				list4.add(s);
			}
			
			mng_train_table.setItems(list4);
			
	}    
    @FXML
    void initialize() {
        assert ManageStation_Tab != null : "fx:id=\"ManageStation_Tab\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert Switch_to_user != null : "fx:id=\"Switch_to_user\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert acc_cnic != null : "fx:id=\"acc_cnic\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert acc_cnic_label != null : "fx:id=\"acc_cnic_label\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert acc_email != null : "fx:id=\"acc_email\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert acc_email_label != null : "fx:id=\"acc_email_label\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert acc_mobile != null : "fx:id=\"acc_mobile\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert acc_mobile_label != null : "fx:id=\"acc_mobile_label\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert acc_name != null : "fx:id=\"acc_name\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert acc_name_label != null : "fx:id=\"acc_name_label\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert acc_password != null : "fx:id=\"acc_password\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert acc_password_label != null : "fx:id=\"acc_password_label\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert account_info_tab != null : "fx:id=\"account_info_tab\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert add_train_btn != null : "fx:id=\"add_train_btn\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert add_train_maxload != null : "fx:id=\"add_train_maxload\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert add_train_name != null : "fx:id=\"add_train_name\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert add_train_type_selector != null : "fx:id=\"add_train_type_selector\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert create_station_btn != null : "fx:id=\"create_station_btn\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert createstationlabel != null : "fx:id=\"createstationlabel\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert crt_station_arrival != null : "fx:id=\"crt_station_arrival\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert crt_station_btn != null : "fx:id=\"crt_station_btn\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert crt_station_dept != null : "fx:id=\"crt_station_dept\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert crt_station_dest != null : "fx:id=\"crt_station_dest\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert crt_station_label != null : "fx:id=\"crt_station_label\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert crt_station_source != null : "fx:id=\"crt_station_source\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_schedule_ID_col != null : "fx:id=\"del_schedule_ID_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_schedule_ID_selector != null : "fx:id=\"del_schedule_ID_selector\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_schedule_arriv_col != null : "fx:id=\"del_schedule_arriv_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_schedule_btn != null : "fx:id=\"del_schedule_btn\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_schedule_dept_col != null : "fx:id=\"del_schedule_dept_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_schedule_dest_col != null : "fx:id=\"del_schedule_dest_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_schedule_label != null : "fx:id=\"del_schedule_label\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_schedule_refresh_btn != null : "fx:id=\"del_schedule_refresh_btn\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_schedule_source_col != null : "fx:id=\"del_schedule_source_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_schedule_table != null : "fx:id=\"del_schedule_table\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_train_btn != null : "fx:id=\"del_train_btn\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_train_id_selector != null : "fx:id=\"del_train_id_selector\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert del_train_label != null : "fx:id=\"del_train_label\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert delete_station_btn != null : "fx:id=\"delete_station_btn\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert deletestationlabel != null : "fx:id=\"deletestationlabel\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_schedule_tab != null : "fx:id=\"mng_schedule_tab\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_station_ID_col != null : "fx:id=\"mng_station_ID_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_station_name_col != null : "fx:id=\"mng_station_name_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_station_phone_col != null : "fx:id=\"mng_station_phone_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_train_add_label != null : "fx:id=\"mng_train_add_label\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_train_id_col != null : "fx:id=\"mng_train_id_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_train_maxload_col != null : "fx:id=\"mng_train_maxload_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_train_name_col != null : "fx:id=\"mng_train_name_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_train_refresh_table != null : "fx:id=\"mng_train_refresh_table\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_train_tab != null : "fx:id=\"mng_train_tab\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_train_table != null : "fx:id=\"mng_train_table\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert mng_train_type_col != null : "fx:id=\"mng_train_type_col\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert new_station_name != null : "fx:id=\"new_station_name\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert new_station_number != null : "fx:id=\"new_station_number\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert refresh_station_table != null : "fx:id=\"refresh_station_table\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        assert select_station_delete_ID != null : "fx:id=\"select_station_delete_ID\" was not injected: check your FXML file 'AdminInterface.fxml'.";
        
        
        account_info_tab();
        
        
    	@SuppressWarnings("unchecked")
		ObservableList<String> list = (ObservableList<String>) select_station_delete_ID.getItems();
		for(Station s: TC.GetStations())
		{
			String name = s.getName();
			list.add(name);
		}
		
		
		
		
      
       
    }

}
