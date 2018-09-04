package sec06.exam01_button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{

	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;
	@FXML private ImageView chkImageView;
	@FXML private ImageView radioImageView;
	@FXML private ToggleGroup group;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//ToggleGroup에 속해져있는 RadioButton을 속성감시를 통해 ImageView에 Image가 
		//뿌려지도록 한다. RadioButton이 바뀔 때 마다 ChangeListener가 발생하여 root.fxml
		//파일에 있는 RadioButton에 있는 userData="" 속성을 이용해서 파일이름을 지정한 후,
		//ImageView에 뿌려준다.
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				Image image = new Image(getClass().getResource("images/"+
								newValue.getUserData().toString()).toString());
				radioImageView.setImage(image);
			}
			
		});
	}
	public void handleChkAction(ActionEvent event) {
		if(chk1.isSelected() && chk2.isSelected()) {
			//ImageView의 setImage의 매개값으로 Image객체를 주면 되는데 현재 파일을 기준으로 상대경로를 얻는다.
			//Image의 매개값은 String타입의 문자열 URL이다. 
			chkImageView.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
		}
		else if(chk1.isSelected()) {
			chkImageView.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		}
		else if(chk2.isSelected()) {
			chkImageView.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		}
		else {
			chkImageView.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
		}
	}
	
	public void handleBtnExitAction(ActionEvent event) {
		System.out.println("버튼클릭으로 어플리케이션 종료");
		Platform.exit();
	}
}
