package sec_verify02;

public class FinallyExceptionExample {

	public static void main(String[] args) {
		 int[] num = new int[3];
		
			 try {
				 for(int i=0; i<num.length; i++) {
					 int zero = 0;
					 int ranNum = (int)(Math.random()*10);
					 num[i] = ranNum/zero;
				 }	 
			 }
			 catch(Exception e){
				 System.out.println("0으로 나누는 등의 오류");
			 }
			 finally{
				 System.out.println("이 부분은 무조건 나와요");
			 }
		 
	}
}
