package sec03.exam05_tilepane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);
		
		//primaryStage의 크기를 미리 정해놓고 fxml파일에서 루트컨테이너 크기를 설정해도 윈도우창 크기가 미리 정해져있어
		//의미가 없다. 따라서 어디서 설정할것인지 미리 정해놓고 코딩하자 .
		primaryStage.setTitle("TilePaneExample");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		 launch(args);
	}
}
