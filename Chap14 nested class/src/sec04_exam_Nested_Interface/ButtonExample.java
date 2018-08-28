package sec04_exam_Nested_Interface;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btn = new Button();
		CallListener cl = new CallListener();
		MessageListener ml = new MessageListener();
		
		//setONClickListener()의 매개변수가 무엇인가? 바로 인터페이스이다.
		//그럼 매개변수로 무엇을 넘겨야 하나?
		btn.setOnClickListener(new CallListener());
		btn.touch();
//		btn.setOnClickListener(null); //null하면 null도 참조변수기 때문
//		btn.touch();				//입력을 허용을 하지만 컴파일하면 .touch()를 실행할 
										//객체가 없어서 오류남.
		btn.setOnClickListener(cl);
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		btn.setOnClickListener(ml);
		btn.touch();

	}

}
