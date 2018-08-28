package sec01_exam_contentSender;

public class SenderExample {

	public static void main(String[] args) {
		//추상클래스는 인스턴스를 절대로 생성을 하지 못한다.
		//ContentSender cs = new ContentSender(); //예외발생 이유?
		
		//추상클래스도 조상이기 때문에 다형성이 적용이 될 수 있다.
		//단, 조상클래스 선언된 추상메서드를 다 구현한 자손클래스만 대입이 가능하다.
		ContentSender cs = new letterSender("SMS문자", "김우진", "4달라");
		cs.sendMsg("신은혁");
		System.out.println();
		
		letterSender ls = new letterSender("SMS문자", "사공수기", "반가워 현지야");
		kakaoSender ks = new kakaoSender("카카오톡", "이재훈", "반가워 카카오톡이야");
		
		//조상클래스의 추상메서드를 오버라이딩한 메서드 호출, 각기 다른 결과를 보여줌
		ls.sendMsg("그녀");
		System.out.println();
		ks.sendMsg("김현지");
		

	}

}
