package sec01.exam14_FileDialog;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialogExample {

	public static void main(String[] args) {
		 Frame f = new Frame("Parent");
		 f.setSize(300,300);
		 //mode는 기본적으로 FileDialog.Svae와 FileDialog.Load로 구성된다.
		 FileDialog fileOpen = new FileDialog(f,"파일열기", FileDialog.LOAD);
		 
		 f.setVisible(true);
		 fileOpen.setDirectory("/Users/yunsangil/Documents/computing");
		 fileOpen.setVisible(true);
		 
		 //파일을 선택한 다음, fileDialog의 열기버튼을 누르면,
		 //getFile()과 getDirectory()를 이용해서 파일이름과 위치한 디렉토리를 얻을 수 있다.
		 System.out.println(fileOpen.getDirectory() + fileOpen.getFile());
		 
		 //아래 부분은 파일을 저장하는 부분이다.
		 fileOpen = new FileDialog(f,"파일저장",FileDialog.SAVE);
		 fileOpen.setDirectory("/Users/yunsangil/Documents/computing");
		 fileOpen.setVisible(true);
		 System.out.println(fileOpen.getDirectory() + fileOpen.getFile() + "가 저장되었습니다.");
		 
		 //윈도우 이벤트 처리 부분 추가
		 f.addWindowListener(new WindowAdapter() {
			 @Override 
			 public void windowClosing(WindowEvent e) {
				 System.exit(0);
			 }
		 });
	}
}