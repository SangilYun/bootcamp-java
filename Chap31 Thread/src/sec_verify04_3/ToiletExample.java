package sec_verify04_3;

public class ToiletExample {

	public static void main(String[] args) throws InterruptedException{
		 Toilet t = new Toilet();
		 ToiletUsingThread dad = new ToiletUsingThread(t, "아버지");
		 ToiletUsingThread daughter = new ToiletUsingThread(t, "딸");
		 ToiletUsingThread son = new ToiletUsingThread(t, "아들");
		 ToiletUsingThread mom = new ToiletUsingThread(t, "어머니");

		 dad.start();
		 son.start();
		 daughter.start();
		 mom.start();
	}
}
