package sec03_exam_threadExtends;



public class BeepPrintExample {

	public static void main(String[] args) {
		 //직접 생성하는 멀티스레드로 하는 3가지 방법
		//방법1-->직접 생성
		Thread thread = new BeepThread(); //그냥 BeepThread thread = new BeepThread(); 해도 됨.

		thread.start(); 	
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
