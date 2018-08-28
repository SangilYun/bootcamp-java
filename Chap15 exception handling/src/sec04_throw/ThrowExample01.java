package sec04_throw;

public class ThrowExample01 {

	public static void main(String[] args) {
		
		try {
			throw new Exception("고의로 발생시켰음.");
		}
		//Exception 클래스는 모든 예외의 조상이므로 어떤 예외도 다 받을 수 있다.
		catch(Exception e) {
			//간단히 출력
			System.out.println("에러 메세지 : " + e.getMessage());
			//스택 메모리에 있는 내용까지 출력(개발용)
			//예외의 발생 경로를 추적
			e.printStackTrace(); 
		}
		System.out.println("프로그램이 정상 종료 되었음.");
	}

}
