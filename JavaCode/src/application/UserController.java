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
	StationList sl = new StationList();
	
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
    	ObservableList<String> list = (ObservableList<String>) schedulestationlist.getItems();
    	for(Station s: sl.getSl())
    	{
    		String name = s.getName();
    		list.add(name);
    	}
    }

    @FXML
    void initialize() {
        assert loadStations != null : "fx:id=\"loadStations\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert schedulestationlist != null : "fx:id=\"schedulestationlist\" was not injected: check your FXML file 'userinterface.fxml'.";

    }

}
