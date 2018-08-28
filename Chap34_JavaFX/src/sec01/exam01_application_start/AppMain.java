package sec01.exam01_application_start;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{

   @Override
   public void start(Stage primaryStage) throws Exception {
      String threadName = Thread.currentThread().getName();
      
      System.out.println("실행 쓰레드 : "+threadName);
      primaryStage.show();
   }
   
   public static void main(String[] args) {
      String threadName = Thread.currentThread().getName();
      System.out.println("실행 쓰레드 : "+threadName);
      //자바 FX어플리케이션 스레드를 생성하여 start()를 호출해준다
      Application.launch(args);
   }

}