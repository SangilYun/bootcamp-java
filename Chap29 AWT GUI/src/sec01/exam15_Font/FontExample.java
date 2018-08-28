package sec01.exam15_Font;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontExample {

	public static void main(String[] args) {
		 Frame f = new Frame("basic fonts");
		 String str = "abcdefghijklmnopqrstuvwxyz";
		 
		 //str을 갖고 Label을 생성한다.
		 Label str1 = new Label(str);
		 Label str2 = new Label(str);
		 Label str3 = new Label(str);
		 Label str4 = new Label(str);
		 Label str5 = new Label(str);
		 
		 Font f1 = new Font("Serif", Font.PLAIN, 20);	//보통체
		 Font f2 = new Font("Serif", Font.ITALIC, 20);	//기울임체
		 Font f3 = new Font("Serif", Font.BOLD, 20);	//굵은체
		 Font f4 = new Font("Serif", Font.BOLD + Font.ITALIC, 20);	//굵은 기울임체
		 Font f5 = new Font("HY견고딕", Font.PLAIN, 20);	//보통체
		 //Label에 새로운 Font를 적용한다.
		 str1.setFont(f1);
		 str2.setFont(f2);
		 str3.setFont(f3);
		 str4.setFont(f4);
		 str5.setFont(f5);

		 f.setLayout(new FlowLayout());
		 f.add(str1); f.add(str2); f.add(str3); f.add(str4); f.add(str5);
		 f.addWindowListener(new WindowAdapter(){
			 @Override
			 public void windowClosing(WindowEvent e) {
				 System.exit(0);
			 }
		 });
		 f.setSize(500, 500);
		 f.setVisible(true);
	}

}
