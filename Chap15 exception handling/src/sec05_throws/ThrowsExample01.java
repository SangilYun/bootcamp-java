package sec05_throws;

public class ThrowsExample01 {

	//이렇게 호출하면 누가 예외를 잡아서 처리를 해줘야 하나? 실행순서는 어떻게 되나?
	public static void main(String[] args) {
		
//		method1(); //같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
					//예외를 받았는데 예외처리를 안해줘서 오류가 난다.
		
		try {
			method1();
		}catch(Exception e){
			System.out.println("예외처리");
		}
	}
	
	public static void method1() throws Exception{
		method2();
	}
	
	public static void method2() throws Exception{
		throw new Exception();//예외 발생 시점.
	}
}
