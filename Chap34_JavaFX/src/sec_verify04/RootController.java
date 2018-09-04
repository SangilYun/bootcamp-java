package sec_verify04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML private TextField tf1_1;
	@FXML private TextField tf1_2;
	@FXML private TextField tf2_1;
	@FXML private TextField tf2_2;
	@FXML private TextField tf3_1;
	@FXML private TextField tf3_2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		//decimal -> binary
		tf1_1.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				try {
					int input = Integer.parseInt(tf1_1.getText());
					tf1_2.setText(Integer.toBinaryString(input));
				}catch(NumberFormatException e) {
					tf1_2.clear();
				}
			}
		});
		//decimal -> octal
		tf2_1.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				try {
					int input = Integer.parseInt(tf2_1.getText());
					tf2_2.setText(Integer.toOctalString(input));
				}catch(NumberFormatException e) {
					tf2_2.clear();
				}
			}
		});
		//decimal -> hexadecimal
		tf3_1.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				try {
					int input = Integer.parseInt(tf3_1.getText());
					tf3_2.setText(Integer.toHexString(input));
				}catch(NumberFormatException e) {
					tf3_2.clear();
				}
			}
		});
	}
}
