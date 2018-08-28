package sec01.exam07_TextField;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldExample {

	public static void main(String[] args) {
		 Frame f = new Frame("Login");
		 f.setSize(400,130);
		 //LayoutManager를 FlowLayout으로 한다.
		 f.setLayout(new FlowLayout());
		 
		 Label lid = new Label("아이디 : ", Label.RIGHT); //정렬을 오른쪽으로.
		 Label lpwd = new Label("패스워드 : ", Label.LEFT); //정렬을 왼쪽으로.
		 
		 //약 10개의글자를 입력할 수 있는 TextField생성
		 TextField id = new TextField(10);
		 TextField pwd = new TextField(10);
		 
		 //입력한 값 대신 '*'가 보여지도록 한다. (에코문자 설정) 비밀번호를 위해서
		 pwd.setEchoChar('*');
		 char ch = pwd.getEchoChar();
		 System.out.println("설정한 에코문자 : " + ch);
		 
		 f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		 });
		
		 //생성한 컴포넌트들은 Frame에 포함시킨다.
		 f.add(lid); f.add(id); f.add(lpwd); f.add(pwd);
		 f.setVisible(true);
	}
}
