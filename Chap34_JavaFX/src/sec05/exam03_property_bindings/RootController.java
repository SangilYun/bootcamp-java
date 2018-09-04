package sec05.exam03_property_bindings;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable{

	
	//창을 늘리거나 줄여도 계속 중앙에 위치시킴.
	@FXML private AnchorPane root;
	@FXML private Circle circle;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		circle.centerXProperty().bind(Bindings.divide(root.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(root.heightProperty(), 2));
				
	}
}
