package sec01.exam15_Font;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class FontListExample {

	public static void main(String[] args) {
		 //GraphicsEnvironment 객체는 GraphicsDevice 객체 및 폰트 객체를 포함하고 있는 클래스
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		//모든 폰트를 다 가져온다.
		Font[] fonts = ge.getAllFonts();
		
		//모든 폰트출력
		for(int i=0; i<fonts.length; i++) {
			System.out.println(fonts[i].getFontName());
		}
	}
}
