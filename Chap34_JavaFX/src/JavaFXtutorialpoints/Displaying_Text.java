package JavaFXtutorialpoints;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Displaying_Text extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Creating a Text object
		Text text = new Text();
		
		//Setting the Font
		text.setFont(new Font(45));
		
		//Setting the position of the Text
		text.setX(50);
		text.setY(150);
		
		//Setting the text to be added
		text.setText("Welcom to Tutorialsoint");
		
		//Setting properties to the line
		Group group = new Group(text);
		Scene scene = new Scene(group, 600,300);
		primaryStage.setTitle("Displaying Text");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		 launch(args);
	}
}
