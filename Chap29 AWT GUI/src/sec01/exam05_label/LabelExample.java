package sec01.exam05_label;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelExample {

	public static void main(String[] args) {

		Frame f = new Frame("Login");
		f.setSize(300,200);
		f.setLayout(null);	//LayoutManager 해제
		
		Toolkit tk = Toolkit.getDefaultToolkit();	//구현된 Toolkit객체를 얻는다.
		Dimension screenSize = tk.getScreenSize();	//화면의 크기를 구한다.
		
		f.setLocation(screenSize.width/2-150, screenSize.height/2-100);
		f.setVisible(true);	//생성한 Frame을 화면에 보이도록 한다.
		
		Label id = new Label("ID : ");	//라벨을 생성하고 크기와 위치를 지정한다.
		//setBounds()는 setSize()와 setLocation()을 합쳐놓은 메서드다. 
		id.setBounds(50,50,30,10);	//50,50위치에 크기가 가로 30, 세로 10
		
		Label pwd = new Label("Password : ");
		pwd.setBounds(50,65,100,10);
		
		//생성한 Label을 frame에 포함시킨다.
		f.add(id);
		f.add(pwd);
		f.setVisible(true);
		//frame의 크기를 조절불가 하게 만드는 메서드가 setResizable(false)이다. 
		f.setResizable(false);
		
	}

}
