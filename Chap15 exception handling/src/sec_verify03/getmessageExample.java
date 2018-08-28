package sec_verify03;

public class getmessageExample {

	public static void main(String[] args) {
		 int a = 100;
		 int b = 0;
		 
		 try {
			 @SuppressWarnings("unused")
			int result = a/b;
		 }
		 catch(Exception e){
			 System.out.println("발생 오류의 메시지를 출력합니다." + e.getMessage());
		 }
	}

}
