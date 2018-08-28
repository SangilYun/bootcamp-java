package sec02_exam;

public class CallStackExample {

	public static void main(String[] args) {
		
		System.out.println("main()");
		//static은 static만 부를 수 있다.
		CallStackExample.firstMethod();
		System.out.println("main()을 끝냅니다.");
	}
	
	static void firstMethod() {
		System.out.println("firstmethod()");
		//static은 static만 부를 수 있다.
		CallStackExample.secondMethod();
		System.out.println("main()으로 돌아갑니다.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
		System.out.println("firstMethod()로 돌아갑니다.");
	}

}
