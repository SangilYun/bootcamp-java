package sec05.exam01_graphics_awt_thread;

public class Main {

	public static void main(String[] args) {
		 System.out.println("프로그램 시작 스레드 : " + Thread.currentThread().getName());
		 new GraphicsExample("Graphics");

	}

}
