package sec01.exam01_frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameExample02 {

	public static void main(String[] args) {
		 //앞선 예제에서는 프레임이 좌측상단에 위치했지만 지금은 중간에 위치를 시켜보는 예제.
		Frame f = new Frame("Login");
		f.setSize(300,200);
		
		//구현된 Toolkit객체를 얻는다.
		Toolkit tk = Toolkit.getDefaultToolkit();
		//화면의 크기를 구한다. 
		Dimension screenSize = tk.getScreenSize();
		
		//화면크기의 절반값에서 Frame크기의 절반값을 뺀 위치로 하면
		//Frame이 화면 가운데 위치하게 된다. 
		//150, 100을 빼는 이유는 프레임의 사이즈의 절반을 뺀것이다.
		f.setLocation(screenSize.width/2-150, screenSize.height/2-100);
		f.setVisible(true);	//생생한 Frame을 화면에 보이도록 한다. 

	}

}
