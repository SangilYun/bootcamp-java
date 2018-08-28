package sec01.exam13_Dialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogExample_event {

	public static void main(String[] args) {
		 
		Frame f = new Frame("Parent");
		f.setSize(500,500);
		
		//parent Frame을 f로 하고, modal을 true로 해서 필수응답 Dialog로 함
		Dialog info = new Dialog(f,"Informantion",true);
		info.setSize(150, 100);
		info.setLocation(550,50);	//parent frame이 아닌 화면기준의 위치
		info.setLayout(new FlowLayout());
		
		Label msg = new Label("이 라벨은 모달", Label.CENTER);
		Button ok = new Button("OK");
		
		//Ok 버튼에 ActionListener를 추가하였다. 리스너는 감시한다고 생각하면 된다.
		//따라서 매개값으로 인터페이스인 ActionListener를 갖고 있고 그것을 익명으로 구현하였다.
		//이제 Ok버튼을 누르면 Dialog가 사라질 것이다.
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	//익명구현객체
				System.out.println("ActionPerformed");
				//info.setVisible(false);	//Dialog를 안보이게 한다.(메모리 제거 안됨)
				info.dispose(); 	//dialog를 메모리에서 없앤다.
			}
		});
		
		//윈도우이벤트 처리부분, 매개변수가 WindowAdapter클래스이다.
		//WindowAdapter클래스는 WindowListener인터페이스에 있는 7개의 
		//추상메서드를 구현해 놓았다. ({}으로만 해놓았다. 즉 내용이 없다.)

		f.addWindowListener(new WindowAdapter() {	//WindowAdapter는 클래스임. 즉 익명자식객체 
			@Override
			public void windowClosing(WindowEvent e) {
				//System.out.println("윈도우 닫힘");
				e.getWindow().setVisible(false); //윈도우창을 보이지 않게 한다.
				e.getWindow().dispose();	//프레임을 메모리에서 제거한다.
				System.exit(0);	//프로그램 종료
			}
		});
		info.add(msg);
		info.add(ok);
		f.setVisible(true);
		info.setVisible(true);
	}

}
