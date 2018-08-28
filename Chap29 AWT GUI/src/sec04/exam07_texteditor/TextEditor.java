package sec04.exam07_texteditor;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class TextEditor extends Frame{

	String fileName;
	TextArea content;
	MenuBar mb;
	Menu mFile;
	MenuItem miNew, miOpen, miSaveAs, miExit;
	
	
	public TextEditor(String s) {
		super(s);
	}
	
	public void showTexteditor() {
		this.content = new TextArea();
		this.add(this.content);
		
		//메뉴바와 메뉴 및 메뉴 아이템 생성
		this.mb = new MenuBar();
		this.mFile = new Menu("파일");
		this.miNew=new MenuItem("새 문서");
		this.miOpen=new MenuItem("열기");
		this.miSaveAs=new MenuItem("다른 이름으로 저장");
		this.miExit=new MenuItem("종료");
		//메뉴바에다가 메뉴 아이템 부착
		this.mFile.add(miNew);
		this.mFile.add(miOpen);
		this.mFile.add(miSaveAs);
		this.mFile.addSeparator();		//메뉴 분리선
		this.mFile.add(miExit);
		//메뉴바에 메뉴 추가 
		this.mb.add(mFile);
		//Frame에 MenuBar를 포함시킨다.
		this.setMenuBar(mb);
		
		//메뉴에 이벤트 핸들러를 리스너에 등록한다. 
		MyHandler handler=new MyHandler();
		this.miNew.addActionListener(handler);
		this.miOpen.addActionListener(handler);
		this.miSaveAs.addActionListener(handler);
		this.miExit.addActionListener(handler);
		this.addWindowListener(handler.wa);
		this.setSize(400,500);
		this.setLocation(new Point(300,300));
		this.setVisible(true);
	}
	//선택된 파일의 내용을 읽어서 TextArea에 보여주는 메서드
	//아래와 같은 것을 좀더 많은 기능으로 향상 시키면 메모장 정도의 수준으로 프로그램이 될 것이다. 
	
	public void fileOpen(String fileName) {
		FileReader fr = null;
		BufferedReader br = null;
		StringWriter sw = null;
		
		try {
			//InputStreamReader의 하위클래스인 FileReader클래스를 주스트림으로 설정
			fr=new FileReader(fileName);
			//InputStream(문자)보조스트림인 BufferReader(성능향상스트림)을 부착시킴
			br=new BufferedReader(fr);
			sw=new StringWriter();
			int ch=0;
			//파일을 다 읽게 되면 -1을 리턴한다.
			while((ch=br.read())!=-1) {
				sw.write(ch);
			}
			br.close();
			content.setText(sw.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//FileOpen메서드의
	
	//TextArea의 내용을 지정된 파일에 저장하는 메서드
	public void saveAs(String fileName) {
	
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			//OutputStreamWriter의 하위클래스인 FileWriter클래스를 주스트림으로 설정
			fw=new FileWriter(fileName);
			//OutputStream(문자) 보조스트림은 BufferWriter을 부착시킴(성능향상스트림)
			bw=new BufferedWriter(fw);
			//TextArea의 내용을 파일에 저장한다.
			bw.write(content.getText());
			bw.close();
		}catch(IOException e) {e.printStackTrace();}
	}
	//메뉴를 클릭했을 때 메뉴별 처리코드
	class MyHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if(command.equals("새 문서")) {
				content.selectAll();
				content.setText("");
			}
			else if(command.equals("열기")) {
				FileDialog fileOpen = new FileDialog(TextEditor.this, "파일열기"
						, FileDialog.LOAD);
				fileOpen.setVisible(true);
				fileName = fileOpen.getDirectory() + fileOpen.getFile();
				System.out.println(fileName);
				//선택된 파일의 내용을 TextArea에 보여준다. 
				fileOpen(fileName);
			}
			else if(command.equals("다른 이름으로 저장")) {
				FileDialog fileSave=new FileDialog(TextEditor.this,"파일저장"
						,FileDialog.SAVE);
				fileSave.setVisible(true);
				fileName=fileSave.getDirectory() + fileSave.getFile();
				System.out.println(fileName);
				//현재 TextArea의 내용을 선택된 파일에 저장한다.
				saveAs(fileName);
			}
			else if(command.equals("종료")) {
				System.exit(0);
			}
		}
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
	}
}
