package sec02_try_catch_finally;

public class TryCatchFinallyExample01 {
										//) {사이에 throws Exception 을 쓸 수도 있다.
	public static void main(String[] args) {
		 //Class클래스는 문자열을 갖고 클래스로 만들어서 반환해준다.
		//(인스턴스를 사용할 수 있지만, 반환된 인스턴스의 정보만 알 뿐이다.)
		//하지만, 문자열에 해당하는 클래스가 없다면 일반 예외가 발생한다.
		//그래서 컴파일이 되지 않는다. 즉 다시말해 예외처리가 피수적이다.
		try {
			@SuppressWarnings("rawtypes")
			Class clazz = Class.forName("java.lang.String2");
			//Class clazz = class.forName("java.lang.String");
			System.out.println("클래스를 찾았습니다.");
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
		}
		//예외는 발생했으나 정상종료 됨을 알수가 있다.
		catch(ClassNotFoundException e) {	//좀 더 포괄적으로 할려면 Exception만 쓰면됨. 다형성개념 때문에.
			System.out.println("클래스가 존재하지 않습니다.");
		}
		finally {
			System.out.println("프로그램을 안전하게 종료합니다.");
		}

	}

}
