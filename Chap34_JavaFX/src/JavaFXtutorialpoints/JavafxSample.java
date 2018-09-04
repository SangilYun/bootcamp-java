package JavaFXtutorialpoints;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavafxSample extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		/*
		 * Code for JavaFX application.
		 * (Stage, scene, scene graph)
		 */
		Group root = new Group();
		//Retrieving the observable list object
		ObservableList list = root.getChildren();
		
		//Setting the text object as a node
//		list.add(NodeObject);
		//We can also add Node objects to the group, just by passing them to the Group class
		//and to its constructor at the time of instantiation.
//		Group root = new Group(NodeObject);
		
		//creating a stack pane
//		StackPane pane = new StackPane();
		
		//Adding text area to the pane
//		ObservableList list = pane.getChildren();
//		list.add(NodeObject);
		
		//You can create a Scene by instantiating this class
		//While instantiating, it is mandatory to pass the root object to the constructor
		//of the scene class
//		Scene scene = new Scene(root);
		
		//You can also pass two parameters of double type representing the height and
		//width of the scene as shown below
		Scene scene = new Scene(root,600,300);
		
		//Setting the title to Stage
		primaryStage.setTitle("Sample application");
		
		//Setting the scene to Stage
		primaryStage.setScene(scene);
		
		//Displaying the stage
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
