package sec02_exam_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		 String subject = "자바 프로그래밍";
		 int location = subject.indexOf("프로그래밍"); //"프"가 시작되는 위치를 리턴
		 
		 System.out.println(location);
		 
		 //찾기 기능 할 때 자주 쓰인다.(사전이나 문서 등)
		 //"자바"를 포함하고 있는지를 확인할 때 쓰이는 코드
		 
		 if(subject.indexOf("자바") != -1)
			 System.out.println("자바와 관련된 책이군요");
		 else
			 System.out.println("자바와 관련된 책이 없군요");

	}

}
