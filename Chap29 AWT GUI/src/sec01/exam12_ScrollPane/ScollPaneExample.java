package sec01.exam12_ScrollPane;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScollPaneExample {

	public static void main(String[] args) {
		 
		Frame f = new Frame("ScrollPaneExample");
		f.setSize(300,300);
		
		ScrollPane sp = new ScrollPane();
		Panel p = new Panel();
		p.setBackground(Color.GREEN);
		p.add(new Button("Fisrt"));
		p.add(new Button("Second"));
		p.add(new Button("Third"));
		p.add(new Button("Forth"));
		
		// ScrollPane은 종속적 컨테이너로 단 하나의 컴포넌트만 포함시킬 수 있다.
		// 크기를 늘리거나 줄이면 스크롤바가 자동 생성되는 것을 볼 수 있다.
		// 내용은 Panel안에 4개의 버튼을 포함하였고, 그 Panel을 다시 ScrollPane컨테이너에
		// 포함시켰고, 다시 ScrollPane컨테이너를 Frame컨테이너에 포함시킨 것이다.
		// 예제 11과 비교해보면 그 차이를 확연이 느낄 수 있다. 스크롤이 생기면서 화면을 줄여도 
		// 컴포넌트들을 볼 수가 있다.
		sp.add(p);
		f.add(sp);
		f.setVisible(true);

	}

}
