package JavaFXtutorial;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Drawing_A_Straight_Line extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Creating a Line
		Line line = new Line();
		line.setStartX(100);
		line.setStartY(150);
		line.setEndX(500);
		line.setEndY(150);
		
		Group root = new Group(line);
//		Group root = new Group();
//		ObservableList list = root.getChildren();
//		list.add(line);
		Scene scene = new Scene(root,600,300);
		primaryStage.setTitle("Drawing a Straight Line");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
