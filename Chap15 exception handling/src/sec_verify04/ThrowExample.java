package sec_verify04;

public class ThrowExample {

	public static void main(String[] args) {
		 int a = 100;
		 int b = 0;
		 int result=0;
		 
		 try {	
			if(b ==0) {
				throw new Exception("발생오류 ==> ");
			}
			else {
				result = a/b;
			}
		 }
		 catch(Exception e){
			 System.out.println(e.getMessage() + "0으로 나눌 수 없습니다.");
		 }
		 System.out.println(result);
	}

}
