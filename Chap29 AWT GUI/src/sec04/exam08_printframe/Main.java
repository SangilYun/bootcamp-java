package sec04.exam08_printframe;

import java.awt.Graphics;

public class Main {

	public static void main(String[] args) {

		PaintFrame paintFrame=new PaintFrame("PaintFrame");
		Graphics graphics=paintFrame.getGraphics();
		
		for(int i=0;true;i+=paintFrame.speed) {
			//아래와 같이 정지를 하지 않으면 화면이 계속 클리어되어 보이지가 않는다.
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
			
			graphics.clearRect(0, 0, 300, 300);
//			graphics.clearRect(0,0,1,1); //좌측과 클리어를 하면 어떤현상?
			
			System.out.println("스크롤바의 값 : " + paintFrame.speed+"i값 : "+i);
			graphics.drawString("hello", i, 150);
			
			i=(i<300)?i:0;
			//i=(i<10000)?i:0;
			//i=(i<50)?i:0;
		}
		

	}

}
