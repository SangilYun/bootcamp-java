package FXMLExample;


import JavaFXoracleTutorials.login.simpleLogin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXMLExample extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("fxmlexample.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("FXML Welcome");
		scene.getStylesheets().add(simpleLogin.class.getResource("login.css").toExternalForm());

        primaryStage.show();		
	}
	
	public static void main(String[] args) {
		launch(args);	
	}

}
