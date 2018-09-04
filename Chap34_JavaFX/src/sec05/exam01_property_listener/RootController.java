package sec05.exam01_property_listener;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable{

   @FXML private Label label1;
   @FXML private Label label2;
   @FXML private Slider slider;
   
   
   public void initialize(URL location, ResourceBundle resources) {
      System.out.println(Thread.currentThread().getName());
      //slider컨트롤의 속성값을 감시하기 위해 valueProperty()에 ChangeListener 등록
      slider.valueProperty().addListener(new ChangeListener<Number>() {
         /*oldValue는 변경되기 이전값, newValue는 변경된값을 의미한다.
         < ? extends Number>는 제네릭 와일드 카드 타입으로 Number클래스나 
         Number를 상속받는 하위클래스만 오도록 상위탕비을 제한한다*/
         
         public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
            //Slider의 값의 변경(속성감시)에 따라 Label컨트롤의 Font설정의 값을 매핑함으로써 글자의 크기가 바뀌게 되는것이다.
            label1.setFont(new Font(arg2.doubleValue()));
            label2.setFont(new Font(arg2.doubleValue()));
            System.out.println("변경전 값 : "+arg1.doubleValue());
            System.out.println("변경후 값 : "+arg2.doubleValue());
         }
      });
   }
}