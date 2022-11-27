package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	FXMLLoader loader = new FXMLLoader();
	Stage stg;
	@Override
	public void start(Stage primaryStage) throws IOException {
		try {
			stg = primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("userinterface.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("UserInterface");
			primaryStage.setMaximized(true);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		changeScene();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void changeScene() throws IOException {
		
		
		try 
		{
			Parent pane = FXMLLoader.load(getClass().getResource("AdminInterface.fxml"));
			stg.getScene().setRoot(pane);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
