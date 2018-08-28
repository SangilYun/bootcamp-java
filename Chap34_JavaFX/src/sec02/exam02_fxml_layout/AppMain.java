package sec02.exam02_fxml_layout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//FXML을 이용한 레이아웃 배치함. 자바코드와 완전 분리됨.
		//지금은 자바코드에 익숙하다. 단순한 부분은 상관없지만 복잡한 레이아웃이라면 어떨까?
		//자바코드로 이루어진것은 매우 난해하고 코드를 이해하기가 어렵다. 
		//하지만, FXML파일로 레이아웃을 만들면, 태그작성에 어느정도 익숙해지면 코드 파악이 매우 쉽고
		//아울러 자바코드 파일은 건들 필요가 없어 디자이너와 혀업이 매우 쉽다.

		//root.fxml에 작성된 대로 parent즉, 컨테이너와 컨트롤을 생성
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.setTitle("AppMain");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
