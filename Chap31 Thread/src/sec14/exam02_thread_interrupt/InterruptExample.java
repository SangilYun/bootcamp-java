package sec14.exam02_thread_interrupt;

import javax.swing.JOptionPane;

public class InterruptExample {

	public static void main(String[] args) {
		 
		CountThread countThread = new CountThread();
		countThread.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input +"입니다.");
		
		//interrupt()를 호출하면 , interrupted상태가 true가 된다.
		CountThread.interrupted();
		//true
		System.out.println("isInterrupted(): " + countThread.isInterrupted());
	}
}
