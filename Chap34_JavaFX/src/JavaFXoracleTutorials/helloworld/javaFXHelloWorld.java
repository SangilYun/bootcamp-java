package JavaFXoracleTutorials.helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class javaFXHelloWorld extends Application{

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("HelloWorld!");
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello World!");
			}
		});
		
		StackPane root = new StackPane(btn);
//		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);	
	}

}
