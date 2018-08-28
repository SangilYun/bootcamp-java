package sec03.exam01_menu;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopupMenuExample {

	public static void main(String[] args) {
		 Frame f = new Frame("PopupMenu Example");
		 f.setSize(300,200);
		 
		 PopupMenu pMenu = new PopupMenu("편집");
		 MenuItem miCut = new MenuItem("잘라내기");
		 MenuItem miCopy = new MenuItem("복사하기");
		 MenuItem miPaste = new MenuItem("붙여넣기");
		 
		 //Popup메뉴에 MenuItem들을 추가한다.
		 pMenu.add(miCut);
		 pMenu.add(miCopy);
		 pMenu.add(miPaste);
		 //PopupMenu를 frame에 추가한다.
		 f.add(pMenu);
		 //닫기 이벤츠 처리
		 
		 f.addWindowListener(new WindowAdapter() {
			 @Override
			 public void windowClosing(WindowEvent e) {
				 System.exit(0);
			 }
		 });
		 
		 //프레임에 이벤트 처리를 위해서 리스너를 추가하였다.
		 //마우스 어댑터 클래스를 추가하여 오버라이딩을 하는 익명 자식 객첼르 만들고 있다.
		 
		 f.addMouseListener(new MouseAdapter() {
			 @Override
			 public void mousePressed(MouseEvent e) {
				 //오른쪽 마우스버튼을 누르는 경우에만 PopupMenu를 화면에 보여준다.
				 //BUTTON1 - left, 2 - wheel, 3-right
				 if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					 pMenu.show(f,e.getX(),e.getY());
					 System.out.println("마우스포인터 x좌표 : "+e.getX()
					 + "마우스포인터 y좌표 : " + e.getY());
				 }
			 }
		 });	 
		 f.setVisible(true);	 
	}
}
