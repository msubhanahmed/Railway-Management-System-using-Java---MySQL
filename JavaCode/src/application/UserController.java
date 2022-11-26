package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.collections.ObservableList;

import BussinessLogic.*;

public class UserController
{
	/* Business Logic Controller Class_____ Use this class to call all necessary BL functions*/
	Ticket_Counter TC = new Ticket_Counter();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loadStations;

    @FXML
    private ChoiceBox<?> schedulestationlist;

    @FXML
    void fetchstations(ActionEvent event) 
    {
    	
    	try {
			@SuppressWarnings("unchecked")
			ObservableList<String> list = (ObservableList<String>) schedulestationlist.getItems();
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
    void initialize() {
        assert loadStations != null : "fx:id=\"loadStations\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert schedulestationlist != null : "fx:id=\"schedulestationlist\" was not injected: check your FXML file 'userinterface.fxml'.";

    }

}
