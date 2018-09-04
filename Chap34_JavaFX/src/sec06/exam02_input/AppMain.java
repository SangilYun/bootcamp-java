package sec06.exam02_input;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("AppMain");
		primaryStage.show();
		//종료시(람다식) 
		primaryStage.setOnCloseRequest(event -> System.out.println("종료 클릭"));
		
	}
	public static void main(String[] args) {
		 launch(args);
	}
}
