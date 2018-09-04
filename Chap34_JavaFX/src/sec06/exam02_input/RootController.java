package sec06.exam02_input;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable{

	@FXML private TextField textTitle;
	@FXML private PasswordField textPassword;
	@FXML private ComboBox<String> comboPublic;
	@FXML private DatePicker dateExit;
	@FXML private TextArea textContent;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		comboPublic.getItems().addAll("Yes","No");
	}
	
	public void handleBtnRegAction(ActionEvent event) {
		String title = textTitle.getText();
		System.out.println("제목 : " + title);
		
		String password = textPassword.getText();
		System.out.println("비밀번호 : " + password);
		
		String strPublic = comboPublic.getValue();
		if(strPublic!=null)
			System.out.println("공개 여부 : " + strPublic);
		
		//DataPicker는 사용자로부터 날짜가 선택이 되어야지만 그 값을 
		//LocalDate로 리턴을 한다. 하지만, 아무선택을 하지 않았다면 null이 
		//리턴 되어지므로 유효성 검사를 해야한다.
		LocalDate localDate=dateExit.getValue();
		if(localDate!=null)
			System.out.println("게시종료일 : " + localDate.toString());
		
		String content = textContent.getText();
		System.out.println("내용 : " + content);
	}
	
	//어플리케이션 종료
	public void handleBtnCancelAction(ActionEvent event) {
		Platform.exit();
	}
}
