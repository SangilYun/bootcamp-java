package sec03.exam01_menu;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuExample {

	public static void main(String[] args) {
		 Frame f = new Frame("메뉴 예제");
		 f.setSize(300,200);
		 
		 //MenuBar를 만든다.
		 MenuBar mb = new MenuBar();
		 //Menu를 만든다.
		 Menu mFile = new Menu("파일");
		 
		//MenuItem 만들기
		 MenuItem miNew = new MenuItem("새 파일");
		 MenuItem miOpen = new MenuItem("열기");
		 
		 //MenuItem 이 아니라 Menu임에 주의
		 Menu mOthers = new Menu("기타");
		 
		 //MenuItem 만들기
		 MenuItem miExit = new MenuItem("나가기");
		 
		 mFile.add(miNew);	//Menu에 MenuItem들을 추가한다.
		 mFile.add(miOpen);

		 //Menu에 Menu를 추가하고 있는 것에 주목을 하자.
		 //계층형 메뉴를 만들고 있다.
		 mFile.add(mOthers);
		 
		 //메뉴 분리선을 넣는다.
		 mFile.addSeparator();
		 mFile.add(miExit);
		 
		 //기타 메뉴에 들어갈 MenuItem만들기
		 MenuItem miPrint = new MenuItem("출력");
		 MenuItem miPreview = new MenuItem("미리 보기");
		 MenuItem miSetup = new MenuItem("프린터 설정");		 
		 
		 //기타 메뉴에 추가
		 mOthers.add(miPrint);
		 mOthers.add(miPreview);
		 mOthers.add(miSetup);
		 
		 Menu mEdit = new Menu("편집");
		 Menu mView = new Menu("보기");
		 Menu mHelp = new Menu("도움");
		 
		 //CheckboMenuItem(String name, boolean status)
		 //name - CheckboxMenuItem에 보여질 menu이름
		 //status - 값이 true면, 체크된 상태로 생성(Checkbox 처럼 메뉴를 클릭할
		 //때마다 메뉴 앞에 체크표시가 설정되거나 해제된다.)
		 
		 CheckboxMenuItem miStatusbar = new CheckboxMenuItem("상태표시");
		 mView.add(miStatusbar);
		 
		 //MenuBarㅇ Menu를 추가한다.
		 mb.add(mFile);
		 mb.add(mEdit);
		 mb.add(mView);
		 //mb.setHelpMenu(mHelp); //mHelp를 HelpMenu로 지정한다. 
		 mb.add(mHelp);
		 
		 f.setMenuBar(mb);	//Frame에 MenuBar를 포함시킨다.
		 f.setVisible(true);
		 
		 f.addWindowListener(new WindowAdapter() {
			 @Override
			 public void windowClosing(WindowEvent e) {
				 System.exit(0);
			 };
		 });
	}

}
