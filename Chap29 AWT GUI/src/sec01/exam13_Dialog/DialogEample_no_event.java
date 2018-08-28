package sec01.exam13_Dialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class DialogEample_no_event {

	public static void main(String[] args) {
		 
		Frame f = new Frame("Parent");
		f.setSize(500,500);
		
		//Parent Frame을(상속관계가 아니다!) f로 하고, modal을 true로 해서 필수응답 Dialog로 한다.
		//이렇게 되면 dialog창이 닫혀야 Frame을 사용할 수 있게 된다.
		//하지만 false로 설정하면 Dialog에 상관없이 Frame을 움직일 수 있다.
		
		Dialog info = new Dialog(f,"Information",true);
		info.setSize(150, 100);
		
		//parent Frame이 아닌, 화면이 위치의 기준이 된다. 이유는 Dialog역시 독립적인 컨테이너기 때문.
		
		info.setLocation(550,50);
		
		//Dialog의 레이아웃 매니져도 역시 기본값은 BorderLayout이라 아래와 같이
		//FlowLayout으로 바꾸었다.
		info.setLayout(new FlowLayout());
		//Dialog도 컨테이너기 때문에 컴포넌트를 아래와 같이 포함할 수 있다.
		Label msg = new Label("이 라벨은 modal", Label.CENTER);	//글자 중앙 정렬
		Button ok = new Button("ok");
		info.add(msg);
		info.add(ok);
		//지금은 이벤트 처리를 하지 않았기 때문에 ok버튼을 눌러도 아무런 일이 
		//일어나지 않는다.
		
		f.setVisible(true);
		info.setVisible(true);
		
		
		

	}

}
