package sec03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) throws Exception{
		 //여기 들어가는 매개값에 따라 실행되는 메서드가 달라짐에 주목하자.
		//Class clazz = Class.forName("java.lang.String");
		
		//SendAction 객체생성
		Class clazz = Class.forName("sec03_newinstance.SendAction"); //동적 객체 생성
		
		//String str = (String)clazz.newInstance();	//object타입으로 리턴된걸 강제 casting
		//str = "스트링 타입";
		//System.out.println(str);
		
		//ReceiveAction 객체생성
		//Class clazz = Class.forName("sec03_newinstance.ReceiveAction");
		
		//Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");
		
		//인터페이스타입으로 강제형변환(다형성)
		Action action = (Action)clazz.newInstance();
//		Object obj  clazz.newInstance();
//		Action action1 = (Action)obj;
		
		action.execute(); //생성된 동적객체의 오버라이딩 된 메서드 호출
		//action.execute();
	}

}
