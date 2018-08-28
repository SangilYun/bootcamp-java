package sec04.exam01_frame_windowevent;

import java.awt.Frame;


public class FrameWindowEventExample {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(300,200);
		f.setLocation(500, 500);
		
		//이 프레임의 이벤트가 발생하면 처리할 EventHandler클래스를 생성하여
		//리스너에 등록하고 있다. 리스너가 무엇인가? 듣는 것이다. 즉 이벤트를 감지하고 
		//있는 것이다.
		
		f.addWindowListener(new EventHandler());
		f.setVisible(true);
		
		//실행과정을 글로써 표현하자면,
		//일단 사용자가 닫기버튼을 눌렀을때,
		//1.WindowEvent가 발생하고 (WindowListener 인스턴스가 생성),
		//2.Frame에 WindowListener로 등록되어 있는 이벤트 핸들러의 
		//windowClosing메서드를 호출한다. 이 메서드 내에서는 이벤트
		//발생시 생성된 WindowEvent인스턴스의 참조를 얻어 사용할 수 있어서,
		//WindowsEvent인스턴스의 메서드들을 사용할 수 있는 것이다. 
	}
}
