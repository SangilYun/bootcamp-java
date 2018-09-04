package sec05.exam02_property_binder;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController implements Initializable{

	@FXML private TextArea textArea1;
	@FXML private TextArea textArea2;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//Bindings클래스를 이용한 바인드.
		//즉, 양쪽다 서로의 컨트롤에 영향을 주는 형태이다.
		Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());
		
		//Alternative 
//		textArea2.textProperty().bindBidirectional(textArea1.textProperty());
	}
}
