package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.*;


public class Main extends Application {
	FXMLLoader loader = new FXMLLoader();
	@Override
	public void start(Stage primaryStage) {
		try {
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
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void changeScene(Stage currentStage , String filename) throws IOException {
		
		try {
			FileInputStream fxmlStream = new FileInputStream("E:\\Classes\\SDA\\SemesterProject\\JavaCode\\src\\application\\AdminInterface.fxml");
			Parent pane = loader.load(fxmlStream);
			 
			Scene scene = new Scene(pane,600,600);
			currentStage.setScene(scene);
			currentStage.show();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found Exception.");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO Exception.");
			//e.printStackTrace();
		}
		
	}


}
