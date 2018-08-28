package sec02_try_catch_finally;

public class TryCatchExample01 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
//			System.out.println(4/0);
		}
		catch(Exception e) {
			System.out.println(5);	//5는 try문에서 예외가 발생하지 않아서 catch문이 출력되지 않음.
		}
		System.out.println(6);
	}

}
