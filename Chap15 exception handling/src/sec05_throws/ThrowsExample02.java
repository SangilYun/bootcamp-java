package sec05_throws;

public class ThrowsExample02 {


	public static void main(String[] args) {
		
		try {
			findClass();
			
		}
		//예외를 받아서 호출한 곳에서 처리함.
		catch(Exception e){
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		}
	}

	//ClassNotFoundException 예외를 호출한 곳으로 떠넘기고 있다.
	@SuppressWarnings("rawtypes")
	public static void findClass() throws ClassNotFoundException{

		//ClassNotFoundException가 발생가능한 일반 예외이다.
		@SuppressWarnings("unused")
		Class claszz = Class.forName("java.lang.String2"); //실제예외가 발생하는 부분
	}
}
