package sec_verify07_1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class BingoGame extends Frame{

	Button b;
	public BingoGame(String s) {
		super(s);
		String[][] items = {
				{"참새", "두루미", "황새", "비둘기", "까오기"},
				{"오리", "타조", "부엉이", "올빼미", "뱁새"},
				{"꿩", "닭", "구관조", "잉꼬", "매"},
				{"거위", "독수리", "콘돌", "봉황", "공작"},
				{"까치", "까마귀", "앵무새","꾀꼬리", "고니"}		
		};
		this.setSize(400, 400);
		this.setLayout(new GridLayout(5,5));

		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++ ) {
				b = new Button(items[i][j]);
				this.add(b);
				b.addActionListener(new buttonHandler());
			}
		}
		this.addWindowListener(new WindowEventHandler());
		this.setVisible(true);
	}
	class WindowEventHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("종료");
			e.getWindow().setVisible(false);	//화면 숨기기(메모리 제거 안됨)
			e.getWindow().dispose(); 	//메모리 정리
			System.exit(0); 	//프로그램 종료
		}
	}
	
	class buttonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Button a= (Button) e.getSource();
			a.setBackground(Color.GRAY);
			System.out.println(a.getLabel());
		}
	}
}
