package sec_verify05;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{

	@FXML private ListView<String> list;
	@FXML private ImageView imageView;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	      list.setItems(FXCollections.observableArrayList("k1","k2"));
	      list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

	    	  @Override
	    	public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
	    		imageView.setImage(new Image(getClass().getResource("images/"+newValue+".png").toString()));
	    	}
	      });
	}
}
