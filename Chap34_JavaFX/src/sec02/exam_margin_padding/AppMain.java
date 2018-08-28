package sec02.exam_margin_padding;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{

   @Override
   public void start(Stage primaryStage) throws Exception {
      
      /*
       * 두개의 여백주는 방법을 잘 이해할 필요가 있다.
       * 매개값을 바꿔가보면서 이해를 해보자
       * 
       * 패딩설정
       * HBox컨테이너를 기준으로 하여 시계방향으로 각각 여백을 준다.(들여쓰기)
       */ 
      
      /*HBox hbox = new HBox();
      hbox.setPadding(new Insets(50,20,20,50));
         Button button = new Button();
         button.setPrefSize(100, 100);
         */
       
      //마진 설정
      //Button을 기준으로 하여 시계바향으로 각각 여백을 준다. (바깥여백)
      HBox hbox = new HBox();
      Button button = new Button();
      button.setPrefSize(100, 100);
      HBox.setMargin(button, new Insets(20,20,50,50));
      
      hbox.getChildren().add(button);
      Scene scene = new Scene(hbox);
      primaryStage.setTitle("AppMain");
      primaryStage.setScene(scene);
      primaryStage.show();
        
   }
   public static void main(String[] ag) {
      launch(ag);  
   }
}