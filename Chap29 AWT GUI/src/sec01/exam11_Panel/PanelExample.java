package sec01.exam11_Panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelExample {

	public static void main(String[] args) {
		 
		Frame f = new Frame("Panel");
		f.setSize(500,500);
		f.setLayout(null); //frame이 LayoutManager를 사용하지 않도록 한다.
		
		//Panel은 종속적인 컨테이너로써 기본적으로 FlowLayout()을 사용한다.
		//따라서 Panel안에 들어갈 컴포넌트의 위치를 따로 지정해주지 않아도 된다. 
		Panel p = new Panel();
		p.setBackground(Color.green); //Panel의 배경을 녹색으로 한다.
		p.setSize(300,300);
		p.setLocation(50,50);
		
		Button ok = new Button("OK");
		Button cancel = new Button("CANCEL");
		
		//현재 버튼들이 Panel컨테이너에 추가가 되어 있기 때문에 프레임 컨테이너에 
		//영향을 받는 것이 아니라 Panel컨테이너의 레이아웃 매니저에 영향을 받는다. 
		p.add(ok);	//Button을 panel에 포함
		p.add(cancel);
		f.add(p);
		f.setVisible(true);
	}
}
