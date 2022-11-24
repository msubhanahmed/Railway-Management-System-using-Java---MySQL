package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class UserController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Tab accountab;

    @FXML
    private Tab faretab;

    @FXML
    private Tab freighttab;

    @FXML
    private Tab hometab;
    
    @FXML
    private Tab scheduletab;

    @FXML
    private Tab ticketreservationtab;

    @FXML
    private TableView<?> scheduletable;
    
    @FXML
    private TableColumn<?, ?> scheduletrain;
    
    @FXML
    private TableColumn<?, ?> scheduleID;

    @FXML
    private TableColumn<?, ?> schedulearriv;

    @FXML
    private TableColumn<?, ?> scheduledept;

    @FXML
    private TableColumn<?, ?> scheduledest;

    @FXML
    private TableColumn<?, ?> schedulesource;

    @FXML
    private ChoiceBox<?> schedulestationlist;

    @FXML
    private Button schedulestationlistbtn;

    @FXML
    private Label stationlabel;


    @FXML
    void getstationschedule(ActionEvent event) 
    {
    	
    }

    @FXML
    void initialize() {
        assert accountab != null : "fx:id=\"accountab\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert faretab != null : "fx:id=\"faretab\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert freighttab != null : "fx:id=\"freighttab\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert hometab != null : "fx:id=\"hometab\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert scheduleID != null : "fx:id=\"scheduleID\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert schedulearriv != null : "fx:id=\"schedulearriv\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert scheduledept != null : "fx:id=\"scheduledept\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert scheduledest != null : "fx:id=\"scheduledest\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert schedulesource != null : "fx:id=\"schedulesource\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert schedulestationlist != null : "fx:id=\"schedulestationlist\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert schedulestationlistbtn != null : "fx:id=\"schedulestationlistbtn\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert scheduletab != null : "fx:id=\"scheduletab\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert scheduletable != null : "fx:id=\"scheduletable\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert scheduletrain != null : "fx:id=\"scheduletrain\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert stationlabel != null : "fx:id=\"stationlabel\" was not injected: check your FXML file 'userinterface.fxml'.";
        assert ticketreservationtab != null : "fx:id=\"ticketreservationtab\" was not injected: check your FXML file 'userinterface.fxml'.";

    }

}
