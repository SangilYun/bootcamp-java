package sec04.exam02_fxml_controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable{
	//root.fxml에 설정한 컨트롤의 fx:id를 필드로 선언하여 참조한다.
	@FXML private Button btn1;
	@FXML private Button btn2;
//	@FXML private Button btn3;
	
	//initialize란 메서드 AppMain.java가 로딩될 때, FXMLLoader.load()가 실행될 때 컨트롤러 
	//객체도 만들어 지고, 컨트롤 참조가 이루어진 다음 initialize()가 자동 호출된다.
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("initialize메서드 호출");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				//이벤트 처리 코드가 별로 없다면, 여기에 직접 작성을 해도 좋으나
				//통상적으로 이벤트 처리코드는 상당히 많고 따로 메서드를 작성한다. 
				//하여, 아래와 같이 이벤트 처리 메서드를 호출하는 코드만 여기서 
				//작성하고, 메서드느 ㄴ따로 작성해주도록 하자 
				handleBtn1Action(event);
				//System.out.println("버튼1클릭");
				
			}
		});
		btn2.setOnAction(event -> handleBtn2Action(event)); //람다식으로 버튼 2이벤트 처리 
	}
	public void handleBtn1Action(ActionEvent event) {
		System.out.println("버튼 1 클릭");
	}
	
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("버튼 2 클릭");
	}
	
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("버튼 3 클릭");
	}
}
