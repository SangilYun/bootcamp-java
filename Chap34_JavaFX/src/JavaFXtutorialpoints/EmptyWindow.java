package JavaFXtutorialpoints;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//Step 1 : Creating a Class
public class EmptyWindow extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Step 2 : Creating a Group Object
		Group root = new Group();
		//Step3 : Creating a Scene Object
		Scene scene = new Scene(root,600,300);
		
		//Setting color to the scene
		scene.setFill(Color.BROWN);
		
		//Step4 : Setting the Title of the Stage
		primaryStage.setTitle("Sample Application");
		//Step5 : Adding Scene to the Stage
		primaryStage.setScene(scene);
		//Step6 : Displaying the Contents of the Stage
		primaryStage.show();
	}
	public static void main(String[] args) {
		//Step7 : Launching the Application
		launch(args);

	}

}
