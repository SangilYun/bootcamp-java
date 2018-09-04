package sec03.exam02_hbox_vbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

   @Override
   public void start(Stage primaryStage) throws Exception {

      Parent p = FXMLLoader.load(getClass().getResource("root.fxml"));
      Scene s = new Scene(p);

      primaryStage.setTitle("HBox_VBox_Example");
      primaryStage.setScene(s);
      primaryStage.show();

   }

   public static void main(String[] args) {
      Application.launch(args);
   }
}